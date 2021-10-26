package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.AquariumfishInfo37VO;
@Mapper
public interface AquariumfishInfo37Mapper {
	
	public AquariumfishInfo37VO aquariumfishInfoSelectOne(AquariumfishInfo37VO aquariumfishInfo37VO); 

	public List<AquariumfishInfo37VO> aquariumfishInfoList(AquariumfishInfo37VO aquariumfishInfo37VO);
	
	public int insertAquariumfishInfo(AquariumfishInfo37VO aquariumfishInfo37VO); 
	
	public int saveAquariumfishInfo(AquariumfishInfo37VO aquariumfishInfo37VO); 
	
	public int updateAquariumfishInfo(AquariumfishInfo37VO aquariumfishInfo37VO); 
	
	public int deleteAquariumfishInfo(AquariumfishInfo37VO aquariumfishInfo37VO);
}
