package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.CodingCommunity4VO;

//�ڵ����� Ŀ�´�Ƽ 
@Mapper
public interface CodingCommunity4Mapper {
	
	public CodingCommunity4VO codingCommunitySelectOne(CodingCommunity4VO codingCommunity4VO); 

	public List<CodingCommunity4VO> codingCommunityList(CodingCommunity4VO codingCommunity4VO);
	
	public int insertCodingCommunity(CodingCommunity4VO codingCommunity4VO); 
	
	public int savecodingCommunity(CodingCommunity4VO codingCommunity4VO); 
	
	public int updateCodingCommunity(CodingCommunity4VO codingCommunity4VO); 
	
	public int deleteCodingCommunity(CodingCommunity4VO codingCommunity4VO); 
}
