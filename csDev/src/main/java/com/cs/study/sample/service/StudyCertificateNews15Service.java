package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.StudyCertificateNews15Mapper;
import com.cs.study.sample.vo.StudyCertificateNews15VO;

@Service
public class StudyCertificateNews15Service {
	
	public final StudyCertificateNews15Mapper studyCertificateNews15Mapper;
	public StudyCertificateNews15Service(StudyCertificateNews15Mapper studyCertificateNews15Mapper) {
		this.studyCertificateNews15Mapper = studyCertificateNews15Mapper;
	}
	public StudyCertificateNews15VO studyCertificateNewsSelectOne(StudyCertificateNews15VO studyCertificateNews15VO) {
		return studyCertificateNews15Mapper.studyCertificateNewsSelectOne(studyCertificateNews15VO);
	}
	public List<StudyCertificateNews15VO> studyCertificateNewsList(StudyCertificateNews15VO studyCertificateNews15VO){
		return studyCertificateNews15Mapper.studyCertificateNewsList(studyCertificateNews15VO);
	}
	public int insertStudyCertificateNews(StudyCertificateNews15VO studyCertificateNews15VO) {
		return studyCertificateNews15Mapper.insertStudyCertificateNews(studyCertificateNews15VO);
	}
	
	public int saveStudyCertificateNews(StudyCertificateNews15VO studyCertificateNews15VO) {
		return studyCertificateNews15Mapper.saveStudyCertificateNews(studyCertificateNews15VO);
	} 
	
	public int updateStudyCertificateNews(StudyCertificateNews15VO studyCertificateNews15VO) {
		return studyCertificateNews15Mapper.updateStudyCertificateNews(studyCertificateNews15VO);
	} 
	
	public int deleteStudyCertificateNews(StudyCertificateNews15VO studyCertificateNews15VO) {
		return studyCertificateNews15Mapper.deleteStudyCertificateNews(studyCertificateNews15VO);
	} 
}
