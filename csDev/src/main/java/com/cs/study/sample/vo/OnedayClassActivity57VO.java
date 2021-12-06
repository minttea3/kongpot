package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("onedayClassActivity57VO")
// 원데이클래스- 액티비티 수업
public class OnedayClassActivity57VO {
	private int	   ocacIdx;				// 고유 번호
	private String ocacStoreName;		// 상호명
	private String ocacLoc;				// 위치
	private String ocacClassInfo;		// 클래스 소개
	private String ocacDetail;			// 상세 정보
	private String ocacPrice;			// 금액
	private String ocacClassStatus;		// 수업 진행 여부
}
