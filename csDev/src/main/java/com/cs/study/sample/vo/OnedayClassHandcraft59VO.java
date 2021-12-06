package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("onedayClassHandcraft59VO")
// 원데이클래스-수공예 수업
public class OnedayClassHandcraft59VO {
	private int	   ochIdx;				// 고유 번호
	private String ochStoreName;		// 상호명
	private String ochLoc;				// 위치
	private String ochClassInfo;		// 클래스 소개
	private String ochDetail;			// 상세 정보
	private String ochPrice;			// 금액
	private String ochClassStatus;		// 수업 진행 여부
}
