package com.cs.study.sample.controller.onedayClass;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.OnedayClassArt53Service;
import com.cs.study.sample.vo.OnedayClassArt53VO;

@Controller
public class SyncControllerOnedayClassArt {

	
	  private final OnedayClassArt53Service onedayClassArt53Service;
	  
	  public SyncControllerOnedayClassArt(OnedayClassArt53Service onedayClassArt53Service) { 
		  this.onedayClassArt53Service = onedayClassArt53Service;
	  }
	 
	@GetMapping("/onedayClassArtList")
	public String onedayClassArtList(Model model, OnedayClassArt53VO  onedayClassArt53VO) {
		List<OnedayClassArt53VO> onedayClassArtList = onedayClassArt53Service.onedayClassArtList(onedayClassArt53VO);
		model.addAttribute("onedayClassArtList", onedayClassArtList);
		model.addAttribute("onedayClassArt53VO",onedayClassArt53VO);
		
		return "sample/onedayClass/onedayClassArtList";
	}
	
	  @GetMapping("/syncOnedayClassArtForm") 
	  public String syncAquariumfishInfoForm(Model model, OnedayClassArt53VO  onedayClassArt53VO){
			
		 
				  OnedayClassArt53VO onedayClassArtSelectOne = onedayClassArt53Service.onedayClassArtSelectOne(onedayClassArt53VO);
			  model.addAttribute("onedayClassArt53VO", onedayClassArtSelectOne); 
			 
	  return "sample/onedayClass/syncOnedayClassArtForm"; 
	  }
	 
	
	  @PostMapping("/syncOnedayClassArtFormSave") 
	  public String syncAquariumfishInfoFormSave(Model  model, OnedayClassArt53VO  onedayClassArt53VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = onedayClassArt53Service.insertOnedayClassArt(onedayClassArt53VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = onedayClassArt53Service.updateOnedayClassArt(onedayClassArt53VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = onedayClassArt53Service.deleteOnedayClassArt(onedayClassArt53VO);
		  } 
		  return "redirect:onedayClassArtList";
	  }
	 
}
