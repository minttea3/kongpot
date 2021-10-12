package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.HealthNews25VO;
@Mapper
public interface HealthNews25Mapper {
	
	public HealthNews25VO healthNewsSelectOne(HealthNews25VO healthNews25VO); 

	public List<HealthNews25VO> healthNewsList(HealthNews25VO healthNews25VO);
	
	public int insertHealthNews(HealthNews25VO healthNews25VO); 
	
	public int saveHealthNews(HealthNews25VO healthNews25VO); 
	
	public int updateHealthNews(HealthNews25VO healthNews25VO); 
	
	public int deleteHealthNews(HealthNews25VO healthNews25VO);
}
