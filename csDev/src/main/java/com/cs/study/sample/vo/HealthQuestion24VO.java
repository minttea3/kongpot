package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("healthQuestion24VO")
// 건강 - 문의
public class HealthQuestion24VO {
	private String hqIdx; 				// 번호
	private String hqName; 				// 글쓴이
	private String hqTel; 				// 연락처
	private String hqTitle; 			// 제목
	private String hqContent;			// 내용
}