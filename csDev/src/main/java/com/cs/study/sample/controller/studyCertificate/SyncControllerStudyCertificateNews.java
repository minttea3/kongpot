package com.cs.study.sample.controller.studyCertificate;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.StudyCertificateNews15Service;
import com.cs.study.sample.vo.StudyCertificateNews15VO;

@Controller
public class SyncControllerStudyCertificateNews {

	
	  private final StudyCertificateNews15Service studyCertificateNews15Service;
	  
	  public SyncControllerStudyCertificateNews(StudyCertificateNews15Service studyCertificateNews15Service) {
		this.studyCertificateNews15Service = studyCertificateNews15Service;
	  }
	 
	 
	@GetMapping("/studyCertificateNewsList")
	public String studyCertificateNewsList(Model model, StudyCertificateNews15VO studyCertificateNews15VO) {
		
		List<StudyCertificateNews15VO> insertStudyCertificateNews=studyCertificateNews15Service.studyCertificateNewsList(studyCertificateNews15VO);
		model.addAttribute("studyCertificateRelatedInfoList",insertStudyCertificateNews);
		model.addAttribute("studyCertificateNews15VO",studyCertificateNews15VO);
		 
		return "sample/studyCertificate/studyCertificateNewsList";
	}
	
	 @GetMapping("/syncStudyCertificateNewsForm") 
	 public String syncStudyCertificateNewsForm(Model model, StudyCertificateNews15VO studyCertificateNews15VO){
		  
		  if (!StringUtils.isEmpty( studyCertificateNews15VO.getScnsIdx() )){
			  
			  StudyCertificateNews15VO studyCertificateRelatedInfoSelectOne = studyCertificateNews15Service.studyCertificateNewsSelectOne(studyCertificateNews15VO);
			  model.addAttribute("studyCertificateNews15VO", studyCertificateRelatedInfoSelectOne); 
		  }
	  
	  return "sample/studyCertificate/syncStudyCertificateNewsForm"; 
	  }
	 
	 @PostMapping("/syncStudyCertificateNewsFormSave")
	 public String syncStudyCertificateNewsFormSave(Model model, StudyCertificateNews15VO studyCertificateNews15VO, @RequestParam(value="action", required=true) String action){
       if ( "insert".equals(action) ){
           int insertCnt = studyCertificateNews15Service.insertStudyCertificateNews(studyCertificateNews15VO);
       }else if ( "update".equals(action) ){
           int updateCnt = studyCertificateNews15Service.updateStudyCertificateNews(studyCertificateNews15VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = studyCertificateNews15Service.deleteStudyCertificateNews(studyCertificateNews15VO);
       }
       return "redirect:/studyCertificateNewsList";
	 }
}
