package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.PlantsBirthFlower29Mapper;
import com.cs.study.sample.vo.PlantsBirthFlower29VO;

@Service
public class PlantsBirthFlower29Service {
	
	public final PlantsBirthFlower29Mapper plantsBirthFlower29Mapper;
	public PlantsBirthFlower29Service(PlantsBirthFlower29Mapper plantsBirthFlower29Mapper) {
		this.plantsBirthFlower29Mapper = plantsBirthFlower29Mapper;
	}
	public PlantsBirthFlower29VO plantsBirthFlowerSelectOne(PlantsBirthFlower29VO plantsBirthFlower29VO) {
		return plantsBirthFlower29Mapper.plantsBirthFlowerSelectOne(plantsBirthFlower29VO);
	}
	public List<PlantsBirthFlower29VO> plantsBirthFlowerList(PlantsBirthFlower29VO plantsBirthFlower29VO){
		return plantsBirthFlower29Mapper.plantsBirthFlowerList(plantsBirthFlower29VO);
	}
	public int insertPlantsBirthFlower(PlantsBirthFlower29VO plantsBirthFlower29VO) {
		return plantsBirthFlower29Mapper.insertPlantsBirthFlower(plantsBirthFlower29VO);
	}
	
	public int savePlantsBirthFlower(PlantsBirthFlower29VO plantsBirthFlower29VO) {
		return plantsBirthFlower29Mapper.savePlantsBirthFlower(plantsBirthFlower29VO);
	} 
	
	public int updatePlantsBirthFlower(PlantsBirthFlower29VO plantsBirthFlower29VO) {
		return plantsBirthFlower29Mapper.updatePlantsBirthFlower(plantsBirthFlower29VO);
	} 
	
	public int deletePlantsBirthFlower(PlantsBirthFlower29VO plantsBirthFlower29VO) {
		return plantsBirthFlower29Mapper.deletePlantsBirthFlower(plantsBirthFlower29VO);
	} 
}
