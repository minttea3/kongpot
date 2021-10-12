package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.FoodRecipe20VO;

@Mapper
public interface FoodRecipe20Mapper {
	public FoodRecipe20VO foodRecipeSelectOne(FoodRecipe20VO foodRecipe20VO);
	
	public List<FoodRecipe20VO> foodRecipeList(FoodRecipe20VO foodRecipe20VO);
	
	public int insertFoodRecipe(FoodRecipe20VO foodRecipe20VO);
	
	public int saveFoodRecipe(FoodRecipe20VO foodRecipe20VO); 
	
	public int updateFoodRecipe(FoodRecipe20VO foodRecipe20VO); 
	
	public int deleteFoodRecipe(FoodRecipe20VO foodRecipe20VO); 
	
	
}
