package com.cs.study.sample.controller.onedayClass;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.OnedayClassBeauty54Service;
import com.cs.study.sample.service.OnedayClassMusic55Service;
import com.cs.study.sample.vo.OnedayClassMusic55VO;
import com.cs.study.sample.vo.OnedayClassMusic55VO;

@Controller
public class SyncControllerOnedayClassMusic {

	
	  private final OnedayClassMusic55Service onedayClassMusic55Service;
	  
	  public SyncControllerOnedayClassMusic(OnedayClassMusic55Service onedayClassMusic55Service) { 
		  this.onedayClassMusic55Service = onedayClassMusic55Service;
	  }
	 
	@GetMapping("/onedayClassMusicList")
	public String onedayClassMusicList(Model model, OnedayClassMusic55VO  onedayClassMusic55VO) {
		List<OnedayClassMusic55VO> onedayClassMusicList = onedayClassMusic55Service.onedayClassMusicList(onedayClassMusic55VO);
		model.addAttribute("onedayClassMusicList", onedayClassMusicList);
		model.addAttribute("onedayClassMusic55VO",onedayClassMusic55VO);
		
		return "sample/onedayClass/onedayClassMusicList";
	}
	
	  @GetMapping("/syncOnedayClassMusicForm") 
	  public String syncAquariumfishInfoForm(Model model, OnedayClassMusic55VO  onedayClassMusic55VO){
			
			  OnedayClassMusic55VO onedayClassMusicSelectOne = onedayClassMusic55Service.onedayClassMusicSelectOne(onedayClassMusic55VO);
			  model.addAttribute("onedayClassMusic55VO", onedayClassMusicSelectOne); 
			 
	  return "sample/onedayClass/syncOnedayClassMusicForm"; 
	  }
	 
	
	  @PostMapping("/syncOnedayClassMusicFormSave") 
	  public String syncAquariumfishInfoFormSave(Model  model, OnedayClassMusic55VO  onedayClassMusic55VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = onedayClassMusic55Service.insertOnedayClassMusic(onedayClassMusic55VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = onedayClassMusic55Service.updateOnedayClassMusic(onedayClassMusic55VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = onedayClassMusic55Service.deleteOnedayClassMusic(onedayClassMusic55VO);
		  } 
		  return "redirect:onedayClassMusicList";
	  }
	 
}
