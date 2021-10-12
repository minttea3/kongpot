package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.FoodBlogger21VO;
@Mapper
public interface FoodBlogger21Mapper {
	
	public FoodBlogger21VO foodBloggerSelectOne(FoodBlogger21VO foodBlogger21VO); 

	public List<FoodBlogger21VO> foodBloggerList(FoodBlogger21VO foodBlogger21VO);
	
	public int insertFoodBlogger(FoodBlogger21VO foodBlogger21VO); 
	
	public int saveFoodBlogger(FoodBlogger21VO foodBlogger21VO); 
	
	public int updateFoodBlogger(FoodBlogger21VO foodBlogger21VO); 
	
	public int deleteFoodBlogger(FoodBlogger21VO foodBlogger21VO);
}
