package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.CodingInfo3VO;
@Mapper
public interface CodingInfo3Mapper {
	
	public CodingInfo3VO codingInfoSelectOne(CodingInfo3VO codingInfo3VO);

	public List<CodingInfo3VO> codingInfoList(CodingInfo3VO codingInfo3VO);
	
	public int savecodingInfo(CodingInfo3VO codingInfo3VO); 
	
	public int insertcodingInfo(CodingInfo3VO codingInfo3VO);
	
	public int updatecodingInfo(CodingInfo3VO codingInfo3VO); 
	
	public int deletecodingInfo(CodingInfo3VO codingInfo3VO); 
}
