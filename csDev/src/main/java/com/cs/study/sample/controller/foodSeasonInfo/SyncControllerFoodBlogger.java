package com.cs.study.sample.controller.foodSeasonInfo;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.FoodBlogger21Service;
import com.cs.study.sample.service.FoodRecipe20Service;
import com.cs.study.sample.vo.FoodBlogger21VO;
import com.cs.study.sample.vo.FoodRecipe20VO;

@Controller
public class SyncControllerFoodBlogger {

	
	  private final FoodBlogger21Service foodBlogger21Service;
	  
	  public SyncControllerFoodBlogger(FoodBlogger21Service foodBlogger21Service) {
		this.foodBlogger21Service = foodBlogger21Service;
	  }
	 
	 
	@GetMapping("/foodBloggerList")
	public String studyCertificateNewsList(Model model, FoodBlogger21VO foodBlogger21VO) {
		
		List<FoodBlogger21VO> foodBloggerList = foodBlogger21Service.foodBloggerList(foodBlogger21VO);
		model.addAttribute("foodBloggerList",foodBloggerList);
		model.addAttribute("foodBlogger21VO",foodBlogger21VO);
		 
		return "sample/food/foodBloggerList";
	}
	
	 @GetMapping("/syncFoodBloggerForm") 
		public String syncStudyCertificateNewsForm(Model model, FoodBlogger21VO foodBlogger21VO){
		  
		  if (!StringUtils.isEmpty( foodBlogger21VO.getFbIdx() )){
			  
			  FoodBlogger21VO foodBloggerSelectOne = foodBlogger21Service.foodBloggerSelectOne(foodBlogger21VO);
			  model.addAttribute("foodBlogger21VO", foodBloggerSelectOne); 
		  }
	  
	  return "sample/food/syncFoodBloggerForm"; 
	  }
	 
	 @PostMapping("/syncFoodBloggerFormSave")
	 public String syncStudyCertificateNewsFormSave(Model model, FoodBlogger21VO foodBlogger21VO, @RequestParam(value="action", required=true) String action){
       if ( "insert".equals(action) ){
           int insertCnt = foodBlogger21Service.insertFoodBlogger(foodBlogger21VO);
       }else if ( "update".equals(action) ){
           int updateCnt = foodBlogger21Service.updateFoodBlogger(foodBlogger21VO);
       }else if ( "delete".equals(action) ){
           int deleteCnt = foodBlogger21Service.deleteFoodBlogger(foodBlogger21VO);
       }
       return "redirect:/foodBloggerList";
	 }
}
