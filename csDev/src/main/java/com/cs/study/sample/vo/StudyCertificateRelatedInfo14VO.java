package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("studyCertificateRelatedInfo14VO")
// 베스트 셀러 소개
public class StudyCertificateRelatedInfo14VO {
	private String scriIdx; 			// 번호
	private String scriName; 			// 글쓴이
	private String scriTitle; 			// 제목
	private String scriContent;			// 내용
	private String scriWriteDay;		// 작성일자
}