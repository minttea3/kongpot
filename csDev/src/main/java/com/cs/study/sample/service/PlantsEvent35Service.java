package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.PlantsBlog33Mapper;
import com.cs.study.sample.mapper.PlantsEvent35Mapper;
import com.cs.study.sample.vo.PlantsEvent35VO;
import com.cs.study.sample.vo.PlantsEvent35VO;

@Service
public class PlantsEvent35Service {
	
	public final PlantsEvent35Mapper plantsEvent35Mapper;
	public PlantsEvent35Service(PlantsEvent35Mapper plantsEvent35Mapper) {
		this.plantsEvent35Mapper = plantsEvent35Mapper;
	}
	public PlantsEvent35VO plantsEventSelectOne(PlantsEvent35VO plantsEvent35VO) {
		return plantsEvent35Mapper.plantsEventSelectOne(plantsEvent35VO);
	}
	public List<PlantsEvent35VO> plantsEventList(PlantsEvent35VO plantsEvent35VO){
		return plantsEvent35Mapper.plantsEventList(plantsEvent35VO);
	}
	public int insertPlantsEvent(PlantsEvent35VO plantsEvent35VO) {
		return plantsEvent35Mapper.insertPlantsEvent(plantsEvent35VO);
	}
	
	public int savePlantsEvent(PlantsEvent35VO plantsEvent35VO) {
		return plantsEvent35Mapper.savePlantsEvent(plantsEvent35VO);
	} 
	
	public int updatePlantsEvent(PlantsEvent35VO plantsEvent35VO) {
		return plantsEvent35Mapper.updatePlantsEvent(plantsEvent35VO);
	} 
	
	public int deletePlantsEvent(PlantsEvent35VO plantsEvent35VO) {
		return plantsEvent35Mapper.deletePlantsEvent(plantsEvent35VO);
	} 
}
