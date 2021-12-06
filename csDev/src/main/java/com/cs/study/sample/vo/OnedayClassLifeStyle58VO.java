package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("onedayClassLifeStyle58VO")
// 원데이클래스-라이프스타일 수업
public class OnedayClassLifeStyle58VO {
	private int	   oclsIdx;				// 고유 번호
	private String oclsStoreName;		// 상호명
	private String oclsLoc;				// 위치
	private String oclsClassInfo;		// 클래스 소개
	private String oclsDetail;			// 상세 정보
	private String oclsPrice;			// 금액
	private String oclsClassStatus;		// 수업 진행 여부
}
