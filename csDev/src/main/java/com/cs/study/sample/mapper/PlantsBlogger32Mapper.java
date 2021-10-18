package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.PlantsBlogger32VO;
@Mapper
public interface PlantsBlogger32Mapper {
	
	public PlantsBlogger32VO plantsBloggerSelectOne(PlantsBlogger32VO plantsBlogger32VO); 

	public List<PlantsBlogger32VO> plantsBloggerList(PlantsBlogger32VO plantsBlogger32VO);
	
	public int insertPlantsBlogger(PlantsBlogger32VO plantsBlogger32VO); 
	
	public int savePlantsBlogger(PlantsBlogger32VO plantsBlogger32VO); 
	
	public int updatePlantsBlogger(PlantsBlogger32VO plantsBlogger32VO); 
	
	public int deletePlantsBlogger(PlantsBlogger32VO plantsBlogger32VO);
}
