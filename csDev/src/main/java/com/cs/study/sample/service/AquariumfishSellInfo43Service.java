package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.AquariumfishSellInfo43Mapper;
import com.cs.study.sample.mapper.AquariumfishStoreInfo42Mapper;
import com.cs.study.sample.vo.AquariumfishSellInfo43VO;
import com.cs.study.sample.vo.AquariumfishSellInfo43VO;

@Service
public class AquariumfishSellInfo43Service {
	
	public final AquariumfishSellInfo43Mapper aquariumfishSellInfo43Mapper;
	public AquariumfishSellInfo43Service(AquariumfishSellInfo43Mapper aquariumfishSellInfo43Mapper	) {
		this.aquariumfishSellInfo43Mapper = aquariumfishSellInfo43Mapper;
	}
	public AquariumfishSellInfo43VO aquariumfishSellInfoSelectOne(AquariumfishSellInfo43VO aquariumfishSellInfo43VO) {
		return aquariumfishSellInfo43Mapper.aquariumfishSellInfoSelectOne(aquariumfishSellInfo43VO);
	}
	public List<AquariumfishSellInfo43VO> aquariumfishSellInfoList(AquariumfishSellInfo43VO aquariumfishSellInfo43VO){
		return aquariumfishSellInfo43Mapper.aquariumfishSellInfoList(aquariumfishSellInfo43VO);
	}
	public int insertAquariumfishSellInfo(AquariumfishSellInfo43VO aquariumfishSellInfo43VO) {
		return aquariumfishSellInfo43Mapper.insertAquariumfishSellInfo(aquariumfishSellInfo43VO);
	}
	
	public int saveAquariumfishSellInfo(AquariumfishSellInfo43VO aquariumfishSellInfo43VO) {
		return aquariumfishSellInfo43Mapper.saveAquariumfishSellInfo(aquariumfishSellInfo43VO);
	} 
	
	public int updateAquariumfishSellInfo(AquariumfishSellInfo43VO aquariumfishSellInfo43VO) {
		return aquariumfishSellInfo43Mapper.updateAquariumfishSellInfo(aquariumfishSellInfo43VO);
	} 
	
	public int deleteAquariumfishSellInfo(AquariumfishSellInfo43VO aquariumfishSellInfo43VO) {
		return aquariumfishSellInfo43Mapper.deleteAquariumfishSellInfo(aquariumfishSellInfo43VO);
	} 
}
