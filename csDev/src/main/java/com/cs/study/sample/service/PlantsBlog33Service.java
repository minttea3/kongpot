package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.PlantsBlog33Mapper;
import com.cs.study.sample.vo.PlantsBlog33VO;

@Service
public class PlantsBlog33Service {
	
	public final PlantsBlog33Mapper plantsBlog33Mapper;
	public PlantsBlog33Service(PlantsBlog33Mapper plantsBlog33Mapper) {
		this.plantsBlog33Mapper = plantsBlog33Mapper;
	}
	public PlantsBlog33VO plantsBlogSelectOne(PlantsBlog33VO plantsBlog33VO) {
		return plantsBlog33Mapper.plantsBlogSelectOne(plantsBlog33VO);
	}
	public List<PlantsBlog33VO> plantsBlogList(PlantsBlog33VO plantsBlog33VO){
		return plantsBlog33Mapper.plantsBlogList(plantsBlog33VO);
	}
	public int insertPlantsBlog(PlantsBlog33VO plantsBlog33VO) {
		return plantsBlog33Mapper.insertPlantsBlog(plantsBlog33VO);
	}
	
	public int savePlantsBlog(PlantsBlog33VO plantsBlog33VO) {
		return plantsBlog33Mapper.savePlantsBlog(plantsBlog33VO);
	} 
	
	public int updatePlantsBlog(PlantsBlog33VO plantsBlog33VO) {
		return plantsBlog33Mapper.updatePlantsBlog(plantsBlog33VO);
	} 
	
	public int deletePlantsBlog(PlantsBlog33VO plantsBlog33VO) {
		return plantsBlog33Mapper.deletePlantsBlog(plantsBlog33VO);
	} 
}
