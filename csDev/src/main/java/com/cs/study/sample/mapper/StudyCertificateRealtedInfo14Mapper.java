package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.BookKoreanNovelsInfo6VO;
import com.cs.study.sample.vo.CodingInfo3VO;
import com.cs.study.sample.vo.StudyCertificateRelatedInfo14VO;
import com.cs.study.sample.vo.StudyCertificateTestSchedule13VO;
@Mapper
public interface StudyCertificateRealtedInfo14Mapper {
	
	public StudyCertificateRelatedInfo14VO studyCertificateRelatedInfoSelectOne(StudyCertificateRelatedInfo14VO studyCertificateRelatedInfo14VO); 

	public List<StudyCertificateRelatedInfo14VO> studyCertificateRelatedInfoList(StudyCertificateRelatedInfo14VO studyCertificateRelatedInfo14VO);
	
	public int insertStudyCertificateRelatedInfo(StudyCertificateRelatedInfo14VO studyCertificateRelatedInfo14VO); 
	
	public int saveStudyCertificateRelatedInfo(StudyCertificateRelatedInfo14VO studyCertificateRelatedInfo14VO); 
	
	public int updateStudyCertificateRelatedInfo(StudyCertificateRelatedInfo14VO studyCertificateRelatedInfo14VO); 
	
	public int deleteStudyCertificateRelatedInfo(StudyCertificateRelatedInfo14VO studyCertificateRelatedInfo14VO);
}
