package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.BookBestseller8Mapper;
import com.cs.study.sample.mapper.StydyCertificateNotice12Mapper;
import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.StudyCertificateNotice12VO;

@Service
public class StudyCertificateNotice12Service {
	
	public final StydyCertificateNotice12Mapper studyCertificatice12Mapper;
	public StudyCertificateNotice12Service(StydyCertificateNotice12Mapper studyCertificatice12Mapper) {
		this.studyCertificatice12Mapper = studyCertificatice12Mapper;
	}
	public StudyCertificateNotice12VO studyCertificateNoticeSelectOne(StudyCertificateNotice12VO studyCertificateNotice12VO) {
		return studyCertificatice12Mapper.studyCertificateNoticeSelectOne(studyCertificateNotice12VO);
	}
	public List<StudyCertificateNotice12VO> studyCertificateNoticeList(StudyCertificateNotice12VO studyCertificateNotice12VO){
		return studyCertificatice12Mapper.studyCertificateNoticeList(studyCertificateNotice12VO);
	}
	public int insertStudyCertificateNotice(StudyCertificateNotice12VO studyCertificateNotice12VO) {
		return studyCertificatice12Mapper.insertStudyCertificateNotice(studyCertificateNotice12VO);
	}
	
	public int saveStudyCertificateNotice(StudyCertificateNotice12VO studyCertificateNotice12VO) {
		return studyCertificatice12Mapper.saveStudyCertificateNotice(studyCertificateNotice12VO);
	} 
	
	public int updateStudyCertificateNotice(StudyCertificateNotice12VO studyCertificateNotice12VO) {
		return studyCertificatice12Mapper.updateStudyCertificateNotice(studyCertificateNotice12VO);
	} 
	
	public int deleteStudyCertificateNotice(StudyCertificateNotice12VO studyCertificateNotice12VO) {
		return studyCertificatice12Mapper.deleteStudyCertificateNotice(studyCertificateNotice12VO);
	} 
}
