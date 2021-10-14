package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.PlantsBirthFlower29VO;
@Mapper
public interface PlantsBirthFlower29Mapper {
	
	public PlantsBirthFlower29VO plantsBirthFlowerSelectOne(PlantsBirthFlower29VO plantsBirthFlower29VO); 

	public List<PlantsBirthFlower29VO> plantsBirthFlowerList(PlantsBirthFlower29VO plantsBirthFlower29VO);
	
	public int insertPlantsBirthFlower(PlantsBirthFlower29VO plantsBirthFlower29VO); 
	
	public int savePlantsBirthFlower(PlantsBirthFlower29VO plantsBirthFlower29VO); 
	
	public int updatePlantsBirthFlower(PlantsBirthFlower29VO plantsBirthFlower29VO); 
	
	public int deletePlantsBirthFlower(PlantsBirthFlower29VO plantsBirthFlower29VO);
}
