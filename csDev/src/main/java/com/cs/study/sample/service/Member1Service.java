package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.Member1Mapper;
import com.cs.study.sample.vo.Member1VO;

@Service
public class Member1Service {

	public final Member1Mapper member1Mapper;
	
	public Member1Service(Member1Mapper member1Mapper) {
		this.member1Mapper = member1Mapper;
	}
	
	// 1개 조회
	public Member1VO memberSelectOne(Member1VO member1VO) {
		return  member1Mapper.memberSelectOne(member1VO);
	}
	// 전체 조회
	public List<Member1VO> memberList(Member1VO member1VO){
		return member1Mapper.memberList(member1VO);
	}
	// 저장
	public int saveMember(Member1VO member1VO){
		return member1Mapper.saveMember(member1VO);
	}
	// 입력
	public int insertMember(Member1VO member1VO){
		return member1Mapper.insertMember(member1VO);
	}
	// 수정
	public int updateMember(Member1VO member1VO){
		return member1Mapper.updateMember(member1VO);
	}
	// 삭제
	public int deleteMember(Member1VO member1VO){
		return member1Mapper.deleteMember(member1VO);
	}
}
