package com.cs.study.sample.controller.onedayClass;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.OnedayClassBread51Service;
import com.cs.study.sample.service.OnedayClassInfo49Service;
import com.cs.study.sample.vo.OnedayClassBread51VO;
import com.cs.study.sample.vo.OnedayClassBread51VO;

@Controller
public class SyncControllerOnedayClassBread {

	
	  private final OnedayClassBread51Service onedayClassBread51Service;
	  
	  public SyncControllerOnedayClassBread(OnedayClassBread51Service onedayClassBread51Service) { 
		  this.onedayClassBread51Service = onedayClassBread51Service;
	  }
	 
	@GetMapping("/onedayClassBreadList")
	public String onedayClassBreadList(Model model, OnedayClassBread51VO  onedayClassBread51VO) {
		List<OnedayClassBread51VO> onedayClassBreadList = onedayClassBread51Service.onedayClassBreadList(onedayClassBread51VO);
		model.addAttribute("onedayClassBreadList", onedayClassBreadList);
		model.addAttribute("onedayClassBread51VO",onedayClassBread51VO);
		
		return "sample/onedayClass/onedayClassBreadList";
	}
	
	  @GetMapping("/syncOnedayClassBreadForm") 
	  public String syncAquariumfishInfoForm(Model model, OnedayClassBread51VO  onedayClassBread51VO){
			
		 
				  OnedayClassBread51VO onedayClassBreadSelectOne = onedayClassBread51Service.onedayClassBreadSelectOne(onedayClassBread51VO);
			  model.addAttribute("onedayClassBread51VO", onedayClassBreadSelectOne); 
			 
	  return "sample/onedayClass/syncOnedayClassBreadForm"; 
	  }
	 
	
	  @PostMapping("/syncOnedayClassBreadFormSave") 
	  public String syncAquariumfishInfoFormSave(Model  model, OnedayClassBread51VO  onedayClassBread51VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = onedayClassBread51Service.insertOnedayClassBread(onedayClassBread51VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = onedayClassBread51Service.updateOnedayClassBread(onedayClassBread51VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = onedayClassBread51Service.deleteOnedayClassBread(onedayClassBread51VO);
		  } 
		  return "redirect:onedayClassBreadList";
	  }
	 
}
