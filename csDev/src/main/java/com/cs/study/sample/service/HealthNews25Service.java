package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.HealthNews25Mapper;
import com.cs.study.sample.mapper.HealthQuestion24Mapper;
import com.cs.study.sample.vo.HealthNews25VO;
import com.cs.study.sample.vo.HealthNews25VO;

@Service
public class HealthNews25Service {
	
	public final HealthNews25Mapper healthNews25Mapper;
	public HealthNews25Service(HealthNews25Mapper healthNews25Mapper) {
		this.healthNews25Mapper = healthNews25Mapper;
	}
	public HealthNews25VO healthNewsSelectOne(HealthNews25VO healthNews25VO) {
		return healthNews25Mapper.healthNewsSelectOne(healthNews25VO);
	}
	public List<HealthNews25VO> healthNewsList(HealthNews25VO healthNews25VO){
		return healthNews25Mapper.healthNewsList(healthNews25VO);
	}
	public int insertHealthNews(HealthNews25VO healthNews25VO) {
		return healthNews25Mapper.insertHealthNews(healthNews25VO);
	}
	
	public int saveHealthNews(HealthNews25VO healthNews25VO) {
		return healthNews25Mapper.saveHealthNews(healthNews25VO);
	} 
	
	public int updateHealthNews(HealthNews25VO healthNews25VO) {
		return healthNews25Mapper.updateHealthNews(healthNews25VO);
	} 
	
	public int deleteHealthNews(HealthNews25VO healthNews25VO) {
		return healthNews25Mapper.deleteHealthNews(healthNews25VO);
	} 
}
