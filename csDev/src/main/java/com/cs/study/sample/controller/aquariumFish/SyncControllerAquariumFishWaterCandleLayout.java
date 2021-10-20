package com.cs.study.sample.controller.aquariumFish;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.AquariumfishWaterCandleLayout38Service;
import com.cs.study.sample.vo.AquariumfishWaterCandleLayout38VO;

@Controller
public class SyncControllerAquariumFishWaterCandleLayout {

	
	  private final AquariumfishWaterCandleLayout38Service aquariumfishWaterCandleLayout38Service;
	  
	  public SyncControllerAquariumFishWaterCandleLayout(AquariumfishWaterCandleLayout38Service aquariumfishWaterCandleLayout38Service) { 
		  this.aquariumfishWaterCandleLayout38Service = aquariumfishWaterCandleLayout38Service;
	  }
	 
	@GetMapping("/aquariumfishWaterCandleLayoutList")
	public String bookBestSellerInfoList(Model model, AquariumfishWaterCandleLayout38VO  aquariumfishWaterCandleLayout38VO) {
		List<AquariumfishWaterCandleLayout38VO> aquariumfishWaterCandleLayoutList = aquariumfishWaterCandleLayout38Service.aquariumfishWaterCandleLayoutList(aquariumfishWaterCandleLayout38VO);
		model.addAttribute("aquariumfishInfoList", aquariumfishWaterCandleLayoutList);
		model.addAttribute("aquariumfishWaterCandleLayout38VO",aquariumfishWaterCandleLayout38VO);
		
		return "sample/aquariumfish/aquariumfishWaterCandleLayoutList";
	}
	
	  @GetMapping("/syncAquariumfishWaterCandleLayoutForm") 
	  public String syncBookBestSellerForm(Model model, AquariumfishWaterCandleLayout38VO  aquariumfishWaterCandleLayout38VO){
			
			  if (!StringUtils.isEmpty( aquariumfishWaterCandleLayout38VO.getAwclIdx() )){ 
				  AquariumfishWaterCandleLayout38VO aquariumfishWaterCandleLayoutSelectOne = aquariumfishWaterCandleLayout38Service.aquariumfishWaterCandleLayoutSelectOne(aquariumfishWaterCandleLayout38VO);
			  model.addAttribute("aquariumfishWaterCandleLayout38VO", aquariumfishWaterCandleLayoutSelectOne); 
			  }
	  return "sample/aquariumfish/syncAquariumfishWaterCandleLayoutForm"; 
	  }
	 
	
	  @PostMapping("/syncAquariumfishWaterCandleLayoutFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, AquariumfishWaterCandleLayout38VO  aquariumfishWaterCandleLayout38VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = aquariumfishWaterCandleLayout38Service.insertAquariumfishWaterCandleLayout(aquariumfishWaterCandleLayout38VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = aquariumfishWaterCandleLayout38Service.updateAquariumfishWaterCandleLayout(aquariumfishWaterCandleLayout38VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = aquariumfishWaterCandleLayout38Service.deleteAquariumfishWaterCandleLayout(aquariumfishWaterCandleLayout38VO);
		  } 
		  return "redirect:aquariumfishWaterCandleLayoutList";
	  }
	 
}
