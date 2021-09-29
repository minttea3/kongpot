package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.CodingQnA2VO;
import com.cs.study.sample.vo.Member1VO;
@Mapper
public interface CodingQnA2Mapper {
	
	public CodingQnA2VO codingQuaSelectOne(CodingQnA2VO codingQnA2VO); 
	
	public List<CodingQnA2VO> codingQuaList(CodingQnA2VO codingQnA2VO);
	
	public int savecodingQua(CodingQnA2VO codingQnA2VO); 
	
	public int insertcodingQua(CodingQnA2VO codingQnA2VO); 
	
	public int updatecodingQua(CodingQnA2VO codingQnA2VO); 
	
	public int deletecodingQua(CodingQnA2VO codingQnA2VO); 

}
