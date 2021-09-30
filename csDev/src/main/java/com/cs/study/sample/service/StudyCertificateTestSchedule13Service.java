package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.BookBestseller8Mapper;
import com.cs.study.sample.mapper.StudyCertificateTestSchedule13Mapper;
import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.StudyCertificateTestSchedule13VO;

@Service
public class StudyCertificateTestSchedule13Service {
	
	public final StudyCertificateTestSchedule13Mapper studyCertificateTestSchedule13Mapper;
	public StudyCertificateTestSchedule13Service(StudyCertificateTestSchedule13Mapper studyCertificateTestSchedule13Mapper) {
		this.studyCertificateTestSchedule13Mapper = studyCertificateTestSchedule13Mapper;
	}
	public StudyCertificateTestSchedule13VO studyCertificateTestScheduleSelectOne(StudyCertificateTestSchedule13VO studyCertificateTestSchedule13VO) {
		return studyCertificateTestSchedule13Mapper.studyCertificateTestScheduleSelectOne(studyCertificateTestSchedule13VO);
	}
	public List<StudyCertificateTestSchedule13VO> studyCertificateTestScheduleList(StudyCertificateTestSchedule13VO studyCertificateTestSchedule13VO){
		return studyCertificateTestSchedule13Mapper.studyCertificateTestScheduleList(studyCertificateTestSchedule13VO);
	}
	public int insertStudyCertificateTestSchedule(StudyCertificateTestSchedule13VO studyCertificateTestSchedule13VO) {
		return studyCertificateTestSchedule13Mapper.insertStudyCertificateTestSchedule(studyCertificateTestSchedule13VO);
	}
	
	public int saveStudyCertificateTestSchedule(StudyCertificateTestSchedule13VO studyCertificateTestSchedule13VO) {
		return studyCertificateTestSchedule13Mapper.saveStudyCertificateTestSchedule(studyCertificateTestSchedule13VO);
	} 
	
	public int updateStudyCertificateTestSchedule(StudyCertificateTestSchedule13VO studyCertificateTestSchedule13VO) {
		return studyCertificateTestSchedule13Mapper.updateStudyCertificateTestSchedule(studyCertificateTestSchedule13VO);
	} 
	
	public int deleteStudyCertificateTestSchedule(StudyCertificateTestSchedule13VO studyCertificateTestSchedule13VO) {
		return studyCertificateTestSchedule13Mapper.deleteStudyCertificateTestSchedule(studyCertificateTestSchedule13VO);
	} 
}
