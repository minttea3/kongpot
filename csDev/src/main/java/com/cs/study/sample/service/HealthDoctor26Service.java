package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.HealthDoctor26Mapper;
import com.cs.study.sample.vo.HealthDoctor26VO;

@Service
public class HealthDoctor26Service {
	
	public final HealthDoctor26Mapper healthDoctor26Mapper;
	public HealthDoctor26Service(HealthDoctor26Mapper healthDoctor26Mapper) {
		this.healthDoctor26Mapper = healthDoctor26Mapper;
	}
	public HealthDoctor26VO healthDoctorSelectOne(HealthDoctor26VO healthDoctor26VO) {
		return healthDoctor26Mapper.healthDoctorSelectOne(healthDoctor26VO);
	}
	public List<HealthDoctor26VO> healthDoctorList(HealthDoctor26VO healthDoctor26VO){
		return healthDoctor26Mapper.healthDoctorList(healthDoctor26VO);
	}
	public int insertHealthDoctor(HealthDoctor26VO healthDoctor26VO) {
		return healthDoctor26Mapper.insertHealthDoctor(healthDoctor26VO);
	}
	
	public int saveHealthDoctor(HealthDoctor26VO healthDoctor26VO) {
		return healthDoctor26Mapper.saveHealthDoctor(healthDoctor26VO);
	} 
	
	public int updateHealthDoctor(HealthDoctor26VO healthDoctor26VO) {
		return healthDoctor26Mapper.updateHealthDoctor(healthDoctor26VO);
	} 
	
	public int deleteHealthDoctor(HealthDoctor26VO healthDoctor26VO) {
		return healthDoctor26Mapper.deleteHealthDoctor(healthDoctor26VO);
	} 
}
