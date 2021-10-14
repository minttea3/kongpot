package com.cs.study.sample.controller.plants;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.BookBestseller8Service;
import com.cs.study.sample.service.BookEvent11Service;
import com.cs.study.sample.service.BookForeignNovelsInfo7Service;
import com.cs.study.sample.service.BookKoreanNovelsInfo6Service;
import com.cs.study.sample.service.PlantsBirthFlower29Service;
import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookEvent11VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.BookKoreanNovelsInfo6VO;
import com.cs.study.sample.vo.PlantsBirthFlower29VO;

@Controller
public class SyncControllerPlantsBitrhFlower {

	
	  private final PlantsBirthFlower29Service plantsBirthFlower29Service;
	  
	  public SyncControllerPlantsBitrhFlower(PlantsBirthFlower29Service plantsBirthFlower29Service) { 
		  this.plantsBirthFlower29Service = plantsBirthFlower29Service;
	  }
	 
	@GetMapping("/plantsBirthFlowerList")
	public String bookBestSellerInfoList(Model model, PlantsBirthFlower29VO  plantsBirthFlower29VO) {
		List<PlantsBirthFlower29VO> plantsBirthFlowerList = plantsBirthFlower29Service.plantsBirthFlowerList(plantsBirthFlower29VO);
		model.addAttribute("plantsBirthFlowerList", plantsBirthFlowerList);
		model.addAttribute("plantsBirthFlower29VO",plantsBirthFlower29VO);
		
		return "sample/plants/plantsBirthFlowerList";
	}
	
	  @GetMapping("/syncPlantsBirthFlowerForm") 
	  public String syncBookBestSellerForm(Model model, PlantsBirthFlower29VO  plantsBirthFlower29VO){
			
			  if (!StringUtils.isEmpty( plantsBirthFlower29VO.getPbfIdx() )){ 
				  PlantsBirthFlower29VO plantsBirthFlowerSelectOne = plantsBirthFlower29Service.plantsBirthFlowerSelectOne(plantsBirthFlower29VO);
			  model.addAttribute("plantsBirthFlower29VO", plantsBirthFlowerSelectOne); 
			  }
	  return "sample/plants/syncPlantsBirthFlowerForm"; 
	  }
	 
	
	  @PostMapping("/syncPlantsBirthFlowerFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, PlantsBirthFlower29VO  plantsBirthFlower29VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = plantsBirthFlower29Service.insertPlantsBirthFlower(plantsBirthFlower29VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = plantsBirthFlower29Service.updatePlantsBirthFlower(plantsBirthFlower29VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = plantsBirthFlower29Service.deletePlantsBirthFlower(plantsBirthFlower29VO);
		  } 
		  return "redirect:plantsBirthFlowerList";
	  }
	 
}
