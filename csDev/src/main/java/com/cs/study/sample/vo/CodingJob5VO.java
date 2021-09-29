package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("codingJob5VO")
// 코딩 관련 job
public class CodingJob5VO {
	private String cjIdx;		// 공고번호
	private String cjCompany;	// 회사명
	private String cjName;		// 담당자
	private String cjTel;		// 연락처
	private String cjEmail;		// 메일주소
	private String cjTitle;		// 제목
	private String cjContent;	// 내용
	private String cjDate;		// 날짜
}
