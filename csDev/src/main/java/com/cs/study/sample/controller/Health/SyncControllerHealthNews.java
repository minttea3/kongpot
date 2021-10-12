package com.cs.study.sample.controller.Health;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.HealthKnowledge23Service;
import com.cs.study.sample.service.HealthNews25Service;
import com.cs.study.sample.service.Member1Service;
import com.cs.study.sample.vo.HealthKnowledge23VO;
import com.cs.study.sample.vo.HealthNews25VO;
import com.cs.study.sample.vo.Member1VO;
import org.apache.commons.lang3.StringUtils;

@Controller
public class SyncControllerHealthNews {

	
	  private final HealthNews25Service healthNews25Service;
	  
	  public SyncControllerHealthNews(HealthNews25Service healthNews25Service) {
		this.healthNews25Service = healthNews25Service;
	  }
	 
	 
	@GetMapping("/healthNewsList")
	public String healthKnowledgeList(Model model, HealthNews25VO healthNews25VO ) {

		List<HealthNews25VO> healthNewsList = healthNews25Service.healthNewsList(healthNews25VO);
		  model.addAttribute("healthNewsList",healthNewsList);
		  model.addAttribute("healthNews25VO",healthNews25VO);
		 
		return "sample/health/healthNewsList";
	}
	
	 @GetMapping("/syncHealthNewsForm")
	 public String syncSampleForm(Model model, HealthNews25VO healthNews25VO){
		  
		  if (!StringUtils.isEmpty( healthNews25VO.getHnIdx() )){
			  
			  HealthNews25VO healthNewsSelectOne = healthNews25Service.healthNewsSelectOne(healthNews25VO);
			  model.addAttribute("healthNews25VO", healthNewsSelectOne); 
		  }
	  
	  return "sample/health/syncHealthNewsForm"; 
	  }
	 
	 @PostMapping("/syncHealthNewsFormSave")
	 public String syncSampleFormSave(Model model, HealthNews25VO healthNews25VO, @RequestParam(value="action", required=true) String action){
       if ( "insert".equals(action) ){
           int insertCnt = healthNews25Service.insertHealthNews(healthNews25VO);
       }else if ( "update".equals(action) ){
           int updateCnt = healthNews25Service.updateHealthNews(healthNews25VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = healthNews25Service.deleteHealthNews(healthNews25VO);
       }
       return "redirect:/healthNewsList";
	 }
}
