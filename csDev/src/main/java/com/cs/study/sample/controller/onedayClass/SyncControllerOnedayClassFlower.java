package com.cs.study.sample.controller.onedayClass;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.OnedayClassFlower52Service;
import com.cs.study.sample.vo.OnedayClassFlower52VO;

@Controller
public class SyncControllerOnedayClassFlower {

	
	  private final OnedayClassFlower52Service onedayClassFlower52Service;
	  
	  public SyncControllerOnedayClassFlower(OnedayClassFlower52Service onedayClassFlower52Service) { 
		  this.onedayClassFlower52Service = onedayClassFlower52Service;
	  }
	 
	@GetMapping("/onedayClassFlowerList")
	public String onedayClassFlowerList(Model model, OnedayClassFlower52VO  onedayClassFlower52VO) {
		List<OnedayClassFlower52VO> onedayClassFlowerList = onedayClassFlower52Service.onedayClassFlowerList(onedayClassFlower52VO);
		model.addAttribute("onedayClassFlowerList", onedayClassFlowerList);
		model.addAttribute("onedayClassFlower52VO",onedayClassFlower52VO);
		
		return "sample/onedayClass/onedayClassFlowerList";
	}
	
	  @GetMapping("/syncOnedayClassFlowerForm") 
	  public String syncAquariumfishInfoForm(Model model, OnedayClassFlower52VO  onedayClassFlower52VO){
			
		 
				  OnedayClassFlower52VO onedayClassFlowerSelectOne = onedayClassFlower52Service.onedayClassFlowerSelectOne(onedayClassFlower52VO);
			  model.addAttribute("onedayClassFlower52VO", onedayClassFlowerSelectOne); 
			 
	  return "sample/onedayClass/syncOnedayClassFlowerForm"; 
	  }
	 
	
	  @PostMapping("/syncOnedayClassFlowerFormSave") 
	  public String syncAquariumfishInfoFormSave(Model  model, OnedayClassFlower52VO  onedayClassFlower52VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = onedayClassFlower52Service.insertOnedayClassFlower(onedayClassFlower52VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = onedayClassFlower52Service.updateOnedayClassFlower(onedayClassFlower52VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = onedayClassFlower52Service.deleteOnedayClassFlower(onedayClassFlower52VO);
		  } 
		  return "redirect:onedayClassFlowerList";
	  }
	 
}
