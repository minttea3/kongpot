package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("studyCertificateCommunityComment18VO")
// 베스트 셀러 소개
public class StudyCertificateCommunityComment18VO {
	private String scccIdx; 			// 번호
	private String sccIdx; 				// 커뮤니티17 테이블의 고유번호
	private String scccName; 			// 글쓴이
	private String scccContent;			// 내용
	private String scccWriteDay;		// 작성일자
}