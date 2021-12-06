package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("onedayClassMusic55VO")
// 원데이클래스- 음악 수업
public class OnedayClassMusic55VO {
	private int	   ocmIdx;				// 고유 번호
	private String ocmStoreName;		// 상호명
	private String ocmLoc;				// 위치
	private String ocmClassInfo;		// 클래스 소개
	private String ocmDetail;			// 상세 정보
	private String ocmPrice;			// 금액
	private String ocmClassStatus;		// 수업 진행 여부
}
