package com.cs.study.sample.controller.plants;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.PlantsCare31Service;
import com.cs.study.sample.service.PlantsInfo30Service;
import com.cs.study.sample.vo.PlantsCare31VO;
import com.cs.study.sample.vo.PlantsCare31VO;

@Controller
public class SyncControllerPlantsCare {

	
	  private final PlantsCare31Service plantsCare31Service;
	  
	  public SyncControllerPlantsCare(PlantsCare31Service plantsCare31Service) { 
		  this.plantsCare31Service = plantsCare31Service;
	  }
	 
	@GetMapping("/plantsCareList")
	public String bookBestSellerInfoList(Model model, PlantsCare31VO  plantsCare31VO) {
		List<PlantsCare31VO> plantsInfoList = plantsCare31Service.plantsCareList(plantsCare31VO);
		model.addAttribute("plantsCareList", plantsInfoList);
		model.addAttribute("plantsCare31VO",plantsCare31VO);
		
		return "sample/plants/plantsCareList";
	}
	
	  @GetMapping("/syncPlantsCareForm") 
	  public String syncBookBestSellerForm(Model model, PlantsCare31VO  plantsCare31VO){
			
			  if (!StringUtils.isEmpty( plantsCare31VO.getPbfIdx() )){ 
				  PlantsCare31VO plantsCareSelectOne = plantsCare31Service.plantsCareSelectOne(plantsCare31VO);
			  model.addAttribute("plantsCare31VO", plantsCareSelectOne); 
			  }
	  return "sample/plants/syncPlantsCareForm"; 
	  }
	 
	
	  @PostMapping("/syncPlantsCareFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, PlantsCare31VO  plantsCare31VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = plantsCare31Service.insertPlantsCare(plantsCare31VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = plantsCare31Service.updatePlantsCare(plantsCare31VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = plantsCare31Service.deletePlantsCare(plantsCare31VO);
		  } 
		  return "redirect:plantsCareList";
	  }
	 
}
