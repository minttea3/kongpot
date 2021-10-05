package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.StudyCertificateCommunity17Mapper;
import com.cs.study.sample.vo.StudyCertificateCommunity17VO;
import com.cs.study.sample.vo.StudyCertificateQnA16VO;

@Service
public class StudyCertificateCommunity17Service {
	
	public final StudyCertificateCommunity17Mapper studyCertificateCommunity17Mapper;
	public StudyCertificateCommunity17Service(StudyCertificateCommunity17Mapper studyCertificateCommunity17Mapper) {
		this.studyCertificateCommunity17Mapper = studyCertificateCommunity17Mapper;
	}
	public StudyCertificateCommunity17VO studyCertificateCommunitySelectOne(StudyCertificateCommunity17VO studyCertificateCommunity17VO) {
		return studyCertificateCommunity17Mapper.studyCertificateCommunitySelectOne(studyCertificateCommunity17VO);
	}
	public List<StudyCertificateCommunity17VO> studyCertificateCommunityList(StudyCertificateCommunity17VO studyCertificateCommunity17VO){
		return studyCertificateCommunity17Mapper.studyCertificateCommunityList(studyCertificateCommunity17VO);
	}
	public int insertStudyCertificateCommunity(StudyCertificateCommunity17VO studyCertificateCommunity17VO) {
		return studyCertificateCommunity17Mapper.insertStudyCertificateCommunity(studyCertificateCommunity17VO);
	}
	
	public int saveStudyCertificateCommunity(StudyCertificateCommunity17VO studyCertificateCommunity17VO) {
		return studyCertificateCommunity17Mapper.saveStudyCertificateCommunity(studyCertificateCommunity17VO);
	} 
	
	public int updateStudyCertificateCommunity(StudyCertificateCommunity17VO studyCertificateCommunity17VO) {
		return studyCertificateCommunity17Mapper.updateStudyCertificateCommunity(studyCertificateCommunity17VO);
	} 
	
	public int deleteStudyCertificateCommunity(StudyCertificateCommunity17VO studyCertificateCommunity17VO) {
		return studyCertificateCommunity17Mapper.deleteStudyCertificateCommunity(studyCertificateCommunity17VO);
	} 
}
