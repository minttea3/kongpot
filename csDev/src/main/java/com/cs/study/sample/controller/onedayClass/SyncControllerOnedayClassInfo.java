package com.cs.study.sample.controller.onedayClass;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.OnedayClassInfo49Service;
import com.cs.study.sample.vo.OnedayClassInfo49VO;

@Controller
public class SyncControllerOnedayClassInfo {

	
	  private final OnedayClassInfo49Service onedayClassInfo49Service;
	  
	  public SyncControllerOnedayClassInfo(OnedayClassInfo49Service onedayClassInfo49Service) { 
		  this.onedayClassInfo49Service = onedayClassInfo49Service;
	  }
	 
	@GetMapping("/onedayClassInfoList")
	public String onedayClassInfoList(Model model, OnedayClassInfo49VO  onedayClassInfo49VO) {
		List<OnedayClassInfo49VO> onedayClassInfoList = onedayClassInfo49Service.onedayClassInfoList(onedayClassInfo49VO);
		model.addAttribute("onedayClassInfoList", onedayClassInfoList);
		model.addAttribute("onedayClassInfo49VO",onedayClassInfo49VO);
		
		return "sample/onedayClass/onedayClassInfoList";
	}
	
	  @GetMapping("/syncOnedayClassInfoForm") 
	  public String syncAquariumfishInfoForm(Model model, OnedayClassInfo49VO  onedayClassInfo49VO){
			
			  if (!StringUtils.isEmpty( onedayClassInfo49VO.getOciIdx() )){ 
				  OnedayClassInfo49VO onedayClassInfoSelectOne = onedayClassInfo49Service.onedayClassInfoSelectOne(onedayClassInfo49VO);
			  model.addAttribute("onedayClassInfo49VO", onedayClassInfoSelectOne); 
			  }
	  return "sample/onedayClass/syncOnedayClassInfoForm"; 
	  }
	 
	
	  @PostMapping("/syncOnedayClassInfoFormSave") 
	  public String syncAquariumfishInfoFormSave(Model  model, OnedayClassInfo49VO  onedayClassInfo49VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = onedayClassInfo49Service.insertOnedayClassInfo(onedayClassInfo49VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = onedayClassInfo49Service.updateOnedayClassInfo(onedayClassInfo49VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = onedayClassInfo49Service.deleteOnedayClassInfo(onedayClassInfo49VO);
		  } 
		  return "redirect:onedayClassInfoList";
	  }
	 
}
