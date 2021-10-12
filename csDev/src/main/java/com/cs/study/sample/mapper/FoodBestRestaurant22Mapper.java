package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.FoodBestRestaurant22VO;

@Mapper
public interface FoodBestRestaurant22Mapper {
	public FoodBestRestaurant22VO foodBestRestaurantSelectOne(FoodBestRestaurant22VO foodBestRestaurant22VO);
	
	public List<FoodBestRestaurant22VO> foodBestRestaurantList(FoodBestRestaurant22VO foodBestRestaurant22VO);
	
	public int insertFoodBestRestaurant(FoodBestRestaurant22VO foodBestRestaurant22VO);
	
	public int saveFoodBestRestaurant(FoodBestRestaurant22VO foodBestRestaurant22VO); 
	
	public int updateFoodBestRestaurant(FoodBestRestaurant22VO foodBestRestaurant22VO); 
	
	public int deleteFoodBestRestaurant(FoodBestRestaurant22VO foodBestRestaurant22VO); 
	
	
}
