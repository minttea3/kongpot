package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.BookBestseller8Mapper;
import com.cs.study.sample.mapper.StudyCertificateRealtedInfo14Mapper;
import com.cs.study.sample.mapper.StydyCertificateNotice12Mapper;
import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.StudyCertificateNotice12VO;
import com.cs.study.sample.vo.StudyCertificateRelatedInfo14VO;

@Service
public class StudyCertificateRealtedInfo14Service {
	
	public final StudyCertificateRealtedInfo14Mapper studyCertificateRealtedInfo14Mapper;
	public StudyCertificateRealtedInfo14Service(StudyCertificateRealtedInfo14Mapper studyCertificateRealtedInfo14Mapper) {
		this.studyCertificateRealtedInfo14Mapper = studyCertificateRealtedInfo14Mapper;
	}
	public StudyCertificateRelatedInfo14VO studyCertificateRelatedInfoSelectOne(StudyCertificateRelatedInfo14VO studyCertificateRelatedInfo14VO) {
		return studyCertificateRealtedInfo14Mapper.studyCertificateRelatedInfoSelectOne(studyCertificateRelatedInfo14VO);
	}
	public List<StudyCertificateRelatedInfo14VO> studyCertificateRelatedInfoList(StudyCertificateRelatedInfo14VO studyCertificateRelatedInfo14VO){
		return studyCertificateRealtedInfo14Mapper.studyCertificateRelatedInfoList(studyCertificateRelatedInfo14VO);
	}
	public int insertStudyCertificateNotice(StudyCertificateRelatedInfo14VO studyCertificateRelatedInfo14VO) {
		return studyCertificateRealtedInfo14Mapper.insertStudyCertificateRelatedInfo(studyCertificateRelatedInfo14VO);
	}
	
	public int saveStudyCertificateRelatedInfo(StudyCertificateRelatedInfo14VO studyCertificateRelatedInfo14VO) {
		return studyCertificateRealtedInfo14Mapper.saveStudyCertificateRelatedInfo(studyCertificateRelatedInfo14VO);
	} 
	
	public int updateStudyCertificateRelatedInfo(StudyCertificateRelatedInfo14VO studyCertificateRelatedInfo14VO) {
		return studyCertificateRealtedInfo14Mapper.updateStudyCertificateRelatedInfo(studyCertificateRelatedInfo14VO);
	} 
	
	public int deleteStudyCertificateRelatedInfo(StudyCertificateRelatedInfo14VO studyCertificateRelatedInfo14VO) {
		return studyCertificateRealtedInfo14Mapper.deleteStudyCertificateRelatedInfo(studyCertificateRelatedInfo14VO);
	} 
}
