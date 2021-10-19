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
import com.cs.study.sample.service.PlantsInfo30Service;
import com.cs.study.sample.vo.PlantsBlog33VO;
import com.cs.study.sample.vo.PlantsBlog33VO;
import com.cs.study.sample.vo.PlantsBlog33VO;
import com.cs.study.sample.vo.PlantsBlog33VO;

@Controller
public class SyncControllerPlantsBlog {

	
	  private final PlantsBlog33Service plantsBlog33Service;
	  
	  public SyncControllerPlantsBlog(PlantsBlog33Service plantsBlog33Service) { 
		  this.plantsBlog33Service = plantsBlog33Service;
	  }
	 
	@GetMapping("/plantsBlogList")
	public String bookBestSellerInfoList(Model model, PlantsBlog33VO  plantsBlog33VO) {
		List<PlantsBlog33VO> plantsBloggerList = plantsBlog33Service.plantsBlogList(plantsBlog33VO);
		model.addAttribute("plantsBloggerList", plantsBloggerList);
		model.addAttribute("plantsBlog33VO",plantsBlog33VO);
		
		return "sample/plants/plantsBlogList";
	}
	
	  @GetMapping("/syncPlantsBlogForm") 
	  public String syncBookBestSellerForm(Model model, PlantsBlog33VO  plantsBlog33VO){
			
			  if (!StringUtils.isEmpty( plantsBlog33VO.getPbsIdx() )){ 
				  PlantsBlog33VO plantsBloggerSelectOne = plantsBlog33Service.plantsBlogSelectOne(plantsBlog33VO);
			  model.addAttribute("plantsBlog33VO", plantsBloggerSelectOne); 
			  }
	  return "sample/plants/syncPlantsBlogForm"; 
	  }
	 
	
	  @PostMapping("/syncPlantsBlogFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, PlantsBlog33VO  plantsBlog33VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = plantsBlog33Service.insertPlantsBlog(plantsBlog33VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = plantsBlog33Service.updatePlantsBlog(plantsBlog33VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = plantsBlog33Service.deletePlantsBlog(plantsBlog33VO);
		  } 
		  return "redirect:plantsBlogList";
	  }
	 
}
