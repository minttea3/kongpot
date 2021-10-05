package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("studyCertificateQnA16VO")
// 베스트 셀러 소개
public class StudyCertificateQnA16VO {
	private String scqIdx; 			// 번호
	private String scqName; 		// 글쓴이
	private String scqTitle; 		// 제목
	private String scqContent;		// 내용
	private String scqWriteDay;		// 작성일자
}