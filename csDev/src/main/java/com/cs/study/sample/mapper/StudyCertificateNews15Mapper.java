package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.BookKoreanNovelsInfo6VO;
import com.cs.study.sample.vo.CodingInfo3VO;
import com.cs.study.sample.vo.StudyCertificateNews15VO;
import com.cs.study.sample.vo.StudyCertificateRelatedInfo14VO;
import com.cs.study.sample.vo.StudyCertificateTestSchedule13VO;
@Mapper
public interface StudyCertificateNews15Mapper {
	
	public StudyCertificateNews15VO studyCertificateNewsSelectOne(StudyCertificateNews15VO studyCertificateNews15VO); 

	public List<StudyCertificateNews15VO> studyCertificateNewsList(StudyCertificateNews15VO studyCertificateNews15VO);
	
	public int insertStudyCertificateNews(StudyCertificateNews15VO studyCertificateNews15VO); 
	
	public int saveStudyCertificateNews(StudyCertificateNews15VO studyCertificateNews15VO); 
	
	public int updateStudyCertificateNews(StudyCertificateNews15VO studyCertificateNews15VO); 
	
	public int deleteStudyCertificateNews(StudyCertificateNews15VO studyCertificateNews15VO);
}
