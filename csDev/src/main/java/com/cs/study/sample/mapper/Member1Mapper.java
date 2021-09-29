package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.Member1VO;

@Mapper
public interface Member1Mapper {
	public Member1VO memberSelectOne(Member1VO member1VO);
	
	public List<Member1VO> memberList(Member1VO member1VO);
	
	public int saveMember(Member1VO member1VO);
	
	public int insertMember(Member1VO member1VO); 
	
	public int updateMember(Member1VO member1VO); 
	
	public int deleteMember(Member1VO member1VO); 
	
	
}
