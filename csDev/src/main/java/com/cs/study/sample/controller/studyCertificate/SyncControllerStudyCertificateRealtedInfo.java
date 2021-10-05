package com.cs.study.sample.controller.studyCertificate;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.Member1Service;
import com.cs.study.sample.service.StudyCertificateNotice12Service;
import com.cs.study.sample.service.StudyCertificateRealtedInfo14Service;
import com.cs.study.sample.vo.Member1VO;
import com.cs.study.sample.vo.StudyCertificateNotice12VO;
import com.cs.study.sample.vo.StudyCertificateRelatedInfo14VO;

import org.apache.commons.lang3.StringUtils;

@Controller
public class SyncControllerStudyCertificateRealtedInfo {

	
	  private final StudyCertificateRealtedInfo14Service studyCertificateRealtedInfo14Service;
	  
	  public SyncControllerStudyCertificateRealtedInfo(StudyCertificateRealtedInfo14Service studyCertificateRealtedInfo14Service) {
		this.studyCertificateRealtedInfo14Service = studyCertificateRealtedInfo14Service;
	  }
	 
	 
	@GetMapping("/studyCertificateTestRealtedInfoList")
	public String syncSampleList(Model model, StudyCertificateRelatedInfo14VO studyCertificateRelatedInfo14VO) {
		
		  List<StudyCertificateRelatedInfo14VO> studyCertificateRelatedInfoList = studyCertificateRealtedInfo14Service.studyCertificateRelatedInfoList(studyCertificateRelatedInfo14VO);
		  model.addAttribute("studyCertificateRelatedInfoList",studyCertificateRelatedInfoList);
		  model.addAttribute("studyCertificateRelatedInfo14VO",studyCertificateRelatedInfo14VO);
		 
		return "sample/studyCertificate/studyCertificateTestRealtedInfoList";
	}
	
	 @GetMapping("/syncStudyCertificateTestRealtedForm") 
	 public String syncSampleForm(Model model, StudyCertificateRelatedInfo14VO studyCertificateRelatedInfo14VO){
		  
		  if (!StringUtils.isEmpty( studyCertificateRelatedInfo14VO.getScriIdx() )){
			  
			  StudyCertificateRelatedInfo14VO studyCertificateRelatedInfoSelectOne = studyCertificateRealtedInfo14Service.studyCertificateRelatedInfoSelectOne(studyCertificateRelatedInfo14VO);
			  model.addAttribute("studyCertificateRelatedInfo14VO", studyCertificateRelatedInfoSelectOne); 
		  }
	  
	  return "sample/studyCertificate/syncStudyCertificateTestRealtedForm"; 
	  }
	 
	 @PostMapping("/syncStudyCertificateTestRealtedFormSave")
	 public String syncStudyCertificateTestRealtedFormSave(Model model, StudyCertificateRelatedInfo14VO studyCertificateRelatedInfo14VO, @RequestParam(value="action", required=true) String action){
       if ( "insert".equals(action) ){
           int insertCnt = studyCertificateRealtedInfo14Service.insertStudyCertificateNotice(studyCertificateRelatedInfo14VO);
       }else if ( "update".equals(action) ){
           int updateCnt = studyCertificateRealtedInfo14Service.updateStudyCertificateRelatedInfo(studyCertificateRelatedInfo14VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = studyCertificateRealtedInfo14Service.deleteStudyCertificateRelatedInfo(studyCertificateRelatedInfo14VO);
       }
       return "redirect:/studyCertificateTestRealtedInfoList";
	 }
}
