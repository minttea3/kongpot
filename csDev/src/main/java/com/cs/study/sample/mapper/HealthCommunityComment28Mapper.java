package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.HealthCommunityComment28VO;
@Mapper
public interface HealthCommunityComment28Mapper {
	
	public List<HealthCommunityComment28VO> healthCommunityCommentSelectOne(HealthCommunityComment28VO healthCommunityComment28VO); 

	public List<HealthCommunityComment28VO> healthCommunityCommentList(HealthCommunityComment28VO healthCommunityComment28VO);
	
	public int insertHealthCommunityComment(HealthCommunityComment28VO healthCommunityComment28VO); 
	
	public int saveHealthCommunityComment(HealthCommunityComment28VO healthCommunityComment28VO); 
	
	public int updateHealthCommunityComment(HealthCommunityComment28VO healthCommunityComment28VO); 
	
	public int deleteHealthCommunityComment(HealthCommunityComment28VO healthCommunityComment28VO);
}
