package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.CodingQnA2Mapper;
import com.cs.study.sample.vo.CodingQnA2VO;

@Service
public class CodingQnA2Service {
public final CodingQnA2Mapper codingQnA2Mapper;
	
	public CodingQnA2Service(CodingQnA2Mapper codingQnA2Mapper) {
		this.codingQnA2Mapper = codingQnA2Mapper;
	}
	
	// 1개 조회
	public CodingQnA2VO codingQuaSelectOne(CodingQnA2VO codingQnA2VO) {
		return codingQnA2Mapper.codingQuaSelectOne(codingQnA2VO);
	}
	// 전체 조회
	public List<CodingQnA2VO> codingQuaList(CodingQnA2VO codingQnA2VO){
		return codingQnA2Mapper.codingQuaList(codingQnA2VO);
	}
	// 저장
	public int savecodingQua(CodingQnA2VO codingQnA2VO){
		return codingQnA2Mapper.savecodingQua(codingQnA2VO);
	}
	// 입력
	public int insertcodingQua(CodingQnA2VO codingQnA2VO){
		return codingQnA2Mapper.insertcodingQua(codingQnA2VO);
	}
	// 수정
	public int updatecodingQua(CodingQnA2VO codingQnA2VO){
		return codingQnA2Mapper.updatecodingQua(codingQnA2VO);
	}
	// 삭제
	public int deletecodingQua(CodingQnA2VO codingQnA2VO){
		return codingQnA2Mapper.deletecodingQua(codingQnA2VO);
	}
}
