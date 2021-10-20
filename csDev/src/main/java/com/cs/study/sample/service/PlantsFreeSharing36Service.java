package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.PlantsFreeSharing36Mapper;
import com.cs.study.sample.vo.PlantsFreeSharing36VO;

@Service
public class PlantsFreeSharing36Service {
	
	public final PlantsFreeSharing36Mapper plantsFreeSharing36Mapper;
	public PlantsFreeSharing36Service(PlantsFreeSharing36Mapper plantsFreeSharing36Mapper) {
		this.plantsFreeSharing36Mapper = plantsFreeSharing36Mapper;
	}
	public PlantsFreeSharing36VO plantsFreeSharingSelectOne(PlantsFreeSharing36VO PlantsFreeSharing36VO) {
		return plantsFreeSharing36Mapper.plantsFreeSharingSelectOne(PlantsFreeSharing36VO);
	}
	public List<PlantsFreeSharing36VO> plantsFreeSharingList(PlantsFreeSharing36VO PlantsFreeSharing36VO){
		return plantsFreeSharing36Mapper.plantsFreeSharingList(PlantsFreeSharing36VO);
	}
	public int insertPlantsFreeSharing(PlantsFreeSharing36VO PlantsFreeSharing36VO) {
		return plantsFreeSharing36Mapper.insertPlantsFreeSharing(PlantsFreeSharing36VO);
	}
	
	public int savePlantsFreeSharing(PlantsFreeSharing36VO PlantsFreeSharing36VO) {
		return plantsFreeSharing36Mapper.savePlantsFreeSharing(PlantsFreeSharing36VO);
	} 
	
	public int updatePlantsFreeSharing(PlantsFreeSharing36VO PlantsFreeSharing36VO) {
		return plantsFreeSharing36Mapper.updatePlantsFreeSharing(PlantsFreeSharing36VO);
	} 
	
	public int deletePlantsFreeSharing(PlantsFreeSharing36VO PlantsFreeSharing36VO) {
		return plantsFreeSharing36Mapper.deletePlantsFreeSharing(PlantsFreeSharing36VO);
	} 
}
