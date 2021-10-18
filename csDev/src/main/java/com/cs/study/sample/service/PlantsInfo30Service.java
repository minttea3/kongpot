package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.PlantsInfo30Mapper;
import com.cs.study.sample.vo.PlantsInfo30VO;

@Service
public class PlantsInfo30Service {
	
	public final PlantsInfo30Mapper plantsInfo30Mapper;
	public PlantsInfo30Service(PlantsInfo30Mapper plantsInfo30Mapper) {
		this.plantsInfo30Mapper = plantsInfo30Mapper;
	}
	public PlantsInfo30VO plantsInfoSelectOne(PlantsInfo30VO plantsInfo30VO) {
		return plantsInfo30Mapper.plantsInfoSelectOne(plantsInfo30VO);
	}
	public List<PlantsInfo30VO> plantsInfoList(PlantsInfo30VO plantsInfo30VO){
		return plantsInfo30Mapper.plantsInfoList(plantsInfo30VO);
	}
	public int insertPlantsInfo(PlantsInfo30VO plantsInfo30VO) {
		return plantsInfo30Mapper.insertPlantsInfo(plantsInfo30VO);
	}
	
	public int savePlantsInfo(PlantsInfo30VO plantsInfo30VO) {
		return plantsInfo30Mapper.savePlantsInfo(plantsInfo30VO);
	} 
	
	public int updatePlantsInfo(PlantsInfo30VO plantsInfo30VO) {
		return plantsInfo30Mapper.updatePlantsInfo(plantsInfo30VO);
	} 
	
	public int deletePlantsInfo(PlantsInfo30VO plantsInfo30VO) {
		return plantsInfo30Mapper.deletePlantsInfo(plantsInfo30VO);
	} 
}
