package com.cs.study.sample.controller.studyCertificate;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.StudyCertificateCommunity17Service;
import com.cs.study.sample.service.StudyCertificateCommunityComment18Service;
import com.cs.study.sample.vo.StudyCertificateCommunity17VO;
import com.cs.study.sample.vo.StudyCertificateCommunityComment18VO;

@Controller
public class SyncControllerStudyCertificateCommunity {

	
	  private final StudyCertificateCommunity17Service studyCertificateCommunity17Service;
	  private final StudyCertificateCommunityComment18Service studyCertificateCommunityComment18Service;
	  
	  public SyncControllerStudyCertificateCommunity(StudyCertificateCommunity17Service studyCertificateCommunity17Service,StudyCertificateCommunityComment18Service studyCertificateCommunityComment18Service) {
		this.studyCertificateCommunity17Service = studyCertificateCommunity17Service;
		this.studyCertificateCommunityComment18Service = studyCertificateCommunityComment18Service;
		
	  }
	 
	 
	@GetMapping("/studyCertificateCommunityList")
	public String studyCertificateNewsList(Model model, StudyCertificateCommunity17VO studyCertificateCommunity17VO, StudyCertificateCommunityComment18VO studyCertificateCommunityComment18VO) {
		//커뮤니티 리스트
		List<StudyCertificateCommunity17VO> studyCertificateCommunityList=studyCertificateCommunity17Service.studyCertificateCommunityList(studyCertificateCommunity17VO);
		model.addAttribute("studyCertificateCommunityList",studyCertificateCommunityList);
		model.addAttribute("studyCertificateCommunity17VO",studyCertificateCommunity17VO);
		
		
		//커뮤니티 댓글 리스트
		List<StudyCertificateCommunityComment18VO> studyCertificateCommunityCommentList=studyCertificateCommunityComment18Service.studyCertificateCommunityCommentList(studyCertificateCommunityComment18VO);
		model.addAttribute("studyCertificateCommunityCommentList",studyCertificateCommunityCommentList);
		model.addAttribute("studyCertificateCommunityComment18VO",studyCertificateCommunityComment18VO);
		
		return "sample/studyCertificate/studyCertificateCommunityList";
	}
	
	 @GetMapping("/syncStudyCertificateCommunityForm") 
	 public String syncStudyCertificateNewsForm(Model model, StudyCertificateCommunity17VO StudyCertificateCommunity17VO, StudyCertificateCommunityComment18VO studyCertificateCommunityComment18VO){
		  
		  if (!StringUtils.isEmpty( StudyCertificateCommunity17VO.getSccIdx() )){
			  
			  StudyCertificateCommunity17VO studyCertificateCommunitySelectOne = studyCertificateCommunity17Service.studyCertificateCommunitySelectOne(StudyCertificateCommunity17VO);
			  model.addAttribute("StudyCertificateCommunity17VO", studyCertificateCommunitySelectOne); 
		  }
		  
		  
		  //커뮤니티 댓글 리스트
		  if (!StringUtils.isEmpty( studyCertificateCommunityComment18VO.getSccIdx() )){
			  
			  StudyCertificateCommunityComment18VO studyCertificateCommunityCommentSelectOne = studyCertificateCommunityComment18Service.studyCertificateCommunityCommentSelectOne(studyCertificateCommunityComment18VO);
			  model.addAttribute("studyCertificateCommunityComment18VO", studyCertificateCommunityCommentSelectOne); 
		  }
		  
		  
//			List<StudyCertificateCommunityComment18VO> studyCertificateCommunityCommentList=studyCertificateCommunityComment18Service.studyCertificateCommunityCommentList(studyCertificateCommunityComment18VO);
//			model.addAttribute("studyCertificateCommunityCommentList",studyCertificateCommunityCommentList);
//			System.out.println("ddjdj"+studyCertificateCommunityCommentList);
//			model.addAttribute("studyCertificateCommunityComment18VO",studyCertificateCommunityComment18VO);
		  
	  return "sample/studyCertificate/syncStudyCertificateCommunityForm"; 
	  }
	 
	 @PostMapping("/syncStudyCertificateCommunityFormSave")
	 public String syncStudyCertificateNewsFormSave(Model model, StudyCertificateCommunity17VO StudyCertificateCommunity17VO, StudyCertificateCommunityComment18VO studyCertificateCommunityComment18VO, @RequestParam(value="action", required=true) String action){
		 //커뮤니티 본문글
		 if ( "insert".equals(action) ){
           int insertCnt = studyCertificateCommunity17Service.insertStudyCertificateCommunity(StudyCertificateCommunity17VO);
       }else if ( "update".equals(action) ){
           int updateCnt = studyCertificateCommunity17Service.updateStudyCertificateCommunity(StudyCertificateCommunity17VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = studyCertificateCommunity17Service.deleteStudyCertificateCommunity(StudyCertificateCommunity17VO);
           int deleteC = studyCertificateCommunityComment18Service.deleteStudyCertificateCommunityComment(studyCertificateCommunityComment18VO);
       }
       // 댓글
       else if("insertComment".equals(action)) {
    	   // 댓글 등록
    	   int insertComment = studyCertificateCommunityComment18Service.insertStudyCertificateCommunityComment(studyCertificateCommunityComment18VO);
       }
       else if("updateComment".equals(action)) {
    	   // 댓글 수정
    	   int updateC = studyCertificateCommunityComment18Service.updateStudyCertificateCommunityComment(studyCertificateCommunityComment18VO);
       }
       else if("deleteComment".equals(action)) {
    	   // 댓글 삭제
    	   int deleteC = studyCertificateCommunityComment18Service.deleteStudyCertificateCommunityComment(studyCertificateCommunityComment18VO);
       }
       
       return "redirect:/studyCertificateCommunityList";
	 }
	 // 댓글폼
	 @GetMapping("/syncStudyCertificateCommunityCommunitycommentForm") 
	 public String syncStudyCertificateNewsForm(Model model, StudyCertificateCommunityComment18VO studyCertificateCommunityComment18VO){
		  
		  if (!StringUtils.isEmpty( studyCertificateCommunityComment18VO.getSccIdx() )){
			  
			  StudyCertificateCommunityComment18VO studyCertificateCommunityCommentSelectOne = studyCertificateCommunityComment18Service.studyCertificateCommunityCommentSelectOne(studyCertificateCommunityComment18VO);
			  model.addAttribute("studyCertificateCommunityComment18VO", studyCertificateCommunityCommentSelectOne); 
		  }
		  
		  
	  return "sample/studyCertificate/syncStudyCertificateCommunityCommunitycommentForm"; 
	  }
	 //댓글
	 @PostMapping("/syncStudyCertificateCommunityCommunitycommentFormSave")
	 public String syncStudyCertificateCommunityCommunitycommentFormSave(Model model, StudyCertificateCommunityComment18VO studyCertificateCommunityComment18VO, @RequestParam(value="action", required=true) String action){
       if ( "insert".equals(action) ){
           int insertCnt = studyCertificateCommunityComment18Service.insertStudyCertificateCommunityComment(studyCertificateCommunityComment18VO);
       }else if ( "update".equals(action) ){
           int updateCnt = studyCertificateCommunityComment18Service.updateStudyCertificateCommunityComment(studyCertificateCommunityComment18VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = studyCertificateCommunityComment18Service.deleteStudyCertificateCommunityComment(studyCertificateCommunityComment18VO);
       }
       
       return "redirect:/studyCertificateCommunityList";
	 }
	 
}
