package com.cs.study.sample.controller.studyCertificate;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.StudyCertificateQnA16Service;
import com.cs.study.sample.vo.StudyCertificateQnA16VO;

@Controller
public class SyncControllerStudyCertificateQnA {

	
	  private final StudyCertificateQnA16Service studyCertificateQnA16Service;
	  
	  public SyncControllerStudyCertificateQnA(StudyCertificateQnA16Service studyCertificateQnA16Service) {
		this.studyCertificateQnA16Service = studyCertificateQnA16Service;
	  }
	 
	 
	@GetMapping("/studyCertificateQnAList")
	public String studyCertificateQnAList(Model model, StudyCertificateQnA16VO studyCertificateQnA16VO) {
		
		List<StudyCertificateQnA16VO> studyCertificateQnAList=studyCertificateQnA16Service.studyCertificateQnAList(studyCertificateQnA16VO);
		model.addAttribute("studyCertificateQnAList",studyCertificateQnAList);
		model.addAttribute("studyCertificateQnA16VO",studyCertificateQnA16VO);
		 
		return "sample/studyCertificate/studyCertificateQnAList";
	}
	
	 @GetMapping("/syncStudyCertificateQnAForm") 
	 public String syncStudyCertificateQnAForm(Model model, StudyCertificateQnA16VO studyCertificateQnA16VO){
		  
		  if (!StringUtils.isEmpty( studyCertificateQnA16VO.getScqIdx() )){
			  
			  StudyCertificateQnA16VO studyCertificateRelatedInfoSelectOne = studyCertificateQnA16Service.studyCertifiscteQnASelectOne(studyCertificateQnA16VO);
			  model.addAttribute("studyCertificateQnA16VO", studyCertificateRelatedInfoSelectOne); 
		  }
	  
	  return "sample/studyCertificate/syncStudyCertificateQnAForm"; 
	  }
	 
	 @PostMapping("/syncStudyCertificateQnAFormSave")
	 public String syncStudyCertificateQnAFormSave(Model model, StudyCertificateQnA16VO studyCertificateQnA16VO, @RequestParam(value="action", required=true) String action){
       if ( "insert".equals(action) ){
           int insertCnt = studyCertificateQnA16Service.insertStudyCertificateQnA(studyCertificateQnA16VO);
       }else if ( "update".equals(action) ){
           int updateCnt = studyCertificateQnA16Service.updateStudyCertificateQnA(studyCertificateQnA16VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = studyCertificateQnA16Service.deleteStudyCertificateQnA(studyCertificateQnA16VO);
       }
       return "redirect:/studyCertificateQnAList";
	 }
}
