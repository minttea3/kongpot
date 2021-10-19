package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.PlantsNews34VO;
@Mapper
public interface PlantsNews34Mapper {
	
	public PlantsNews34VO plantsNewsSelectOne(PlantsNews34VO plantsNews34VO); 

	public List<PlantsNews34VO> plantsNewsList(PlantsNews34VO plantsNews34VO);
	
	public int insertPlantsNews(PlantsNews34VO plantsNews34VO); 
	
	public int savePlantsNews(PlantsNews34VO plantsNews34VO); 
	
	public int updatePlantsNews(PlantsNews34VO plantsNews34VO); 
	
	public int deletePlantsNews(PlantsNews34VO plantsNews34VO);
}
