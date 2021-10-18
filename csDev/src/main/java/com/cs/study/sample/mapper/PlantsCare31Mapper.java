package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.PlantsCare31VO;
@Mapper
public interface PlantsCare31Mapper {
	
	public PlantsCare31VO plantsCareSelectOne(PlantsCare31VO plantsCare31VO); 

	public List<PlantsCare31VO> plantsCareList(PlantsCare31VO plantsCare31VO);
	
	public int insertPlantsCare(PlantsCare31VO plantsCare31VO); 
	
	public int savePlantsCare(PlantsCare31VO plantsCare31VO); 
	
	public int updatePlantsCare(PlantsCare31VO plantsCare31VO); 
	
	public int deletePlantsCare(PlantsCare31VO plantsCare31VO);
}
