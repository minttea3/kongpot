package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.AquariumfishStoreInfo42Mapper;
import com.cs.study.sample.vo.AquariumfishStoreInfo42VO;

@Service
public class AquariumfishStoreInfo42Service {
	
	public final AquariumfishStoreInfo42Mapper aquariumfishStoreInfo42Mapper;
	public AquariumfishStoreInfo42Service(AquariumfishStoreInfo42Mapper aquariumfishStoreInfo42Mapper	) {
		this.aquariumfishStoreInfo42Mapper = aquariumfishStoreInfo42Mapper;
	}
	public AquariumfishStoreInfo42VO aquariumfishStoreInfoSelectOne(AquariumfishStoreInfo42VO aquariumfishStoreInfo42VO) {
		return aquariumfishStoreInfo42Mapper.aquariumfishStoreInfoSelectOne(aquariumfishStoreInfo42VO);
	}
	public List<AquariumfishStoreInfo42VO> aquariumfishStoreInfoList(AquariumfishStoreInfo42VO aquariumfishStoreInfo42VO){
		return aquariumfishStoreInfo42Mapper.aquariumfishStoreInfoList(aquariumfishStoreInfo42VO);
	}
	public int insertAquariumfishStoreInfo(AquariumfishStoreInfo42VO aquariumfishStoreInfo42VO) {
		if(aquariumfishStoreInfo42VO.getAsiStatus() == null) {
			aquariumfishStoreInfo42VO.setAsiStatus("N");
		}
		return aquariumfishStoreInfo42Mapper.insertAquariumfishStoreInfo(aquariumfishStoreInfo42VO);
	}
	
	public int saveAquariumfishStoreInfo(AquariumfishStoreInfo42VO aquariumfishStoreInfo42VO) {
		if(aquariumfishStoreInfo42VO.getAsiStatus() == null) {
			aquariumfishStoreInfo42VO.setAsiStatus("N");
		}
		return aquariumfishStoreInfo42Mapper.saveAquariumfishStoreInfo(aquariumfishStoreInfo42VO);
	} 
	
	public int updateAquariumfishStoreInfo(AquariumfishStoreInfo42VO aquariumfishStoreInfo42VO) {
		if(aquariumfishStoreInfo42VO.getAsiStatus() == null) {
			aquariumfishStoreInfo42VO.setAsiStatus("N");
		}
		return aquariumfishStoreInfo42Mapper.updateAquariumfishStoreInfo(aquariumfishStoreInfo42VO);
	} 
	
	public int deleteAquariumfishStoreInfo(AquariumfishStoreInfo42VO aquariumfishStoreInfo42VO) {
		return aquariumfishStoreInfo42Mapper.deleteAquariumfishStoreInfo(aquariumfishStoreInfo42VO);
	} 
}
