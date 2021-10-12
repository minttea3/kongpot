package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.BookBestseller8Mapper;
import com.cs.study.sample.mapper.HealthKnowledge23Mapper;
import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.HealthKnowledge23VO;

@Service
public class HealthKnowledge23Service {
	
	public final HealthKnowledge23Mapper healthKnowledge23Mapper;
	public HealthKnowledge23Service(HealthKnowledge23Mapper healthKnowledge23Mapper) {
		this.healthKnowledge23Mapper = healthKnowledge23Mapper;
	}
	public HealthKnowledge23VO healthKnowledgeSelectOne(HealthKnowledge23VO healthKnowledge23VO) {
		return healthKnowledge23Mapper.healthKnowledgeSelectOne(healthKnowledge23VO);
	}
	public List<HealthKnowledge23VO> healthKnowledgeList(HealthKnowledge23VO healthKnowledge23VO){
		return healthKnowledge23Mapper.healthKnowledgeList(healthKnowledge23VO);
	}
	public int insertHealthKnowledge(HealthKnowledge23VO healthKnowledge23VO) {
		return healthKnowledge23Mapper.insertHealthKnowledge(healthKnowledge23VO);
	}
	
	public int saveHealthKnowledge(HealthKnowledge23VO healthKnowledge23VO) {
		return healthKnowledge23Mapper.saveHealthKnowledge(healthKnowledge23VO);
	} 
	
	public int updateHealthKnowledge(HealthKnowledge23VO healthKnowledge23VO) {
		return healthKnowledge23Mapper.updateHealthKnowledge(healthKnowledge23VO);
	} 
	
	public int deleteHealthKnowledge(HealthKnowledge23VO healthKnowledge23VO) {
		return healthKnowledge23Mapper.deleteHealthKnowledge(healthKnowledge23VO);
	} 
}
