package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.PlantsBlog33VO;
@Mapper
public interface PlantsBlog33Mapper {
	
	public PlantsBlog33VO plantsBlogSelectOne(PlantsBlog33VO plantsBlog33VO); 

	public List<PlantsBlog33VO> plantsBlogList(PlantsBlog33VO plantsBlog33VO);
	
	public int insertPlantsBlog(PlantsBlog33VO plantsBlog33VO); 
	
	public int savePlantsBlog(PlantsBlog33VO plantsBlog33VO); 
	
	public int updatePlantsBlog(PlantsBlog33VO plantsBlog33VO); 
	
	public int deletePlantsBlog(PlantsBlog33VO plantsBlog33VO);
}
