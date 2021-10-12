package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.BookBestseller8Mapper;
import com.cs.study.sample.mapper.FoodSeasonInfo19Mapper;
import com.cs.study.sample.vo.FoodSeasonInfo19VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;

@Service
public class FoodSeasonInfo19Service {
	
	public final FoodSeasonInfo19Mapper foodSeasonInfo19Mapper;
	public FoodSeasonInfo19Service(FoodSeasonInfo19Mapper foodSeasonInfo19Mapper) {
		this.foodSeasonInfo19Mapper = foodSeasonInfo19Mapper;
	}
	public FoodSeasonInfo19VO foodSeasonInfoSelectOne(FoodSeasonInfo19VO foodSeasonInfo19VO) {
		return foodSeasonInfo19Mapper.foodSeasonInfoSelectOne(foodSeasonInfo19VO);
	}
	public List<FoodSeasonInfo19VO> foodSeasonInfoList(FoodSeasonInfo19VO foodSeasonInfo19VO){
		return foodSeasonInfo19Mapper.foodSeasonInfoList(foodSeasonInfo19VO);
	}
	public int insertFoodSeasonInfo(FoodSeasonInfo19VO foodSeasonInfo19VO) {
		return foodSeasonInfo19Mapper.insertFoodSeasonInfo(foodSeasonInfo19VO);
	}
	
	public int saveFoodSeasonInfo(FoodSeasonInfo19VO foodSeasonInfo19VO) {
		return foodSeasonInfo19Mapper.saveFoodSeasonInfo(foodSeasonInfo19VO);
	} 
	
	public int updateFoodSeasonInfo(FoodSeasonInfo19VO foodSeasonInfo19VO) {
		return foodSeasonInfo19Mapper.updateFoodSeasonInfo(foodSeasonInfo19VO);
	} 
	
	public int deleteFoodSeasonInfo(FoodSeasonInfo19VO foodSeasonInfo19VO) {
		return foodSeasonInfo19Mapper.deleteFoodSeasonInfo(foodSeasonInfo19VO);
	} 
}
