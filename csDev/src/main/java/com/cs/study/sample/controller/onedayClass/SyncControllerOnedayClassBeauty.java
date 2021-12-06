package com.cs.study.sample.controller.onedayClass;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.OnedayClassBeauty54Service;
import com.cs.study.sample.vo.OnedayClassBeauty54VO;

@Controller
public class SyncControllerOnedayClassBeauty {

	
	  private final OnedayClassBeauty54Service onedayClassBeauty54Service;
	  
	  public SyncControllerOnedayClassBeauty(OnedayClassBeauty54Service onedayClassBeauty54Service) { 
		  this.onedayClassBeauty54Service = onedayClassBeauty54Service;
	  }
	 
	@GetMapping("/onedayClassBeautyList")
	public String onedayClassBeautyList(Model model, OnedayClassBeauty54VO  onedayClassBeauty54VO) {
		List<OnedayClassBeauty54VO> onedayClassBeautyList = onedayClassBeauty54Service.onedayClassBeautyList(onedayClassBeauty54VO);
		model.addAttribute("onedayClassBeautyList", onedayClassBeautyList);
		model.addAttribute("onedayClassBeauty54VO",onedayClassBeauty54VO);
		
		return "sample/onedayClass/onedayClassBeautyList";
	}
	
	  @GetMapping("/syncOnedayClassBeautyForm") 
	  public String syncAquariumfishInfoForm(Model model, OnedayClassBeauty54VO  onedayClassBeauty54VO){
			
			  OnedayClassBeauty54VO onedayClassBeautySelectOne = onedayClassBeauty54Service.onedayClassBeautySelectOne(onedayClassBeauty54VO);
			  model.addAttribute("onedayClassBeauty54VO", onedayClassBeautySelectOne); 
			 
	  return "sample/onedayClass/syncOnedayClassBeautyForm"; 
	  }
	 
	
	  @PostMapping("/syncOnedayClassBeautyFormSave") 
	  public String syncAquariumfishInfoFormSave(Model  model, OnedayClassBeauty54VO  onedayClassBeauty54VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = onedayClassBeauty54Service.insertOnedayClassBeauty(onedayClassBeauty54VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = onedayClassBeauty54Service.updateOnedayClassBeauty(onedayClassBeauty54VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = onedayClassBeauty54Service.deleteOnedayClassBeauty(onedayClassBeauty54VO);
		  } 
		  return "redirect:onedayClassBeautyList";
	  }
	 
}
