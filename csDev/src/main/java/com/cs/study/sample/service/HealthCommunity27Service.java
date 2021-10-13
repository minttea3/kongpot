package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.HealthCommunity27Mapper;
import com.cs.study.sample.vo.HealthCommunity27VO;

@Service
public class HealthCommunity27Service {
	
	public final HealthCommunity27Mapper healthCommunity27Mapper;
	public HealthCommunity27Service(HealthCommunity27Mapper healthCommunity27Mapper) {
		this.healthCommunity27Mapper = healthCommunity27Mapper;
	}
	public HealthCommunity27VO healthCommunitySelectOne(HealthCommunity27VO healthCommunity27VO) {
		return healthCommunity27Mapper.healthCommunitySelectOne(healthCommunity27VO);
	}
	public List<HealthCommunity27VO> healthCommunityList(HealthCommunity27VO healthCommunity27VO){
		return healthCommunity27Mapper.healthCommunityList(healthCommunity27VO);
	}
	public int insertHealthCommunity(HealthCommunity27VO healthCommunity27VO) {
		return healthCommunity27Mapper.insertHealthCommunity(healthCommunity27VO);
	}
	
	public int saveHealthCommunity(HealthCommunity27VO healthCommunity27VO) {
		return healthCommunity27Mapper.saveHealthCommunity(healthCommunity27VO);
	} 
	
	public int updateHealthCommunity(HealthCommunity27VO healthCommunity27VO) {
		return healthCommunity27Mapper.updateHealthCommunity(healthCommunity27VO);
	} 
	
	public int deleteHealthCommunity(HealthCommunity27VO healthCommunity27VO) {
		return healthCommunity27Mapper.deleteHealthCommunity(healthCommunity27VO);
	} 
}
