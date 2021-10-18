package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.PlantsInfo30VO;
@Mapper
public interface PlantsInfo30Mapper {
	
	public PlantsInfo30VO plantsInfoSelectOne(PlantsInfo30VO plantsInfo30VO); 

	public List<PlantsInfo30VO> plantsInfoList(PlantsInfo30VO plantsInfo30VO);
	
	public int insertPlantsInfo(PlantsInfo30VO plantsInfo30VO); 
	
	public int savePlantsInfo(PlantsInfo30VO plantsInfo30VO); 
	
	public int updatePlantsInfo(PlantsInfo30VO plantsInfo30VO); 
	
	public int deletePlantsInfo(PlantsInfo30VO plantsInfo30VO);
}
