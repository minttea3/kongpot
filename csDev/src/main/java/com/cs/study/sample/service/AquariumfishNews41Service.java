package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.AquariumfishExpo39Mapper;
import com.cs.study.sample.mapper.AquariumfishNews41Mapper;
import com.cs.study.sample.vo.AquariumfishNews41VO;
import com.cs.study.sample.vo.AquariumfishNews41VO;

@Service
public class AquariumfishNews41Service {
	
	public final AquariumfishNews41Mapper aquariumfishNews41Mapper;
	public AquariumfishNews41Service(AquariumfishNews41Mapper aquariumfishNews41Mapper	) {
		this.aquariumfishNews41Mapper = aquariumfishNews41Mapper;
	}
	public AquariumfishNews41VO aquariumfishNewsSelectOne(AquariumfishNews41VO aquariumfishNews41VO) {
		return aquariumfishNews41Mapper.aquariumfishNewsSelectOne(aquariumfishNews41VO);
	}
	public List<AquariumfishNews41VO> aquariumfishNewsList(AquariumfishNews41VO aquariumfishNews41VO){
		return aquariumfishNews41Mapper.aquariumfishNewsList(aquariumfishNews41VO);
	}
	public int insertAquariumfishNews(AquariumfishNews41VO aquariumfishNews41VO) {
		return aquariumfishNews41Mapper.insertAquariumfishNews(aquariumfishNews41VO);
	}
	
	public int saveAquariumfishNews(AquariumfishNews41VO aquariumfishNews41VO) {
		return aquariumfishNews41Mapper.saveAquariumfishNews(aquariumfishNews41VO);
	} 
	
	public int updateAquariumfishExpo(AquariumfishNews41VO aquariumfishNews41VO) {
		return aquariumfishNews41Mapper.updateAquariumfishNews(aquariumfishNews41VO);
	} 
	
	public int deleteAquariumfishExpo(AquariumfishNews41VO aquariumfishNews41VO) {
		return aquariumfishNews41Mapper.deleteAquariumfishNews(aquariumfishNews41VO);
	} 
}
