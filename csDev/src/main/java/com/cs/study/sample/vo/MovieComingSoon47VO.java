package com.cs.study.sample.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("movieComingSoon47VO")
// 영화-개봉예정작
public class MovieComingSoon47VO {
	private String mcsIdx;				// 고유 번호
	private String mcsMovieTitle;		// 영화 제목
	private String mcsReservationRate;	// 예매율
	private String mcsReleaseDate;		// 개봉일
}
