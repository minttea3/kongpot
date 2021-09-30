package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("studyCertificateTestSchedule13VO")
// 베스트 셀러 소개
public class StudyCertificateTestSchedule13VO {
	private String sctsIdx; 			// 번호
	private String sctsType; 			// 구분
	private String sctsClass; 			// 등급
	private String sctsTestName;		// 시험명
	private String sctsTestPeriod;		// 접수 기간
	private String sctsTestingDay;		// 시험일
}