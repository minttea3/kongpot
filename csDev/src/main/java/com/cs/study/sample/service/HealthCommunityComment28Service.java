package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.HealthCommunityComment28Mapper;
import com.cs.study.sample.vo.HealthCommunityComment28VO;

@Service
public class HealthCommunityComment28Service {
	
	public final HealthCommunityComment28Mapper healthCommunityComment28Mapper;
	public HealthCommunityComment28Service(HealthCommunityComment28Mapper healthCommunityComment28Mapper) {
		this.healthCommunityComment28Mapper = healthCommunityComment28Mapper;
	}
	
	//댓글 한개만 가져오기 1:1 관계로 함. 1개 본문에 1개 댓글로만 한다 했을때.
	public  HealthCommunityComment28VO healthCommunityCommentSelectOne(HealthCommunityComment28VO healthCommunityComment28VO) {
		return healthCommunityComment28Mapper.healthCommunityCommentSelectOne(healthCommunityComment28VO);
	}
	public List<HealthCommunityComment28VO> healthCommunityCommentList(HealthCommunityComment28VO healthCommunityComment28VO){
		return healthCommunityComment28Mapper.healthCommunityCommentList(healthCommunityComment28VO);
	}
	public int insertHealthCommunityComment(HealthCommunityComment28VO healthCommunityComment28VO) {
		return healthCommunityComment28Mapper.insertHealthCommunityComment(healthCommunityComment28VO);
	}
	
	public int saveHealthCommunityComment(HealthCommunityComment28VO healthCommunityComment28VO) {
		return healthCommunityComment28Mapper.saveHealthCommunityComment(healthCommunityComment28VO);
	} 
	
	public int updateHealthCommunityComment(HealthCommunityComment28VO healthCommunityComment28VO) {
		return healthCommunityComment28Mapper.updateHealthCommunityComment(healthCommunityComment28VO);
	} 
	
	public int deleteHealthCommunityComment(HealthCommunityComment28VO healthCommunityComment28VO) {
		return healthCommunityComment28Mapper.deleteHealthCommunityComment(healthCommunityComment28VO);
	} 
}
