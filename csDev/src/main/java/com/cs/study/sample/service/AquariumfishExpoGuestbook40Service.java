package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.AquariumfishExpoGuestbook40Mapper;
import com.cs.study.sample.vo.AquariumfishExpoGuestbook40VO;

@Service
public class AquariumfishExpoGuestbook40Service {
	
	public final AquariumfishExpoGuestbook40Mapper aquariumfishExpoGuestbook40Mapper;
	public AquariumfishExpoGuestbook40Service(AquariumfishExpoGuestbook40Mapper aquariumfishExpoGuestbook40Mapper	) {
		this.aquariumfishExpoGuestbook40Mapper = aquariumfishExpoGuestbook40Mapper;
	}
	public AquariumfishExpoGuestbook40VO aquariumfishExpoGuestbookSelectOne(AquariumfishExpoGuestbook40VO aquariumfishExpoGuestbook40VO) {
		return aquariumfishExpoGuestbook40Mapper.aquariumfishExpoGuestbookSelectOne(aquariumfishExpoGuestbook40VO);
	}
	public List<AquariumfishExpoGuestbook40VO> aquariumfishExpoGuestbookList(AquariumfishExpoGuestbook40VO aquariumfishExpoGuestbook40VO){
		return aquariumfishExpoGuestbook40Mapper.aquariumfishExpoGuestbookList(aquariumfishExpoGuestbook40VO);
	}
	public int insertAquariumfishExpo(AquariumfishExpoGuestbook40VO aquariumfishExpoGuestbook40VO) {
		return aquariumfishExpoGuestbook40Mapper.insertAquariumfishExpo(aquariumfishExpoGuestbook40VO);
	}
	
	public int saveAquariumfishExpoGuestbook(AquariumfishExpoGuestbook40VO aquariumfishExpoGuestbook40VO) {
		return aquariumfishExpoGuestbook40Mapper.saveAquariumfishExpoGuestbook(aquariumfishExpoGuestbook40VO);
	} 
	
	public int updateAquariumfishExpoGuestbook(AquariumfishExpoGuestbook40VO aquariumfishExpoGuestbook40VO) {
		return aquariumfishExpoGuestbook40Mapper.updateAquariumfishExpoGuestbook(aquariumfishExpoGuestbook40VO);
	} 
	
	public int deleteAquariumfishExpoGuestbook(AquariumfishExpoGuestbook40VO aquariumfishExpoGuestbook40VO) {
		return aquariumfishExpoGuestbook40Mapper.deleteAquariumfishExpoGuestbook(aquariumfishExpoGuestbook40VO);
	} 
}
