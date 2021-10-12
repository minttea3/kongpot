package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.FoodBestRestaurant22Mapper;
import com.cs.study.sample.vo.FoodBestRestaurant22VO;

@Service
public class FoodBestRestaurant22Service {
	
	public final FoodBestRestaurant22Mapper foodBestRestaurant22Mapper;
	public FoodBestRestaurant22Service(FoodBestRestaurant22Mapper foodBestRestaurant22Mapper) {
		this.foodBestRestaurant22Mapper = foodBestRestaurant22Mapper;
	}
	public FoodBestRestaurant22VO foodBestRestaurantSelectOne(FoodBestRestaurant22VO foodBestRestaurant22VO) {
		return foodBestRestaurant22Mapper.foodBestRestaurantSelectOne(foodBestRestaurant22VO);
	}
	public List<FoodBestRestaurant22VO> foodBestRestaurantList(FoodBestRestaurant22VO foodBestRestaurant22VO){
		return foodBestRestaurant22Mapper.foodBestRestaurantList(foodBestRestaurant22VO);
	}
	public int insertFoodBestRestaurant(FoodBestRestaurant22VO foodBestRestaurant22VO) {
		return foodBestRestaurant22Mapper.insertFoodBestRestaurant(foodBestRestaurant22VO);
	}
	
	public int saveFoodBestRestaurant(FoodBestRestaurant22VO foodBestRestaurant22VO) {
		return foodBestRestaurant22Mapper.saveFoodBestRestaurant(foodBestRestaurant22VO);
	} 
	
	public int updateFoodBestRestaurant(FoodBestRestaurant22VO foodBestRestaurant22VO) {
		return foodBestRestaurant22Mapper.updateFoodBestRestaurant(foodBestRestaurant22VO);
	} 
	
	public int deleteFoodBestRestaurant(FoodBestRestaurant22VO foodBestRestaurant22VO) {
		return foodBestRestaurant22Mapper.deleteFoodBestRestaurant(foodBestRestaurant22VO);
	} 
}
