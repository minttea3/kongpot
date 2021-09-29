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
	
	// 1�� ��ȸ
	public Member1VO memberSelectOne(Member1VO member1VO) {
		return  member1Mapper.memberSelectOne(member1VO);
	}
	// ��ü ��ȸ
	public List<Member1VO> memberList(Member1VO member1VO){
		return member1Mapper.memberList(member1VO);
	}
	// ����
	public int saveMember(Member1VO member1VO){
		return member1Mapper.saveMember(member1VO);
	}
	// �Է�
	public int insertMember(Member1VO member1VO){
		return member1Mapper.insertMember(member1VO);
	}
	// ����
	public int updateMember(Member1VO member1VO){
		return member1Mapper.updateMember(member1VO);
	}
	// ����
	public int deleteMember(Member1VO member1VO){
		return member1Mapper.deleteMember(member1VO);
	}
}
