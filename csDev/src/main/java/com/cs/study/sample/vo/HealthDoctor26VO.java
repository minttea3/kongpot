package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("healthDoctor26VO")
// 건강 - 등록된 닥터
public class HealthDoctor26VO {
	private String hdIdx; 				// 번호
	private String hdName; 				// 닥터이름
	private String hdMedicalField; 		// 진료분야
	private String hdTel;				// 연락처
	private String hdDate;				// 등록일자
}