package com.cs.study.sample.controller.foodSeasonInfo;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.FoodRecipe20Service;
import com.cs.study.sample.vo.FoodRecipe20VO;

@Controller
public class SyncControllerFoodRecipe {

	
	  private final FoodRecipe20Service foodRecipe20Service;
	  
	  public SyncControllerFoodRecipe(FoodRecipe20Service foodRecipe20Service) {
		this.foodRecipe20Service = foodRecipe20Service;
	  }
	 
	 
	@GetMapping("/foodRecipeList")
	public String studyCertificateNewsList(Model model, FoodRecipe20VO foodRecipe20VO) {
		
		List<FoodRecipe20VO> foodRecipeList = foodRecipe20Service.foodRecipeList(foodRecipe20VO);
		model.addAttribute("foodRecipeList",foodRecipeList);
		model.addAttribute("foodRecipe20VO",foodRecipe20VO);
		 
		return "sample/food/foodRecipeList";
	}
	
	 @GetMapping("/syncFoodRecipeForm") 
		public String syncStudyCertificateNewsForm(Model model, FoodRecipe20VO foodRecipe20VO){
		  
		  if (!StringUtils.isEmpty( foodRecipe20VO.getFrIdx() )){
			  
			  FoodRecipe20VO foodRecipeSelectOne = foodRecipe20Service.foodRecipeSelectOne(foodRecipe20VO);
			  model.addAttribute("foodRecipe20VO", foodRecipeSelectOne); 
		  }
	  
	  return "sample/food/syncFoodRecipeForm"; 
	  }
	 
	 @PostMapping("/syncFoodRecipeFormSave")
	 public String syncStudyCertificateNewsFormSave(Model model, FoodRecipe20VO foodRecipe20VO, @RequestParam(value="action", required=true) String action){
       if ( "insert".equals(action) ){
           int insertCnt = foodRecipe20Service.insertFoodRecipe(foodRecipe20VO);
       }else if ( "update".equals(action) ){
           int updateCnt = foodRecipe20Service.updateFoodRecipe(foodRecipe20VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = foodRecipe20Service.deleteFoodRecipe(foodRecipe20VO);
       }
       return "redirect:/foodRecipeList";
	 }
}
