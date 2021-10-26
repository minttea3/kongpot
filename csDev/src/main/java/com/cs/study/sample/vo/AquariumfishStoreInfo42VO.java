package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("aquariumfishStoreInfo42VO")
// 물고기 - 소개
public class AquariumfishStoreInfo42VO {
	private String asiIdx;			// 고유 번호
	private String asiStoreName;	// 상호명
	private String asiLoc;			// 위치
	private String asiTel;			// 연락처
	private String asiStatus;		// 운영 여부(Y/N)
}
