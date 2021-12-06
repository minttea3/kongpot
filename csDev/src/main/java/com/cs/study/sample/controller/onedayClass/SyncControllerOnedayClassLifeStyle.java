package com.cs.study.sample.controller.onedayClass;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.OnedayClassLifeStyle58Service;
import com.cs.study.sample.vo.OnedayClassLifeStyle58VO;

@Controller
public class SyncControllerOnedayClassLifeStyle {

	
	  private final OnedayClassLifeStyle58Service onedayClassLifeStyle58Service;
	  
	  public SyncControllerOnedayClassLifeStyle(OnedayClassLifeStyle58Service onedayClassLifeStyle58Service) { 
		  this.onedayClassLifeStyle58Service = onedayClassLifeStyle58Service;
	  }
	 
	@GetMapping("/onedayClassLifeStyleList")
	public String onedayClassLifeStyleList(Model model, OnedayClassLifeStyle58VO  onedayClassLifeStyle58VO) {
		List<OnedayClassLifeStyle58VO> onedayClassLifeStyleList = onedayClassLifeStyle58Service.onedayClassLifeStyleList(onedayClassLifeStyle58VO);
		model.addAttribute("onedayClassLifeStyleList", onedayClassLifeStyleList);
		model.addAttribute("onedayClassLifeStyle58VO",onedayClassLifeStyle58VO);
		
		return "sample/onedayClass/onedayClassLifeStyleList";
	}
	
	  @GetMapping("/syncOnedayClassLifeStyleForm") 
	  public String syncAquariumfishInfoForm(Model model, OnedayClassLifeStyle58VO  onedayClassLifeStyle58VO){
			
			  OnedayClassLifeStyle58VO onedayClassLifeStyleSelectOne = onedayClassLifeStyle58Service.onedayClassLifeStyleSelectOne(onedayClassLifeStyle58VO);
			  model.addAttribute("onedayClassLifeStyle58VO", onedayClassLifeStyleSelectOne); 
			 
	  return "sample/onedayClass/syncOnedayClassLifeStyleForm"; 
	  }
	 
	
	  @PostMapping("/syncOnedayClassLifeStyleFormSave") 
	  public String syncAquariumfishInfoFormSave(Model  model, OnedayClassLifeStyle58VO  onedayClassLifeStyle58VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = onedayClassLifeStyle58Service.insertOnedayClassLifeStyle(onedayClassLifeStyle58VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = onedayClassLifeStyle58Service.updateOnedayClassLifeStyle(onedayClassLifeStyle58VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = onedayClassLifeStyle58Service.deleteOnedayClassLifeStyle(onedayClassLifeStyle58VO);
		  } 
		  return "redirect:onedayClassLifeStyleList";
	  }
	 
}
