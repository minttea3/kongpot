package com.cs.study.sample.controller.aquariumFish;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.AquariumfishInfo37Service;
import com.cs.study.sample.vo.AquariumfishInfo37VO;

@Controller
public class SyncControllerAquariumFishInfo {

	
	  private final AquariumfishInfo37Service aquariumfishInfo37Service;
	  
	  public SyncControllerAquariumFishInfo(AquariumfishInfo37Service aquariumfishInfo37Service) { 
		  this.aquariumfishInfo37Service = aquariumfishInfo37Service;
	  }
	 
	@GetMapping("/aquariumfishInfoList")
	public String bookBestSellerInfoList(Model model, AquariumfishInfo37VO  aquariumfishInfo37VO) {
		List<AquariumfishInfo37VO> aquariumfishInfoList = aquariumfishInfo37Service.aquariumfishInfoList(aquariumfishInfo37VO);
		model.addAttribute("aquariumfishInfoList", aquariumfishInfoList);
		model.addAttribute("aquariumfishInfo37VO",aquariumfishInfo37VO);
		
		return "sample/aquariumfish/aquariumfishInfoList";
	}
	
	  @GetMapping("/syncAquariumfishInfoForm") 
	  public String syncBookBestSellerForm(Model model, AquariumfishInfo37VO  aquariumfishInfo37VO){
			
			  if (!StringUtils.isEmpty( aquariumfishInfo37VO.getAiIdx() )){ 
				  AquariumfishInfo37VO aquariumfishInfoSelectOne = aquariumfishInfo37Service.aquariumfishInfoSelectOne(aquariumfishInfo37VO);
			  model.addAttribute("aquariumfishInfo37VO", aquariumfishInfoSelectOne); 
			  }
	  return "sample/aquariumfish/syncAquariumfishInfoForm"; 
	  }
	 
	
	  @PostMapping("/syncAquariumfishInfoFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, AquariumfishInfo37VO  aquariumfishInfo37VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = aquariumfishInfo37Service.insertAquariumfishInfo(aquariumfishInfo37VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = aquariumfishInfo37Service.updateAquariumfishInfo(aquariumfishInfo37VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = aquariumfishInfo37Service.deleteAquariumfishInfo(aquariumfishInfo37VO);
		  } 
		  return "redirect:aquariumfishInfoList";
	  }
	 
}
