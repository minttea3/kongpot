package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.HealthCommunity27VO;
@Mapper
public interface HealthCommunity27Mapper {
	
	public HealthCommunity27VO healthCommunitySelectOne(HealthCommunity27VO healthCommunity27VO); 

	public List<HealthCommunity27VO> healthCommunityList(HealthCommunity27VO healthCommunity27VO);
	
	public int insertHealthCommunity(HealthCommunity27VO healthCommunity27VO); 
	
	public int saveHealthCommunity(HealthCommunity27VO healthCommunity27VO); 
	
	public int updateHealthCommunity(HealthCommunity27VO healthCommunity27VO); 
	
	public int deleteHealthCommunity(HealthCommunity27VO healthCommunity27VO);
}
