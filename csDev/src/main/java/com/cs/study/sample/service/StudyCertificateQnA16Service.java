package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.StudyCertificateQnA16Mapper;
import com.cs.study.sample.vo.StudyCertificateQnA16VO;

@Service
public class StudyCertificateQnA16Service {
	
	public final StudyCertificateQnA16Mapper studyCertificateQnA16Mapper;
	public StudyCertificateQnA16Service(StudyCertificateQnA16Mapper studyCertificateQnA16Mapper) {
		this.studyCertificateQnA16Mapper = studyCertificateQnA16Mapper;
	}
	public StudyCertificateQnA16VO studyCertifiscteQnASelectOne(StudyCertificateQnA16VO studyCertificateQnA16VO) {
		return studyCertificateQnA16Mapper.studyCertifiscteQnASelectOne(studyCertificateQnA16VO);
	}
	public List<StudyCertificateQnA16VO> studyCertificateQnAList(StudyCertificateQnA16VO studyCertificateQnA16VO){
		return studyCertificateQnA16Mapper.studyCertificateQnAList(studyCertificateQnA16VO);
	}
	public int insertStudyCertificateQnA(StudyCertificateQnA16VO studyCertificateQnA16VO) {
		return studyCertificateQnA16Mapper.insertStudyCertificateQnA(studyCertificateQnA16VO);
	}
	
	public int saveStudyCertificateQnA(StudyCertificateQnA16VO studyCertificateQnA16VO) {
		return studyCertificateQnA16Mapper.saveStudyCertificateQnA(studyCertificateQnA16VO);
	} 
	
	public int updateStudyCertificateQnA(StudyCertificateQnA16VO studyCertificateQnA16VO) {
		return studyCertificateQnA16Mapper.updateStudyCertificateQnA(studyCertificateQnA16VO);
	} 
	
	public int deleteStudyCertificateQnA(StudyCertificateQnA16VO studyCertificateQnA16VO) {
		return studyCertificateQnA16Mapper.deleteStudyCertificateQnA(studyCertificateQnA16VO);
	} 
}
