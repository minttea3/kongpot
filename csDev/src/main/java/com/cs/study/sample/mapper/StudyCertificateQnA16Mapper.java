package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.StudyCertificateQnA16VO;
import com.cs.study.sample.vo.StudyCertificateTestSchedule13VO;
@Mapper
public interface StudyCertificateQnA16Mapper {
	
	public StudyCertificateQnA16VO studyCertifiscteQnASelectOne(StudyCertificateQnA16VO studyCertificateQnA16VO); 

	public List<StudyCertificateQnA16VO> studyCertificateQnAList(StudyCertificateQnA16VO studyCertificateQnA16VO);
	
	public int insertStudyCertificateQnA(StudyCertificateQnA16VO studyCertificateQnA16VO); 
	
	public int saveStudyCertificateQnA(StudyCertificateQnA16VO studyCertificateQnA16VO); 
	
	public int updateStudyCertificateQnA(StudyCertificateQnA16VO studyCertificateQnA16VO); 
	
	public int deleteStudyCertificateQnA(StudyCertificateQnA16VO studyCertificateQnA16VO);
}
