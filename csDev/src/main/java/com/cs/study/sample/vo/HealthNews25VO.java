package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("healthNews25VO")
// 건강 - 문의
public class HealthNews25VO {
	private String hnIdx; 				// 번호
	private String hnName; 				// 글쓴이
	private String hnTitle; 			// 제목
	private String hnContent;			// 내용
	private String hnDate;				// 작성일자
}