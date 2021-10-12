package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.HealthKnowledge23VO;
@Mapper
public interface HealthKnowledge23Mapper {
	
	public HealthKnowledge23VO healthKnowledgeSelectOne(HealthKnowledge23VO healthKnowledge23VO); 

	public List<HealthKnowledge23VO> healthKnowledgeList(HealthKnowledge23VO healthKnowledge23VO);
	
	public int insertHealthKnowledge(HealthKnowledge23VO healthKnowledge23VO); 
	
	public int saveHealthKnowledge(HealthKnowledge23VO healthKnowledge23VO); 
	
	public int updateHealthKnowledge(HealthKnowledge23VO healthKnowledge23VO); 
	
	public int deleteHealthKnowledge(HealthKnowledge23VO healthKnowledge23VO);
}
