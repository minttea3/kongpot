package com.cs.study.sample.controller.member;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.Member1Service;
import com.cs.study.sample.vo.Member1VO;
import org.apache.commons.lang3.StringUtils;

@Controller
public class SyncMember1Controller {

	
	  private final Member1Service member1Service;
	  
	  public SyncMember1Controller(Member1Service member1Service) {
		this.member1Service = member1Service;
	  }
	 
	 
	@GetMapping("/memberList")
	public String syncSampleList(Model model, Member1VO member1VO) {

		/*
		 * List<SampleVO> selectSampleList = sampleService.selectSampleList(sampleVO);
		 * model.addAttribute("syncSampleList", selectSampleList);
		 * model.addAttribute("sampleVO", sampleVO);
		 */
		//조회
		
		  List<Member1VO> memberList = member1Service.memberList(member1VO);
		  model.addAttribute("memberList",memberList);
		  model.addAttribute("member1VO",member1VO);
		 
		return "sample/member/memberList";
	}
	
	 @GetMapping("/syncMemberForm") // 폼 페이지 이동
	 public String syncSampleForm(Model model, Member1VO member1VO){
		  
		  if (!StringUtils.isEmpty( member1VO.getMIdx() )){
			  
			  Member1VO selectMember = member1Service.memberSelectOne(member1VO);
			  model.addAttribute("member1VO", selectMember); 
		  }
	  
	  return "sample/member/syncMemberForm"; 
	  }
	 
	 @PostMapping("/syncMemeberFormSave")
	 public String syncSampleFormSave(Model model, Member1VO member1VO, @RequestParam(value="action", required=true) String action){
       if ( "insert".equals(action) ){
           int insertCnt = member1Service.insertMember(member1VO);
       }else if ( "update".equals(action) ){
           int updateCnt = member1Service.updateMember(member1VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = member1Service.deleteMember(member1VO);
       }
       return "redirect:/memberList";
	 }
}
