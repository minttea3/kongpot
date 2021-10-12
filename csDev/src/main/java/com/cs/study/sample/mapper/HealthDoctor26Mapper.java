package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.HealthDoctor26VO;	
@Mapper
public interface HealthDoctor26Mapper {
	
	public HealthDoctor26VO healthDoctorSelectOne(HealthDoctor26VO healthDoctor26VO); 

	public List<HealthDoctor26VO> healthDoctorList(HealthDoctor26VO healthDoctor26VO);
	
	public int insertHealthDoctor(HealthDoctor26VO healthDoctor26VO); 
	
	public int saveHealthDoctor(HealthDoctor26VO healthDoctor26VO); 
	
	public int updateHealthDoctor(HealthDoctor26VO healthDoctor26VO); 
	
	public int deleteHealthDoctor(HealthDoctor26VO healthDoctor26VO);
}
