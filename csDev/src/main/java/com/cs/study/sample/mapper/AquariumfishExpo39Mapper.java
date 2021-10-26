package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.AquariumfishExpo39VO;
@Mapper
public interface AquariumfishExpo39Mapper {
	
	public AquariumfishExpo39VO aquariumfishExpoSelectOne(AquariumfishExpo39VO aquariumfishExpo39VO); 

	public List<AquariumfishExpo39VO> aquariumfishExpoList(AquariumfishExpo39VO aquariumfishExpo39VO);
	
	public int insertAquariumfishExpo(AquariumfishExpo39VO aquariumfishExpo39VO); 
	
	public int saveAquariumsaveAquariumfishExpofishInfo(AquariumfishExpo39VO aquariumfishExpo39VO); 
	
	public int updateAquariumfishExpo(AquariumfishExpo39VO aquariumfishExpo39VO); 
	
	public int deleteAquariumfishExpo(AquariumfishExpo39VO aquariumfishExpo39VO);
}
