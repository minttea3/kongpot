package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.PlantsNews34Mapper;
import com.cs.study.sample.vo.PlantsNews34VO;

@Service
public class PlantsNews34Service {
	
	public final PlantsNews34Mapper plantsNews34Mapper;
	public PlantsNews34Service(PlantsNews34Mapper plantsNews34Mapper) {
		this.plantsNews34Mapper = plantsNews34Mapper;
	}
	public PlantsNews34VO plantsNewsSelectOne(PlantsNews34VO plantsNews34VO) {
		return plantsNews34Mapper.plantsNewsSelectOne(plantsNews34VO);
	}
	public List<PlantsNews34VO> plantsNewsList(PlantsNews34VO plantsNews34VO){
		return plantsNews34Mapper.plantsNewsList(plantsNews34VO);
	}
	public int insertPlantsNews(PlantsNews34VO plantsNews34VO) {
		return plantsNews34Mapper.insertPlantsNews(plantsNews34VO);
	}
	
	public int savePlantsNews(PlantsNews34VO plantsNews34VO) {
		return plantsNews34Mapper.savePlantsNews(plantsNews34VO);
	} 
	
	public int updatePlantsNews(PlantsNews34VO plantsNews34VO) {
		return plantsNews34Mapper.updatePlantsNews(plantsNews34VO);
	} 
	
	public int deletePlantsNews(PlantsNews34VO plantsNews34VO) {
		return plantsNews34Mapper.deletePlantsNews(plantsNews34VO);
	} 
}
