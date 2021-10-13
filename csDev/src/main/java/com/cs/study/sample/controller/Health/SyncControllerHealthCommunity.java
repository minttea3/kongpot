package com.cs.study.sample.controller.Health;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.HealthCommunity27Service;
import com.cs.study.sample.service.HealthCommunityComment28Service;
import com.cs.study.sample.service.HealthDoctor26Service;
import com.cs.study.sample.service.HealthKnowledge23Service;
import com.cs.study.sample.service.HealthNews25Service;
import com.cs.study.sample.service.Member1Service;
import com.cs.study.sample.vo.HealthCommunity27VO;
import com.cs.study.sample.vo.HealthCommunityComment28VO;
import com.cs.study.sample.vo.HealthDoctor26VO;
import com.cs.study.sample.vo.HealthKnowledge23VO;
import com.cs.study.sample.vo.HealthNews25VO;
import com.cs.study.sample.vo.Member1VO;
import org.apache.commons.lang3.StringUtils;

@Controller
public class SyncControllerHealthCommunity {

	
	  private final HealthCommunity27Service healthCommunity27Service;
	  private final HealthCommunityComment28Service healthCommunityComment28Service;
	  
	  public SyncControllerHealthCommunity(HealthCommunity27Service healthCommunity27Service, HealthCommunityComment28Service healthCommunityComment28Service) {
		this.healthCommunity27Service = healthCommunity27Service;
		this.healthCommunityComment28Service = healthCommunityComment28Service;
	  }
	 
	 
	@GetMapping("/healthCommunityList")
	public String healthKnowledgeList(Model model, HealthCommunity27VO healthCommunity27VO, HealthCommunityComment28VO healthCommunityComment28VO ) {
		// 커뮤니티 리스트
		List<HealthCommunity27VO> healthCommunityList = healthCommunity27Service.healthCommunityList(healthCommunity27VO);
		  model.addAttribute("healthCommunityList",healthCommunityList);
		  model.addAttribute("healthCommunity27VO",healthCommunity27VO);
		 
		 // 댓글 리스트
			  List<HealthCommunityComment28VO> healthCommunityCommentList = healthCommunityComment28Service.healthCommunityCommentList(healthCommunityComment28VO);
			  model.addAttribute("healthCommunityCommentList",healthCommunityCommentList);
		return "sample/health/healthCommunityList";
	}
	
	 @GetMapping("/syncHealthCommunityForm")
	 public String syncSampleForm(Model model, HealthCommunity27VO healthCommunity27VO,HealthCommunityComment28VO healthCommunityComment28VO){
		  
		  if (!StringUtils.isEmpty( healthCommunity27VO.getHcIdx() )){
			  
			  HealthCommunity27VO healthCommunitySelectOne = healthCommunity27Service.healthCommunitySelectOne(healthCommunity27VO);
			  model.addAttribute("healthCommunity27VO", healthCommunitySelectOne); 
		  }
		  if (!StringUtils.isEmpty( healthCommunityComment28VO.getHcIdx() )){
			  List<HealthCommunityComment28VO> healthCommunityCommentSelectOne = healthCommunityComment28Service.healthCommunityCommentSelectOne(healthCommunityComment28VO);
			  model.addAttribute("healthCommunityCommentSelectOne", healthCommunityCommentSelectOne); 
		  }
	  return "sample/health/syncHealthCommunityForm"; 
	  }
	 
	 @PostMapping("/syncHealthCommunityFormSave")
	 public String syncSampleFormSave(Model model, HealthCommunity27VO healthCommunity27VO, HealthCommunityComment28VO healthCommunityComment28VO,@RequestParam(value="action", required=true) String action){
       System.out.println("----------");
       System.out.println("----------");
       System.out.println("hccName:::"+healthCommunityComment28VO.getHccName());
       System.out.println("----------");
		 
	  if ( "insert".equals(action) ){
           int insertCnt = healthCommunity27Service.insertHealthCommunity(healthCommunity27VO);
       }else if ( "update".equals(action) ){
           int updateCnt = healthCommunity27Service.updateHealthCommunity(healthCommunity27VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = healthCommunity27Service.deleteHealthCommunity(healthCommunity27VO);
           //댓글 삭제
           int deleteC = healthCommunityComment28Service.deleteHealthCommunityComment(healthCommunityComment28VO);
       }else if("insertComment".equals(action)) {
    	   // 댓글 등록
    	   int insertComment = healthCommunityComment28Service.insertHealthCommunityComment(healthCommunityComment28VO);
       }
       return "redirect:/healthCommunityList";
	 }
}
