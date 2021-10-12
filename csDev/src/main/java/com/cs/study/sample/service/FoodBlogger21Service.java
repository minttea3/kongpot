package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.BookBestseller8Mapper;
import com.cs.study.sample.mapper.FoodBlogger21Mapper;
import com.cs.study.sample.mapper.FoodRecipe20Mapper;
import com.cs.study.sample.mapper.FoodSeasonInfo19Mapper;
import com.cs.study.sample.vo.FoodRecipe20VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.FoodBlogger21VO;

@Service
public class FoodBlogger21Service {
	
	public final FoodBlogger21Mapper foodBlogger21Mapper;
	public FoodBlogger21Service(FoodBlogger21Mapper foodBlogger21Mapper) {
		this.foodBlogger21Mapper = foodBlogger21Mapper;
	}
	public FoodBlogger21VO foodBloggerSelectOne(FoodBlogger21VO foodBlogger21VO) {
		return foodBlogger21Mapper.foodBloggerSelectOne(foodBlogger21VO);
	}
	public List<FoodBlogger21VO> foodBloggerList(FoodBlogger21VO foodBlogger21VO){
		return foodBlogger21Mapper.foodBloggerList(foodBlogger21VO);
	}
	public int insertFoodBlogger(FoodBlogger21VO foodBlogger21VO) {
		return foodBlogger21Mapper.insertFoodBlogger(foodBlogger21VO);
	}
	
	public int saveFoodBlogger(FoodBlogger21VO foodBlogger21VO) {
		return foodBlogger21Mapper.saveFoodBlogger(foodBlogger21VO);
	} 
	
	public int updateFoodBlogger(FoodBlogger21VO foodBlogger21VO) {
		return foodBlogger21Mapper.updateFoodBlogger(foodBlogger21VO);
	} 
	
	public int deleteFoodBlogger(FoodBlogger21VO foodBlogger21VO) {
		return foodBlogger21Mapper.deleteFoodBlogger(foodBlogger21VO);
	} 
}
