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
	
	// 1�� ��ȸ
	public CodingQnA2VO codingQuaSelectOne(CodingQnA2VO codingQnA2VO) {
		return codingQnA2Mapper.codingQuaSelectOne(codingQnA2VO);
	}
	// ��ü ��ȸ
	public List<CodingQnA2VO> codingQuaList(CodingQnA2VO codingQnA2VO){
		return codingQnA2Mapper.codingQuaList(codingQnA2VO);
	}
	// ����
	public int savecodingQua(CodingQnA2VO codingQnA2VO){
		return codingQnA2Mapper.savecodingQua(codingQnA2VO);
	}
	// �Է�
	public int insertcodingQua(CodingQnA2VO codingQnA2VO){
		return codingQnA2Mapper.insertcodingQua(codingQnA2VO);
	}
	// ����
	public int updatecodingQua(CodingQnA2VO codingQnA2VO){
		return codingQnA2Mapper.updatecodingQua(codingQnA2VO);
	}
	// ����
	public int deletecodingQua(CodingQnA2VO codingQnA2VO){
		return codingQnA2Mapper.deletecodingQua(codingQnA2VO);
	}
}
