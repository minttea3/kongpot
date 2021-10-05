package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.StudyCertificateCommunity17VO;
@Mapper
public interface StudyCertificateCommunity17Mapper {
	
	public StudyCertificateCommunity17VO studyCertificateCommunitySelectOne(StudyCertificateCommunity17VO studyCertificateCommunity17VO); 

	public List<StudyCertificateCommunity17VO> studyCertificateCommunityList(StudyCertificateCommunity17VO studyCertificateCommunity17VO);
	
	public int insertStudyCertificateCommunity(StudyCertificateCommunity17VO studyCertificateCommunity17VO); 
	
	public int saveStudyCertificateCommunity(StudyCertificateCommunity17VO studyCertificateCommunity17VO); 
	
	public int updateStudyCertificateCommunity(StudyCertificateCommunity17VO studyCertificateCommunity17VO); 
	
	public int deleteStudyCertificateCommunity(StudyCertificateCommunity17VO studyCertificateCommunity17VO);
}
