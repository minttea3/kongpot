package com.cs.study.sample.controller.plants;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.PlantsBlogger32Service;
import com.cs.study.sample.service.PlantsCare31Service;
import com.cs.study.sample.service.PlantsInfo30Service;
import com.cs.study.sample.vo.PlantsBlogger32VO;
import com.cs.study.sample.vo.PlantsBlogger32VO;
import com.cs.study.sample.vo.PlantsBlogger32VO;

@Controller
public class SyncControllerPlantsBlogger {

	
	  private final PlantsBlogger32Service plantsBlogger32Service;
	  
	  public SyncControllerPlantsBlogger(PlantsBlogger32Service plantsBlogger32Service) { 
		  this.plantsBlogger32Service = plantsBlogger32Service;
	  }
	 
	@GetMapping("/plantsBloggerList")
	public String bookBestSellerInfoList(Model model, PlantsBlogger32VO  plantsBlogger32VO) {
		List<PlantsBlogger32VO> plantsBloggerList = plantsBlogger32Service.plantsBloggerList(plantsBlogger32VO);
		model.addAttribute("plantsBloggerList", plantsBloggerList);
		model.addAttribute("plantsBlogger32VO",plantsBlogger32VO);
		
		return "sample/plants/plantsBloggerList";
	}
	
	  @GetMapping("/syncPlantsBloggerForm") 
	  public String syncBookBestSellerForm(Model model, PlantsBlogger32VO  plantsBlogger32VO){
			
			  if (!StringUtils.isEmpty( plantsBlogger32VO.getPbIdx() )){ 
				  PlantsBlogger32VO plantsBloggerSelectOne = plantsBlogger32Service.plantsBloggerSelectOne(plantsBlogger32VO);
			  model.addAttribute("plantsBlogger32VO", plantsBloggerSelectOne); 
			  }
	  return "sample/plants/syncPlantsBloggerForm"; 
	  }
	 
	
	  @PostMapping("/syncPlantsBloggerFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, PlantsBlogger32VO  plantsBlogger32VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = plantsBlogger32Service.insertPlantsBlogger(plantsBlogger32VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = plantsBlogger32Service.updatePlantsBlogger(plantsBlogger32VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = plantsBlogger32Service.deletePlantsBlogger(plantsBlogger32VO);
		  } 
		  return "redirect:plantsBloggerList";
	  }
	 
}
