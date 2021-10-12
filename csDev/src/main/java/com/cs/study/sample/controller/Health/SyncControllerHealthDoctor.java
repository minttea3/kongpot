package com.cs.study.sample.controller.Health;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.HealthDoctor26Service;
import com.cs.study.sample.service.HealthKnowledge23Service;
import com.cs.study.sample.service.HealthNews25Service;
import com.cs.study.sample.service.Member1Service;
import com.cs.study.sample.vo.HealthDoctor26VO;
import com.cs.study.sample.vo.HealthKnowledge23VO;
import com.cs.study.sample.vo.HealthNews25VO;
import com.cs.study.sample.vo.Member1VO;
import org.apache.commons.lang3.StringUtils;

@Controller
public class SyncControllerHealthDoctor {

	
	  private final HealthDoctor26Service healthDoctor26Service;
	  
	  public SyncControllerHealthDoctor(HealthDoctor26Service healthDoctor26Service) {
		this.healthDoctor26Service = healthDoctor26Service;
	  }
	 
	 
	@GetMapping("/healthDoctorList")
	public String healthKnowledgeList(Model model, HealthDoctor26VO healthDoctor26VO ) {

		List<HealthDoctor26VO> healthDoctorList = healthDoctor26Service.healthDoctorList(healthDoctor26VO);
		  model.addAttribute("healthDoctorList",healthDoctorList);
		  model.addAttribute("healthDoctor26VO",healthDoctor26VO);
		 
		return "sample/health/healthDoctorList";
	}
	
	 @GetMapping("/syncHealthDoctorForm")
	 public String syncSampleForm(Model model, HealthDoctor26VO healthDoctor26VO){
		  
		  if (!StringUtils.isEmpty( healthDoctor26VO.getHdIdx() )){
			  
			  HealthDoctor26VO healthDoctorSelectOne = healthDoctor26Service.healthDoctorSelectOne(healthDoctor26VO);
			  model.addAttribute("healthDoctor26VO", healthDoctorSelectOne); 
		  }
	  
	  return "sample/health/syncHealthDoctorForm"; 
	  }
	 
	 @PostMapping("/syncHealthDoctorFormSave")
	 public String syncSampleFormSave(Model model, HealthDoctor26VO healthDoctor26VO, @RequestParam(value="action", required=true) String action){
       if ( "insert".equals(action) ){
           int insertCnt = healthDoctor26Service.insertHealthDoctor(healthDoctor26VO);
       }else if ( "update".equals(action) ){
           int updateCnt = healthDoctor26Service.updateHealthDoctor(healthDoctor26VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = healthDoctor26Service.deleteHealthDoctor(healthDoctor26VO);
       }
       return "redirect:/healthDoctorList";
	 }
}
