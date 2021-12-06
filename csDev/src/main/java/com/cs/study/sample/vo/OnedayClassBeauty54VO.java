package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("onedayClassBeauty54VO")
// 원데이클래스-뷰티 수업
public class OnedayClassBeauty54VO {
	private int	   ocbeIdx;				// 고유 번호
	private String ocbeStoreName;		// 상호명
	private String ocbeLoc;				// 위치
	private String ocbeClassInfo;		// 클래스 소개
	private String ocbeDetail;			// 상세 정보
	private String ocbePrice;			// 금액
	private String ocbeClassStatus;		// 수업 진행 여부
}
