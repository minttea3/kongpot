package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.BookKoreanNovelsInfo6VO;
import com.cs.study.sample.vo.CodingInfo3VO;
import com.cs.study.sample.vo.StudyCertificateTestSchedule13VO;
@Mapper
public interface StudyCertificateTestSchedule13Mapper {
	
	public StudyCertificateTestSchedule13VO studyCertificateTestScheduleSelectOne(StudyCertificateTestSchedule13VO studyCertificateTestSchedule13VO); 

	public List<StudyCertificateTestSchedule13VO> studyCertificateTestScheduleList(StudyCertificateTestSchedule13VO studyCertificateTestSchedule13VO);
	
	public int insertStudyCertificateTestSchedule(StudyCertificateTestSchedule13VO studyCertificateTestSchedule13VO); 
	
	public int saveStudyCertificateTestSchedule(StudyCertificateTestSchedule13VO studyCertificateTestSchedule13VO); 
	
	public int updateStudyCertificateTestSchedule(StudyCertificateTestSchedule13VO studyCertificateTestSchedule13VO); 
	
	public int deleteStudyCertificateTestSchedule(StudyCertificateTestSchedule13VO studyCertificateTestSchedule13VO);
}
