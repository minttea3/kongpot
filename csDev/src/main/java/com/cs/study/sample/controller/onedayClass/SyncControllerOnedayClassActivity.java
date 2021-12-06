package com.cs.study.sample.controller.onedayClass;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.OnedayClassActivity57Service;
import com.cs.study.sample.vo.OnedayClassActivity57VO;

@Controller
public class SyncControllerOnedayClassActivity {

	
	  private final OnedayClassActivity57Service onedayClassActivity57Service;
	  
	  public SyncControllerOnedayClassActivity(OnedayClassActivity57Service onedayClassActivity57Service) { 
		  this.onedayClassActivity57Service = onedayClassActivity57Service;
	  }
	 
	@GetMapping("/onedayClassActivityList")
	public String onedayClassActivityList(Model model, OnedayClassActivity57VO  onedayClassActivity57VO) {
		List<OnedayClassActivity57VO> onedayClassActivityList = onedayClassActivity57Service.onedayClassActivityList(onedayClassActivity57VO);
		model.addAttribute("onedayClassActivityList", onedayClassActivityList);
		model.addAttribute("onedayClassActivity57VO",onedayClassActivity57VO);
		
		return "sample/onedayClass/onedayClassActivityList";
	}
	
	  @GetMapping("/syncOnedayClassActivityForm") 
	  public String syncAquariumfishInfoForm(Model model, OnedayClassActivity57VO  onedayClassActivity57VO){
			
			  OnedayClassActivity57VO onedayClassActivitySelectOne = onedayClassActivity57Service.onedayClassActivitySelectOne(onedayClassActivity57VO);
			  model.addAttribute("onedayClassActivity57VO", onedayClassActivitySelectOne); 
			 
	  return "sample/onedayClass/syncOnedayClassActivityForm"; 
	  }
	 
	
	  @PostMapping("/syncOnedayClassActivityFormSave") 
	  public String syncAquariumfishInfoFormSave(Model  model, OnedayClassActivity57VO  onedayClassActivity57VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = onedayClassActivity57Service.insertOnedayClassActivity(onedayClassActivity57VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = onedayClassActivity57Service.updateOnedayClassActivity(onedayClassActivity57VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = onedayClassActivity57Service.deleteOnedayClassActivity(onedayClassActivity57VO);
		  } 
		  return "redirect:onedayClassActivityList";
	  }
	 
}
