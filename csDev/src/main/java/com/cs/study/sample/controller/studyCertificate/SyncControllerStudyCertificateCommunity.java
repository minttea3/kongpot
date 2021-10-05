package com.cs.study.sample.controller.studyCertificate;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.StudyCertificateCommunity17Service;
import com.cs.study.sample.vo.StudyCertificateCommunity17VO;
import com.cs.study.sample.vo.StudyCertificateNews15VO;

@Controller
public class SyncControllerStudyCertificateCommunity {

	
	  private final StudyCertificateCommunity17Service studyCertificateCommunity17Service;
	  
	  public SyncControllerStudyCertificateCommunity(StudyCertificateCommunity17Service studyCertificateCommunity17Service) {
		this.studyCertificateCommunity17Service = studyCertificateCommunity17Service;
	  }
	 
	 
	@GetMapping("/studyCertificateCommunityList")
	public String studyCertificateNewsList(Model model, StudyCertificateCommunity17VO studyCertificateCommunity17VO) {
		
		List<StudyCertificateCommunity17VO> studyCertificateCommunityList=studyCertificateCommunity17Service.studyCertificateCommunityList(studyCertificateCommunity17VO);
		model.addAttribute("studyCertificateCommunityList",studyCertificateCommunityList);
		model.addAttribute("studyCertificateCommunity17VO",studyCertificateCommunity17VO);
		 
		return "sample/studyCertificate/studyCertificateCommunityList";
	}
	
	 @GetMapping("/syncStudyCertificateCommunityForm") 
	 public String syncStudyCertificateNewsForm(Model model, StudyCertificateCommunity17VO StudyCertificateCommunity17VO){
		  
		  if (!StringUtils.isEmpty( StudyCertificateCommunity17VO.getSccIdx() )){
			  
			  StudyCertificateCommunity17VO studyCertificateCommunitySelectOne = studyCertificateCommunity17Service.studyCertificateCommunitySelectOne(StudyCertificateCommunity17VO);
			  model.addAttribute("StudyCertificateCommunity17VO", studyCertificateCommunitySelectOne); 
		  }
	  
	  return "sample/studyCertificate/syncStudyCertificateCommunityForm"; 
	  }
	 
	 @PostMapping("/syncStudyCertificateCommunityFormSave")
	 public String syncStudyCertificateNewsFormSave(Model model, StudyCertificateCommunity17VO StudyCertificateCommunity17VO, @RequestParam(value="action", required=true) String action){
       if ( "insert".equals(action) ){
           int insertCnt = studyCertificateCommunity17Service.insertStudyCertificateCommunity(StudyCertificateCommunity17VO);
       }else if ( "update".equals(action) ){
           int updateCnt = studyCertificateCommunity17Service.updateStudyCertificateCommunity(StudyCertificateCommunity17VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = studyCertificateCommunity17Service.deleteStudyCertificateCommunity(StudyCertificateCommunity17VO);
       }
       return "redirect:/studyCertificateCommunityList";
	 }
}
