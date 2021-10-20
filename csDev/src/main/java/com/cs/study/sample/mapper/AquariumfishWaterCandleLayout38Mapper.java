package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.AquariumfishWaterCandleLayout38VO;
@Mapper
public interface AquariumfishWaterCandleLayout38Mapper {
	
	public AquariumfishWaterCandleLayout38VO aquariumfishWaterCandleLayoutSelectOne(AquariumfishWaterCandleLayout38VO aquariumfishWaterCandleLayout38VO); 

	public List<AquariumfishWaterCandleLayout38VO> aquariumfishWaterCandleLayoutList(AquariumfishWaterCandleLayout38VO aquariumfishWaterCandleLayout38VO);
	
	public int insertAquariumfishWaterCandleLayout(AquariumfishWaterCandleLayout38VO aquariumfishWaterCandleLayout38VO); 
	
	public int saveAquariumfishWaterCandleLayout(AquariumfishWaterCandleLayout38VO aquariumfishWaterCandleLayout38VO); 
	
	public int updateAquariumfishWaterCandleLayout(AquariumfishWaterCandleLayout38VO aquariumfishWaterCandleLayout38VO); 
	
	public int deleteAquariumfishWaterCandleLayout(AquariumfishWaterCandleLayout38VO aquariumfishWaterCandleLayout38VO);
}
