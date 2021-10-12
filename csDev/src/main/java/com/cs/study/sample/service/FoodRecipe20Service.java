package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.BookBestseller8Mapper;
import com.cs.study.sample.mapper.FoodRecipe20Mapper;
import com.cs.study.sample.mapper.FoodSeasonInfo19Mapper;
import com.cs.study.sample.vo.FoodRecipe20VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;

@Service
public class FoodRecipe20Service {
	
	public final FoodRecipe20Mapper foodRecipe20Mapper;
	public FoodRecipe20Service(FoodRecipe20Mapper foodRecipe20Mapper) {
		this.foodRecipe20Mapper = foodRecipe20Mapper;
	}
	public FoodRecipe20VO foodRecipeSelectOne(FoodRecipe20VO foodRecipe20VO) {
		return foodRecipe20Mapper.foodRecipeSelectOne(foodRecipe20VO);
	}
	public List<FoodRecipe20VO> foodRecipeList(FoodRecipe20VO foodRecipe20VO){
		return foodRecipe20Mapper.foodRecipeList(foodRecipe20VO);
	}
	public int insertFoodRecipe(FoodRecipe20VO foodRecipe20VO) {
		return foodRecipe20Mapper.insertFoodRecipe(foodRecipe20VO);
	}
	
	public int saveFoodRecipe(FoodRecipe20VO foodRecipe20VO) {
		return foodRecipe20Mapper.saveFoodRecipe(foodRecipe20VO);
	} 
	
	public int updateFoodRecipe(FoodRecipe20VO foodRecipe20VO) {
		return foodRecipe20Mapper.updateFoodRecipe(foodRecipe20VO);
	} 
	
	public int deleteFoodRecipe(FoodRecipe20VO foodRecipe20VO) {
		return foodRecipe20Mapper.deleteFoodRecipe(foodRecipe20VO);
	} 
}
