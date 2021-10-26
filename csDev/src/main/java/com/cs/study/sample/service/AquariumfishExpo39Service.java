package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.AquariumfishExpo39Mapper;
import com.cs.study.sample.vo.AquariumfishExpo39VO;

@Service
public class AquariumfishExpo39Service {
	
	public final AquariumfishExpo39Mapper aquariumfishExpo39Mapper;
	public AquariumfishExpo39Service(AquariumfishExpo39Mapper aquariumfishExpo39Mapper	) {
		this.aquariumfishExpo39Mapper = aquariumfishExpo39Mapper;
	}
	public AquariumfishExpo39VO aquariumfishExpoSelectOne(AquariumfishExpo39VO aquariumfishExpo39VO) {
		return aquariumfishExpo39Mapper.aquariumfishExpoSelectOne(aquariumfishExpo39VO);
	}
	public List<AquariumfishExpo39VO> aquariumfishExpoList(AquariumfishExpo39VO aquariumfishExpo39VO){
		return aquariumfishExpo39Mapper.aquariumfishExpoList(aquariumfishExpo39VO);
	}
	public int insertAquariumfishExpo(AquariumfishExpo39VO aquariumfishExpo39VO) {
		if(aquariumfishExpo39VO.getAeStatus() == null) {
			aquariumfishExpo39VO.setAeStatus("N");
		}
		
		return aquariumfishExpo39Mapper.insertAquariumfishExpo(aquariumfishExpo39VO);
	}
	
	public int saveAquariumsaveAquariumfishExpofishInfo(AquariumfishExpo39VO aquariumfishExpo39VO) {
		if(aquariumfishExpo39VO.getAeStatus() == null) {
			aquariumfishExpo39VO.setAeStatus("N");
		}
		return aquariumfishExpo39Mapper.saveAquariumsaveAquariumfishExpofishInfo(aquariumfishExpo39VO);
	} 
	
	public int updateAquariumfishExpo(AquariumfishExpo39VO aquariumfishExpo39VO) {
		if(aquariumfishExpo39VO.getAeStatus() == null) {
			aquariumfishExpo39VO.setAeStatus("N");
		}
		return aquariumfishExpo39Mapper.updateAquariumfishExpo(aquariumfishExpo39VO);
	} 
	
	public int deleteAquariumfishExpo(AquariumfishExpo39VO aquariumfishExpo39VO) {
		return aquariumfishExpo39Mapper.deleteAquariumfishExpo(aquariumfishExpo39VO);
	} 
}
