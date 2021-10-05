package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("studyCertificateCommunity17VO")
// 베스트 셀러 소개
public class StudyCertificateCommunity17VO {
	private String sccIdx; 			// 번호
	private String sccName; 		// 글쓴이
	private String sccTestingName; 	// 글쓴이
	private String sccTitle; 		// 제목
	private String sccContent;		// 내용
}