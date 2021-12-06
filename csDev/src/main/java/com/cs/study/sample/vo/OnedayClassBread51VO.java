package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("onedayClassBread51VO")
// 원데이클래스-빵 만들기
public class OnedayClassBread51VO {
	private int ocbIdx;				// 고유 번호
	private String ocbStoreName;		// 상호명
	private String ocbLoc;				// 위치
	private String ocbClassInfo;		// 클래스 소개
	private String ocbDetail;			// 상세 정보
	private String ocbPrice;			// 금액
	private String ocbClassStatus;		// 수업 진행 여부
}
