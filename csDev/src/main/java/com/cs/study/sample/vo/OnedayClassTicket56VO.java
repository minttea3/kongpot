package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("onedayClassTicket56VO")
// 원데이클래스- 티켓 수업
public class OnedayClassTicket56VO {
	private int	   octIdx;				// 고유 번호
	private String octStoreName;		// 상호명
	private String octLoc;				// 위치
	private String octClassInfo;		// 클래스 소개
	private String octDetail;			// 상세 정보
	private String octPrice;			// 금액
	private String octClassStatus;		// 수업 진행 여부
}
