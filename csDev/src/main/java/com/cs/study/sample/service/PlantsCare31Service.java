package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.PlantsCare31Mapper;
import com.cs.study.sample.vo.PlantsCare31VO;

@Service
public class PlantsCare31Service {
	
	public final PlantsCare31Mapper plantsCare31Mapper;
	public PlantsCare31Service(PlantsCare31Mapper plantsCare31Mapper) {
		this.plantsCare31Mapper = plantsCare31Mapper;
	}
	public PlantsCare31VO plantsCareSelectOne(PlantsCare31VO plantsCare31VO) {
		return plantsCare31Mapper.plantsCareSelectOne(plantsCare31VO);
	}
	public List<PlantsCare31VO> plantsCareList(PlantsCare31VO plantsCare31VO){
		return plantsCare31Mapper.plantsCareList(plantsCare31VO);
	}
	public int insertPlantsCare(PlantsCare31VO plantsCare31VO) {
		return plantsCare31Mapper.insertPlantsCare(plantsCare31VO);
	}
	
	public int savePlantsCare(PlantsCare31VO plantsCare31VO) {
		return plantsCare31Mapper.savePlantsCare(plantsCare31VO);
	} 
	
	public int updatePlantsCare(PlantsCare31VO plantsCare31VO) {
		return plantsCare31Mapper.updatePlantsCare(plantsCare31VO);
	} 
	
	public int deletePlantsCare(PlantsCare31VO plantsCare31VO) {
		return plantsCare31Mapper.deletePlantsCare(plantsCare31VO);
	} 
}
