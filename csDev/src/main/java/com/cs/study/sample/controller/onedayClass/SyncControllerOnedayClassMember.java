package com.cs.study.sample.controller.onedayClass;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.OnedayClassInfo49Service;
import com.cs.study.sample.service.OnedayClassMember50Service;
import com.cs.study.sample.vo.OnedayClassMember50VO;
import com.cs.study.sample.vo.OnedayClassMember50VO;

@Controller
public class SyncControllerOnedayClassMember {

	
	  private final OnedayClassMember50Service onedayClassMember50Service;
	  
	  public SyncControllerOnedayClassMember(OnedayClassMember50Service onedayClassMember50Service) { 
		  this.onedayClassMember50Service = onedayClassMember50Service;
	  }
	 
	@GetMapping("/onedayClassMemberList")
	public String onedayClassMemberList(Model model, OnedayClassMember50VO  onedayClassMember50VO) {
		List<OnedayClassMember50VO> onedayClassMemberList = onedayClassMember50Service.onedayClassMemberList(onedayClassMember50VO);
		model.addAttribute("onedayClassMemberList", onedayClassMemberList);
		model.addAttribute("onedayClassMember50VO",onedayClassMember50VO);
		
		return "sample/onedayClass/onedayClassMemberList";
	}
	
	  @GetMapping("/syncOnedayClassMemberForm") 
	  public String syncAquariumfishInfoForm(Model model, OnedayClassMember50VO  onedayClassMember50VO){
			
//			  if (!StringUtils.isEmpty( onedayClassMember50VO.getOcmIdx() )){ 
//				  OnedayClassMember50VO onedayClassMemberSelectOne = onedayClassMember50Service.onedayClassMemberSelectOne(onedayClassMember50VO);
//			  model.addAttribute("onedayClassMember50VO", onedayClassMemberSelectOne); 
//			  }
		  
		  
		  
	  return "sample/onedayClass/syncOnedayClassMemberForm"; 
	  }
//	 
//	
	  @PostMapping("/syncOnedayClassMemberFormSave") 
	  public String syncAquariumfishInfoFormSave(Model  model, OnedayClassMember50VO  onedayClassMember50VO, @RequestParam(value="action", required=true) String action){ 
//		  if ( "insert".equals(action) ){ 
//			  int insertCnt = onedayClassMember50Service.insertOnedayClassMember(onedayClassMember50VO);
//			  
//		  }else if ( "update".equals(action) ){
//			  int updateCnt = onedayClassMember50Service.updateOnedayClassMember(onedayClassMember50VO);
//		  }else if (
//			  "delete".equals(action) ){ 
//			  int deleteCnt = onedayClassMember50Service.deleteOnedayClassMember(onedayClassMember50VO);
//		  } 
		  int insert = onedayClassMember50Service.insertOnedayClassMember(onedayClassMember50VO);
		  return "redirect:onedayClassMemberList";
	  }
	  
	  @PostMapping("/onedayClassMemberUpdate")
	  public String ddd(Model model, OnedayClassMember50VO onedayClassMember50VO) {
		  
		 
		  List<OnedayClassMember50VO> list= onedayClassMember50VO.getOnedayClassMemberVO();
		  for(int i=1;i<list.size();i++) {
			  System.out.println("-------------------");
			  System.out.println(i+"번째::"+list.get(i));
			  onedayClassMember50Service.updateOnedayClassMember(list.get(i));
			  System.out.println("-------------------");
		  }
		  return "redirect:/onedayClassMemberList";
	  }
	 
}
