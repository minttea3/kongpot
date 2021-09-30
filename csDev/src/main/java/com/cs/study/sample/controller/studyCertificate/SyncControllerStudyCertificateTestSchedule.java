package com.cs.study.sample.controller.studyCertificate;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.Member1Service;
import com.cs.study.sample.service.StudyCertificateNotice12Service;
import com.cs.study.sample.service.StudyCertificateTestSchedule13Service;
import com.cs.study.sample.vo.Member1VO;
import com.cs.study.sample.vo.StudyCertificateNotice12VO;
import com.cs.study.sample.vo.StudyCertificateTestSchedule13VO;

import org.apache.commons.lang3.StringUtils;

@Controller
public class SyncControllerStudyCertificateTestSchedule {

	
	  private final StudyCertificateTestSchedule13Service studyCertificateTestSchedule13Service;
	  
	  public SyncControllerStudyCertificateTestSchedule(StudyCertificateTestSchedule13Service studyCertificateTestSchedule13Service) {
		this.studyCertificateTestSchedule13Service = studyCertificateTestSchedule13Service;
	  }
	 
	 
	@GetMapping("/studyCertificateTestScheduleList")
	public String syncSampleList(Model model, StudyCertificateTestSchedule13VO studyCertificateTestSchedule13VO) {
		
		  List<StudyCertificateTestSchedule13VO> studyCertificateTestScheduleList = studyCertificateTestSchedule13Service.studyCertificateTestScheduleList(studyCertificateTestSchedule13VO);
		  model.addAttribute("studyCertificateTestScheduleList",studyCertificateTestScheduleList);
		  model.addAttribute("studyCertificateTestSchedule13VO",studyCertificateTestSchedule13VO);
		 
		return "sample/studyCertificate/studyCertificateTestScheduleList";
	}
	
	 @GetMapping("/syncStudyCertificateTestScheduleForm") 
	 public String syncSampleForm(Model model, StudyCertificateTestSchedule13VO studyCertificateTestSchedule13VO){
		  
		  if (!StringUtils.isEmpty( studyCertificateTestSchedule13VO.getSctsIdx() )){
			  
			  StudyCertificateTestSchedule13VO studyCertificateTestScheduleSelectOne = studyCertificateTestSchedule13Service.studyCertificateTestScheduleSelectOne(studyCertificateTestSchedule13VO);
			  model.addAttribute("studyCertificateTestSchedule13VO", studyCertificateTestScheduleSelectOne); 
		  }
	  
	  return "sample/studyCertificate/syncStudyCertificateTestScheduleForm"; 
	  }
	 
	 @PostMapping("/syncStudyCertificateTestScheduleSave")
	 public String syncSampleFormSave(Model model, StudyCertificateTestSchedule13VO studyCertificateTestSchedule13VO, @RequestParam(value="action", required=true) String action){
       if ( "insert".equals(action) ){
           int insertCnt = studyCertificateTestSchedule13Service.insertStudyCertificateTestSchedule(studyCertificateTestSchedule13VO);
       }else if ( "update".equals(action) ){
           int updateCnt = studyCertificateTestSchedule13Service.updateStudyCertificateTestSchedule(studyCertificateTestSchedule13VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = studyCertificateTestSchedule13Service.deleteStudyCertificateTestSchedule(studyCertificateTestSchedule13VO);
       }
       return "redirect:/studyCertificateTestScheduleList";
	 }
}
