package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("onedayClassArt53VO")
// 원데이클래스-미술 수업
public class OnedayClassArt53VO {
	private int	   ocaIdx;				// 고유 번호
	private String ocaStoreName;		// 상호명
	private String ocaLoc;				// 위치
	private String ocaClassInfo;		// 클래스 소개
	private String ocaDetail;			// 상세 정보
	private String ocaPrice;			// 금액
	private String ocaClassStatus;		// 수업 진행 여부
}
