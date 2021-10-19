package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.PlantsEvent35VO;
@Mapper
public interface PlantsEvent35Mapper {
	
	public PlantsEvent35VO plantsEventSelectOne(PlantsEvent35VO plantsEvent35VO); 

	public List<PlantsEvent35VO> plantsEventList(PlantsEvent35VO plantsEvent35VO);
	
	public int insertPlantsEvent(PlantsEvent35VO plantsEvent35VO); 
	
	public int savePlantsEvent(PlantsEvent35VO plantsEvent35VO); 
	
	public int updatePlantsEvent(PlantsEvent35VO plantsEvent35VO); 
	
	public int deletePlantsEvent(PlantsEvent35VO plantsEvent35VO);
}
