package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.BookKoreanNovelsInfo6VO;
import com.cs.study.sample.vo.CodingInfo3VO;
import com.cs.study.sample.vo.StudyCertificateNotice12VO;
@Mapper
public interface StydyCertificateNotice12Mapper {
	
	public StudyCertificateNotice12VO studyCertificateNoticeSelectOne(StudyCertificateNotice12VO studyCertificateNotice12VO); 

	public List<StudyCertificateNotice12VO> studyCertificateNoticeList(StudyCertificateNotice12VO studyCertificateNotice12VO);
	
	public int insertStudyCertificateNotice(StudyCertificateNotice12VO studyCertificateNotice12VO); 
	
	public int saveStudyCertificateNotice(StudyCertificateNotice12VO studyCertificateNotice12VO); 
	
	public int updateStudyCertificateNotice(StudyCertificateNotice12VO studyCertificateNotice12VO); 
	
	public int deleteStudyCertificateNotice(StudyCertificateNotice12VO studyCertificateNotice12VO);
}
