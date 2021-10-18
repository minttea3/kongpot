package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.PlantsBlogger32Mapper;
import com.cs.study.sample.vo.PlantsBlogger32VO;

@Service
public class PlantsBlogger32Service {
	
	public final PlantsBlogger32Mapper plantsBlogger32Mapper;
	public PlantsBlogger32Service(PlantsBlogger32Mapper plantsBlogger32Mapper) {
		this.plantsBlogger32Mapper = plantsBlogger32Mapper;
	}
	public PlantsBlogger32VO plantsBloggerSelectOne(PlantsBlogger32VO plantsBlogger32VO) {
		return plantsBlogger32Mapper.plantsBloggerSelectOne(plantsBlogger32VO);
	}
	public List<PlantsBlogger32VO> plantsBloggerList(PlantsBlogger32VO plantsBlogger32VO){
		return plantsBlogger32Mapper.plantsBloggerList(plantsBlogger32VO);
	}
	public int insertPlantsBlogger(PlantsBlogger32VO plantsBlogger32VO) {
		
		if(plantsBlogger32VO.getPbActivityStatus()==null) {
			plantsBlogger32VO.setPbActivityStatus("N");
		}
		return plantsBlogger32Mapper.insertPlantsBlogger(plantsBlogger32VO);
	}
	
	public int savePlantsBlogger(PlantsBlogger32VO plantsBlogger32VO) {
		return plantsBlogger32Mapper.savePlantsBlogger(plantsBlogger32VO);
	} 
	
	public int updatePlantsBlogger(PlantsBlogger32VO plantsBlogger32VO) {
		if(plantsBlogger32VO.getPbActivityStatus()==null) {
			plantsBlogger32VO.setPbActivityStatus("N");
		}
		return plantsBlogger32Mapper.updatePlantsBlogger(plantsBlogger32VO);
	} 
	
	public int deletePlantsBlogger(PlantsBlogger32VO plantsBlogger32VO) {
		return plantsBlogger32Mapper.deletePlantsBlogger(plantsBlogger32VO);
	} 
}
