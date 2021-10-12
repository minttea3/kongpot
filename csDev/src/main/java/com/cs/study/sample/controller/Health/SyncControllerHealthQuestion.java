package com.cs.study.sample.controller.Health;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.mapper.HealthQuestion24Mapper;
import com.cs.study.sample.service.HealthKnowledge23Service;
import com.cs.study.sample.service.HealthQuestion24Service;
import com.cs.study.sample.service.Member1Service;
import com.cs.study.sample.vo.HealthKnowledge23VO;
import com.cs.study.sample.vo.HealthQuestion24VO;
import com.cs.study.sample.vo.Member1VO;
import org.apache.commons.lang3.StringUtils;

@Controller
public class SyncControllerHealthQuestion {

	
	  private final HealthQuestion24Service healthQuestion24Service;
	  
	  public SyncControllerHealthQuestion(HealthQuestion24Service healthQuestion24Service) {
		this.healthQuestion24Service = healthQuestion24Service;
	  }
	 
	 
	@GetMapping("/healthQuestionList")
	public String healthKnowledgeList(Model model, HealthQuestion24VO healthQuestion24VO ) {

		List<HealthQuestion24VO> healthQuestionList = healthQuestion24Service.healthQuestionList(healthQuestion24VO);
		  model.addAttribute("healthQuestionList",healthQuestionList);
		  model.addAttribute("healthQuestion24VO",healthQuestion24VO);
		 
		return "sample/health/healthQuestionList";
	}
	
	 @GetMapping("/syncHealthQuestionForm")
	 public String syncSampleForm(Model model, HealthQuestion24VO healthQuestion24VO){
		  
		  if (!StringUtils.isEmpty( healthQuestion24VO.getHqIdx() )){
			  
			  HealthQuestion24VO healthQuestionSelectOne = healthQuestion24Service.healthQuestionSelectOne(healthQuestion24VO);
			  model.addAttribute("healthQuestion24VO", healthQuestionSelectOne); 
		  }
	  
	  return "sample/health/syncHealthQuestionForm"; 
	  }
	 
	 @PostMapping("/syncHealthQuestionFormSave")
	 public String syncSampleFormSave(Model model, HealthQuestion24VO healthQuestion24VO, @RequestParam(value="action", required=true) String action){
       if ( "insert".equals(action) ){
           int insertCnt = healthQuestion24Service.insertHealthQuestion(healthQuestion24VO);
       }else if ( "update".equals(action) ){
           int updateCnt = healthQuestion24Service.updateHealthQuestion(healthQuestion24VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = healthQuestion24Service.deleteHealthQuestion(healthQuestion24VO);
       }
       return "redirect:/healthQuestionList";
	 }
}
