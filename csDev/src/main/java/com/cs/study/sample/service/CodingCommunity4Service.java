package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.CodingCommunity4Mapper;
import com.cs.study.sample.vo.CodingCommunity4VO;
import com.cs.study.sample.vo.CodingInfo3VO;

@Service
public class CodingCommunity4Service {
	public final CodingCommunity4Mapper codingCommunity4Mapper;
	
	 public CodingCommunity4Service(CodingCommunity4Mapper codingCommunity4Mapper) {
		this.codingCommunity4Mapper = codingCommunity4Mapper;
	}
	 
	public CodingCommunity4VO codingCommunitySelectOne(CodingCommunity4VO codingCommunity4VO) {
		return codingCommunity4Mapper.codingCommunitySelectOne(codingCommunity4VO);
	}
	public List<CodingCommunity4VO> codingCommunityList(CodingCommunity4VO codingCommunity4VO){
		return codingCommunity4Mapper.codingCommunityList(codingCommunity4VO);
	}
	public int savecodingInfo(CodingCommunity4VO codingCommunity4VO) {
		return codingCommunity4Mapper.savecodingCommunity(codingCommunity4VO);
	} // 저장 및 등록
	
	public int insertcodingInfo(CodingCommunity4VO codingCommunity4VO) {
		return codingCommunity4Mapper.insertCodingCommunity(codingCommunity4VO);
	} // 등록
	
	public int updatecodingInfo(CodingCommunity4VO codingCommunity4VO) {
		return codingCommunity4Mapper.updateCodingCommunity(codingCommunity4VO);
	} // 업뎃
	
	public int deletecodingInfo(CodingCommunity4VO codingCommunity4VO) {
		return codingCommunity4Mapper.deleteCodingCommunity(codingCommunity4VO);
	} // 삭제
}
