package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.AquariumfishInfo37Mapper;
import com.cs.study.sample.vo.AquariumfishInfo37VO;

@Service
public class AquariumfishInfo37Service {
	
	public final AquariumfishInfo37Mapper aquariumfishInfo37Mapper;
	public AquariumfishInfo37Service(AquariumfishInfo37Mapper aquariumfishInfo37Mapper) {
		this.aquariumfishInfo37Mapper = aquariumfishInfo37Mapper;
	}
	public AquariumfishInfo37VO aquariumfishInfoSelectOne(AquariumfishInfo37VO aquariumfishInfo37VO) {
		return aquariumfishInfo37Mapper.aquariumfishInfoSelectOne(aquariumfishInfo37VO);
	}
	public List<AquariumfishInfo37VO> aquariumfishInfoList(AquariumfishInfo37VO aquariumfishInfo37VO){
		return aquariumfishInfo37Mapper.aquariumfishInfoList(aquariumfishInfo37VO);
	}
	public int insertAquariumfishInfo(AquariumfishInfo37VO aquariumfishInfo37VO) {
		return aquariumfishInfo37Mapper.insertAquariumfishInfo(aquariumfishInfo37VO);
	}
	
	public int saveAquariumfishInfo(AquariumfishInfo37VO aquariumfishInfo37VO) {
		return aquariumfishInfo37Mapper.saveAquariumfishInfo(aquariumfishInfo37VO);
	} 
	
	public int updateAquariumfishInfo(AquariumfishInfo37VO aquariumfishInfo37VO) {
		return aquariumfishInfo37Mapper.updateAquariumfishInfo(aquariumfishInfo37VO);
	} 
	
	public int deleteAquariumfishInfo(AquariumfishInfo37VO aquariumfishInfo37VO) {
		return aquariumfishInfo37Mapper.deleteAquariumfishInfo(aquariumfishInfo37VO);
	} 
}
