package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.CodingInfo3Mapper;
import com.cs.study.sample.mapper.CodingQnA2Mapper;
import com.cs.study.sample.vo.CodingInfo3VO;
import com.cs.study.sample.vo.CodingQnA2VO;

@Service
public class CodingInfo3Service {
	
	public final CodingInfo3Mapper codingInfo3Mapper;
	public CodingInfo3Service(CodingInfo3Mapper codingInfo3Mapper) {
		this.codingInfo3Mapper = codingInfo3Mapper;
	}
	// 1개 조회
	public CodingInfo3VO codingQuaSelectOne(CodingInfo3VO codingInfo3VO) {
		return codingInfo3Mapper.codingInfoSelectOne(codingInfo3VO);
	}
	public List<CodingInfo3VO> codingInfoList(CodingInfo3VO codingInfo3VO){
		return codingInfo3Mapper.codingInfoList(codingInfo3VO);
	}
	public int savecodingInfo(CodingInfo3VO codingInfo3VO) {
		return codingInfo3Mapper.savecodingInfo(codingInfo3VO);
	} // 저장 및 등록
	
	public int insertcodingInfo(CodingInfo3VO codingInfo3VO) {
		return codingInfo3Mapper.insertcodingInfo(codingInfo3VO);
	} // 등록
	
	public int updatecodingInfo(CodingInfo3VO codingInfo3VO) {
		return codingInfo3Mapper.updatecodingInfo(codingInfo3VO);
	} // 업뎃
	
	public int deletecodingInfo(CodingInfo3VO codingInfo3VO) {
		return codingInfo3Mapper.deletecodingInfo(codingInfo3VO);
	} // 삭제
}
