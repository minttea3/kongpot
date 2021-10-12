package com.cs.study.sample.controller.foodSeasonInfo;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.FoodBestRestaurant22Service;
import com.cs.study.sample.vo.FoodBestRestaurant22VO;

@Controller
public class SyncControllerFoodBestRestaurant {

	
	  private final FoodBestRestaurant22Service foodBestRestaurant22Service;
	  
	  public SyncControllerFoodBestRestaurant(FoodBestRestaurant22Service foodBestRestaurant22Service) {
		this.foodBestRestaurant22Service = foodBestRestaurant22Service;
	  }
	 
	 
	@GetMapping("/foodBestRestaurantList")
	public String studyCertificateNewsList(Model model, FoodBestRestaurant22VO foodBestRestaurant22VO) {
		
		List<FoodBestRestaurant22VO> foodBestRestaurantList = foodBestRestaurant22Service.foodBestRestaurantList(foodBestRestaurant22VO);
		model.addAttribute("foodBestRestaurantList",foodBestRestaurantList);
		model.addAttribute("foodBestRestaurant22VO",foodBestRestaurant22VO);
		 
		return "sample/food/foodBestRestaurantList";
	}
	
	 @GetMapping("/syncFoodBestRestaurantForm") 
		public String syncStudyCertificateNewsForm(Model model, FoodBestRestaurant22VO foodBestRestaurant22VO){
		  
		  if (!StringUtils.isEmpty( foodBestRestaurant22VO.getFbrIdx() )){
			  
			  FoodBestRestaurant22VO foodBestRestaurantSelectOne = foodBestRestaurant22Service.foodBestRestaurantSelectOne(foodBestRestaurant22VO);
			  model.addAttribute("foodBestRestaurant22VO", foodBestRestaurantSelectOne); 
		  }
	  
	  return "sample/food/syncFoodBestRestaurantForm"; 
	  }
	 
	 @PostMapping("/syncFoodBestRestaurantFormSave")
	 public String syncStudyCertificateNewsFormSave(Model model, FoodBestRestaurant22VO foodBestRestaurant22VO, @RequestParam(value="action", required=true) String action){
       if ( "insert".equals(action) ){
           int insertCnt = foodBestRestaurant22Service.insertFoodBestRestaurant(foodBestRestaurant22VO);
       }else if ( "update".equals(action) ){
           int updateCnt = foodBestRestaurant22Service.updateFoodBestRestaurant(foodBestRestaurant22VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = foodBestRestaurant22Service.deleteFoodBestRestaurant(foodBestRestaurant22VO);
       }
       return "redirect:/foodBestRestaurantList";
	 }
}
