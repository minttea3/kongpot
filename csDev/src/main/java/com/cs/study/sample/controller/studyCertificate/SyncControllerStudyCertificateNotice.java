package com.cs.study.sample.controller.studyCertificate;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.Member1Service;
import com.cs.study.sample.service.StudyCertificateNotice12Service;
import com.cs.study.sample.vo.Member1VO;
import com.cs.study.sample.vo.StudyCertificateNotice12VO;

import org.apache.commons.lang3.StringUtils;

@Controller
public class SyncControllerStudyCertificateNotice {

	
	  private final StudyCertificateNotice12Service studyCertificateNotice12Service;
	  
	  public SyncControllerStudyCertificateNotice(StudyCertificateNotice12Service studyCertificateNotice12Service) {
		this.studyCertificateNotice12Service = studyCertificateNotice12Service;
	  }
	 
	 
	@GetMapping("/studyCertificateNoticeList")
	public String syncSampleList(Model model, StudyCertificateNotice12VO studyCertificateNotice12VO) {
		
		  List<StudyCertificateNotice12VO> studyCertificateNoticeList = studyCertificateNotice12Service.studyCertificateNoticeList(studyCertificateNotice12VO);
		  model.addAttribute("studyCertificateNoticeList",studyCertificateNoticeList);
		  model.addAttribute("studyCertificateNotice12VO",studyCertificateNotice12VO);
		 
		return "sample/studyCertificate/studyCertificateNoticeList";
	}
	
	 @GetMapping("/syncStudyCertificateNoticeForm") 
	 public String syncSampleForm(Model model, StudyCertificateNotice12VO studyCertificateNotice12VO){
		  
		  if (!StringUtils.isEmpty( studyCertificateNotice12VO.getScnIdx() )){
			  
			  StudyCertificateNotice12VO studyCertificateNoticeSelectOne = studyCertificateNotice12Service.studyCertificateNoticeSelectOne(studyCertificateNotice12VO);
			  model.addAttribute("studyCertificateNotice12VO", studyCertificateNoticeSelectOne); 
		  }
	  
	  return "sample/studyCertificate/syncStudyCertificateNoticeForm"; 
	  }
	 
	 @PostMapping("/syncStudyCertificateNoticSave")
	 public String syncSampleFormSave(Model model, StudyCertificateNotice12VO studyCertificateNotice12VO, @RequestParam(value="action", required=true) String action){
       if ( "insert".equals(action) ){
           int insertCnt = studyCertificateNotice12Service.insertStudyCertificateNotice(studyCertificateNotice12VO);
       }else if ( "update".equals(action) ){
           int updateCnt = studyCertificateNotice12Service.updateStudyCertificateNotice(studyCertificateNotice12VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = studyCertificateNotice12Service.deleteStudyCertificateNotice(studyCertificateNotice12VO);
       }
       return "redirect:/studyCertificateNoticeList";
	 }
}
