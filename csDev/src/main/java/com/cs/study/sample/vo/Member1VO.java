package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("member1VO")
// 회원목록리스트
public class Member1VO {
	private String mIdx;			// 회원번호
	private String mName;			// 회원명
	private String mGender;			// 성별
	private String mAge;			// 연령대
	private String mAddr;			// 주소
	private String mEmail;			// 이메일
	private String mRegistration;	// 등록일
	
}
