package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.FoodSeasonInfo19VO;
@Mapper
public interface FoodSeasonInfo19Mapper {
	
	public FoodSeasonInfo19VO foodSeasonInfoSelectOne(FoodSeasonInfo19VO foodSeasonInfo19VO); 

	public List<FoodSeasonInfo19VO> foodSeasonInfoList(FoodSeasonInfo19VO foodSeasonInfo19VO);
	
	public int insertFoodSeasonInfo(FoodSeasonInfo19VO foodSeasonInfo19VO); 
	
	public int saveFoodSeasonInfo(FoodSeasonInfo19VO foodSeasonInfo19VO); 
	
	public int updateFoodSeasonInfo(FoodSeasonInfo19VO foodSeasonInfo19VO); 
	
	public int deleteFoodSeasonInfo(FoodSeasonInfo19VO foodSeasonInfo19VO);
}
