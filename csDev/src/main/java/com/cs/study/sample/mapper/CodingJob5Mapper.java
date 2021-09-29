package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.CodingInfo3VO;
import com.cs.study.sample.vo.CodingJob5VO;
@Mapper
public interface CodingJob5Mapper {
	
	public CodingJob5VO codingJobSelectOne(CodingJob5VO codingJob5VO); // 한개 조회

	public List<CodingJob5VO> codingJobList(CodingJob5VO codingJob5VO);// 전체 조회
	
	public int insertCodingJob(CodingJob5VO codingJob5VO); // 등록
	
	public int saveCodingJob(CodingJob5VO codingJob5VO); // 저장 및 등록
	
	public int updateCodingJob(CodingJob5VO codingJob5VO); // 업뎃
	
	public int deleteCodingJob(CodingJob5VO codingJob5VO); // 삭제
}
