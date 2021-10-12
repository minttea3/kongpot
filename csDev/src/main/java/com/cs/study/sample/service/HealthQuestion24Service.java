package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.HealthQuestion24Mapper;
import com.cs.study.sample.vo.HealthQuestion24VO;
import com.cs.study.sample.vo.HealthQuestion24VO;

@Service
public class HealthQuestion24Service {
	
	public final HealthQuestion24Mapper healthQuestion24Mapper;
	public HealthQuestion24Service(HealthQuestion24Mapper healthQuestion24Mapper) {
		this.healthQuestion24Mapper = healthQuestion24Mapper;
	}
	public HealthQuestion24VO healthQuestionSelectOne(HealthQuestion24VO healthQuestion24VO) {
		return healthQuestion24Mapper.healthQuestionSelectOne(healthQuestion24VO);
	}
	public List<HealthQuestion24VO> healthQuestionList(HealthQuestion24VO healthQuestion24VO){
		return healthQuestion24Mapper.healthQuestionList(healthQuestion24VO);
	}
	public int insertHealthQuestion(HealthQuestion24VO healthQuestion24VO) {
		return healthQuestion24Mapper.insertHealthQuestion(healthQuestion24VO);
	}
	
	public int saveHealthQuestion(HealthQuestion24VO healthQuestion24VO) {
		return healthQuestion24Mapper.saveHealthQuestion(healthQuestion24VO);
	} 
	
	public int updateHealthQuestion(HealthQuestion24VO healthQuestion24VO) {
		return healthQuestion24Mapper.updateHealthQuestion(healthQuestion24VO);
	} 
	
	public int deleteHealthQuestion(HealthQuestion24VO healthQuestion24VO) {
		return healthQuestion24Mapper.deleteHealthQuestion(healthQuestion24VO);
	} 
}
