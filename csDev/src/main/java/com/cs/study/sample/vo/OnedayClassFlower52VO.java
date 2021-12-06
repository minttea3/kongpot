package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("onedayClassFlower52VO")
// 원데이클래스-플라워 수업
public class OnedayClassFlower52VO {
	private int	   ocfIdx;				// 고유 번호
	private String ocfStoreName;		// 상호명
	private String ocfLoc;				// 위치
	private String ocfClassInfo;		// 클래스 소개
	private String ocfDetail;			// 상세 정보
	private String ocfPrice;			// 금액
	private String ocfClassStatus;		// 수업 진행 여부
}
