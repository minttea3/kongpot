package com.cs.study.sample.vo;

import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("onedayClassMember50VO")
// 원데이클래스 - 회원
public class OnedayClassMember50VO {
	private int ocmIdx;			// 고유 번호 (자동증가 기본키)
	private String ocmId;			// 아이디
	private String ocmPw;			// 비밀번호
	private String ocmPwQuestion;	// 비밀번호 질문
	private String ocmPwAnswer;		// 비밀번호 답변
	private String ocmGender;		// 성별
	private String ocmTermsinfoYn;	// 개인정보 동의
	private List<OnedayClassMember50VO> onedayClassMemberVO; // 단건처리를 조회화면에서 여러건 한번에 하기 위해 리스트 선언!
}
