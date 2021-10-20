package com.cs.study.sample.controller.plants;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.PlantsBlog33Service;
import com.cs.study.sample.service.PlantsBlogger32Service;
import com.cs.study.sample.service.PlantsCare31Service;
import com.cs.study.sample.service.PlantsEvent35Service;
import com.cs.study.sample.service.PlantsFreeSharing36Service;
import com.cs.study.sample.service.PlantsInfo30Service;
import com.cs.study.sample.vo.PlantsFreeSharing36VO;
import com.cs.study.sample.vo.PlantsFreeSharing36VO;
import com.cs.study.sample.vo.PlantsFreeSharing36VO;
import com.cs.study.sample.vo.PlantsFreeSharing36VO;
import com.cs.study.sample.vo.PlantsFreeSharing36VO;
import com.cs.study.sample.vo.PlantsFreeSharing36VO;

@Controller
public class SyncControllerPlantsFreeSharing {

	
	  private final PlantsFreeSharing36Service plantsFreeSharing36Service;
	  
	  public SyncControllerPlantsFreeSharing(PlantsFreeSharing36Service plantsFreeSharing36Service) { 
		  this.plantsFreeSharing36Service = plantsFreeSharing36Service;
	  }
	 
	@GetMapping("/plantsFreeSharingList")
	public String bookBestSellerInfoList(Model model, PlantsFreeSharing36VO  plantsFreeSharing36VO) {
		List<PlantsFreeSharing36VO> plantsFreeSharingList = plantsFreeSharing36Service.plantsFreeSharingList(plantsFreeSharing36VO);
		model.addAttribute("plantsFreeSharingList", plantsFreeSharingList);
		model.addAttribute("plantsFreeSharing36VO",plantsFreeSharing36VO);
		
		return "sample/plants/plantsFreeSharingList";
	}
	
	  @GetMapping("/syncPlantsFreeSharingForm") 
	  public String syncBookBestSellerForm(Model model, PlantsFreeSharing36VO  plantsFreeSharing36VO){
			
			  if (!StringUtils.isEmpty( plantsFreeSharing36VO.getPfsIdx() )){ 
				  PlantsFreeSharing36VO plantsFreeSharingSelectOne = plantsFreeSharing36Service.plantsFreeSharingSelectOne(plantsFreeSharing36VO);
			  model.addAttribute("plantsFreeSharing36VO", plantsFreeSharingSelectOne); 
			  }
	  return "sample/plants/syncPlantsFreeSharingForm"; 
	  }
	 
	
	  @PostMapping("/syncPlantsFreeSharingFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, PlantsFreeSharing36VO  plantsFreeSharing36VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = plantsFreeSharing36Service.insertPlantsFreeSharing(plantsFreeSharing36VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = plantsFreeSharing36Service.updatePlantsFreeSharing(plantsFreeSharing36VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = plantsFreeSharing36Service.deletePlantsFreeSharing(plantsFreeSharing36VO);
		  } 
		  return "redirect:plantsFreeSharingList";
	  }
	 
}
