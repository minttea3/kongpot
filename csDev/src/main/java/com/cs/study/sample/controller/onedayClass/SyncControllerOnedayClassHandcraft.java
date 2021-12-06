package com.cs.study.sample.controller.onedayClass;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.OnedayClassHandcraft59Service;
import com.cs.study.sample.vo.OnedayClassHandcraft59VO;

@Controller
public class SyncControllerOnedayClassHandcraft {

	
	  private final OnedayClassHandcraft59Service onedayClassHandcraft59Service;
	  
	  public SyncControllerOnedayClassHandcraft(OnedayClassHandcraft59Service onedayClassHandcraft59Service) {
		  this.onedayClassHandcraft59Service = onedayClassHandcraft59Service;
	  }
	 
	@GetMapping("/onedayClassHandcraftList")
	public String onedayClassHandcraftList(Model model, OnedayClassHandcraft59VO  onedayClassHandcraft59VO) {
		List<OnedayClassHandcraft59VO> onedayClassHandcraftList = onedayClassHandcraft59Service.onedayClassHandcraftList(onedayClassHandcraft59VO);
		model.addAttribute("onedayClassHandcraftList", onedayClassHandcraftList);
		model.addAttribute("onedayClassHandcraft59VO",onedayClassHandcraft59VO);
		
		return "sample/onedayClass/onedayClassHandcraftList";
	}
	
	  @GetMapping("/syncOnedayClassHandcraftForm") 
	  public String syncAquariumfishInfoForm(Model model, OnedayClassHandcraft59VO  onedayClassHandcraft59VO){
			
			  OnedayClassHandcraft59VO onedayClassHandcraftSelectOne = onedayClassHandcraft59Service.onedayClassHandcraftSelectOne(onedayClassHandcraft59VO);
			  model.addAttribute("onedayClassHandcraft59VO", onedayClassHandcraftSelectOne); 
			 
	  return "sample/onedayClass/syncOnedayClassHandcraftForm"; 
	  }
	 
	
	  @PostMapping("/syncOnedayClassHandcraftFormSave") 
	  public String syncAquariumfishInfoFormSave(Model  model, OnedayClassHandcraft59VO  onedayClassHandcraft59VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = onedayClassHandcraft59Service.insertOnedayClassHandcraft(onedayClassHandcraft59VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = onedayClassHandcraft59Service.updateOnedayClassHandcraft(onedayClassHandcraft59VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = onedayClassHandcraft59Service.deleteOnedayClassHandcraft(onedayClassHandcraft59VO);
		  } 
		  return "redirect:onedayClassHandcraftList";
	  }
	 
}
