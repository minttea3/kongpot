package com.cs.study.sample.controller.Health;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.HealthKnowledge23Service;
import com.cs.study.sample.service.Member1Service;
import com.cs.study.sample.vo.HealthKnowledge23VO;
import com.cs.study.sample.vo.Member1VO;
import org.apache.commons.lang3.StringUtils;

@Controller
public class SyncControllerHealthKonwledge {

	
	  private final HealthKnowledge23Service healthKnowledge23Service;
	  
	  public SyncControllerHealthKonwledge(HealthKnowledge23Service healthKnowledge23Service) {
		this.healthKnowledge23Service = healthKnowledge23Service;
	  }
	 
	 
	@GetMapping("/healthKnowledgeList")
	public String healthKnowledgeList(Model model, HealthKnowledge23VO healthKnowledge23VO ) {

		List<HealthKnowledge23VO> healthKnowledgeList = healthKnowledge23Service.healthKnowledgeList(healthKnowledge23VO);
		  model.addAttribute("healthKnowledgeList",healthKnowledgeList);
		  model.addAttribute("healthKnowledge23VO",healthKnowledge23VO);
		 
		return "sample/health/healthKnowledgeList";
	}
	
	 @GetMapping("/syncHealthKnowledgeForm")
	 public String syncSampleForm(Model model, HealthKnowledge23VO healthKnowledge23VO){
		  
		  if (!StringUtils.isEmpty( healthKnowledge23VO.getHkIdx() )){
			  
			  HealthKnowledge23VO healthKnowledgeSelectOne = healthKnowledge23Service.healthKnowledgeSelectOne(healthKnowledge23VO);
			  model.addAttribute("healthKnowledge23VO", healthKnowledgeSelectOne); 
		  }
	  
	  return "sample/health/syncHealthKnowledgeForm"; 
	  }
	 
	 @PostMapping("/syncHealthKnowledgeFormSave")
	 public String syncSampleFormSave(Model model, HealthKnowledge23VO healthKnowledge23VO, @RequestParam(value="action", required=true) String action){
       if ( "insert".equals(action) ){
           int insertCnt = healthKnowledge23Service.insertHealthKnowledge(healthKnowledge23VO);
       }else if ( "update".equals(action) ){
           int updateCnt = healthKnowledge23Service.updateHealthKnowledge(healthKnowledge23VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = healthKnowledge23Service.deleteHealthKnowledge(healthKnowledge23VO);
       }
       return "redirect:/healthKnowledgeList";
	 }
}
