package com.cs.study.sample.controller.foodSeasonInfo;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.FoodSeasonInfo19Service;
import com.cs.study.sample.service.StudyCertificateNews15Service;
import com.cs.study.sample.vo.FoodSeasonInfo19VO;
import com.cs.study.sample.vo.StudyCertificateNews15VO;

@Controller
public class SyncControllerFoodSeasonInfo {

	
	  private final FoodSeasonInfo19Service foodSeasonInfo19Service;
	  
	  public SyncControllerFoodSeasonInfo(FoodSeasonInfo19Service foodSeasonInfo19Service) {
		this.foodSeasonInfo19Service = foodSeasonInfo19Service;
	  }
	 
	 
	@GetMapping("/FoodSeasonInfoList")
	public String studyCertificateNewsList(Model model, FoodSeasonInfo19VO foodSeasonInfo19VO) {
		
		List<FoodSeasonInfo19VO> foodSeasonInfoList = foodSeasonInfo19Service.foodSeasonInfoList(foodSeasonInfo19VO);
		model.addAttribute("foodSeasonInfoList",foodSeasonInfoList);
		model.addAttribute("foodSeasonInfo19VO",foodSeasonInfo19VO);
		 
		return "sample/food/FoodSeasonInfoList";
	}
	
	 @GetMapping("/syncFoodSeasonInfoForm") 
	 public String syncStudyCertificateNewsForm(Model model, FoodSeasonInfo19VO foodSeasonInfo19VO){
		  
		  if (!StringUtils.isEmpty( foodSeasonInfo19VO.getFsiIdx() )){
			  
			  FoodSeasonInfo19VO foodSeasonInfoSelectOne = foodSeasonInfo19Service.foodSeasonInfoSelectOne(foodSeasonInfo19VO);
			  model.addAttribute("foodSeasonInfo19VO", foodSeasonInfoSelectOne); 
		  }
	  
	  return "sample/food/syncFoodSeasonInfoForm"; 
	  }
	 
	 @PostMapping("/syncFoodSeasonInfoFormSave")
	 public String syncStudyCertificateNewsFormSave(Model model, FoodSeasonInfo19VO foodSeasonInfo19VO, @RequestParam(value="action", required=true) String action){
       if ( "insert".equals(action) ){
           int insertCnt = foodSeasonInfo19Service.insertFoodSeasonInfo(foodSeasonInfo19VO);
       }else if ( "update".equals(action) ){
           int updateCnt = foodSeasonInfo19Service.updateFoodSeasonInfo(foodSeasonInfo19VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = foodSeasonInfo19Service.deleteFoodSeasonInfo(foodSeasonInfo19VO);
       }
       return "redirect:/FoodSeasonInfoList";
	 }
}
