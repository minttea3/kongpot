package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.HealthQuestion24VO;
import com.cs.study.sample.vo.HealthQuestion24VO;
@Mapper
public interface HealthQuestion24Mapper {
	
	public HealthQuestion24VO healthQuestionSelectOne(HealthQuestion24VO healthQuestion24VO); 

	public List<HealthQuestion24VO> healthQuestionList(HealthQuestion24VO healthQuestion24VO);
	
	public int insertHealthQuestion(HealthQuestion24VO healthQuestion24VO); 
	
	public int saveHealthQuestion(HealthQuestion24VO healthQuestion24VO); 
	
	public int updateHealthQuestion(HealthQuestion24VO healthQuestion24VO); 
	
	public int deleteHealthQuestion(HealthQuestion24VO healthQuestion24VO);
}
