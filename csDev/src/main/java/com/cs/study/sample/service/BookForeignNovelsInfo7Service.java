package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.BookForeignNovelsInfo7Mapper;
import com.cs.study.sample.mapper.BookKoreanNovelsInfo6Mapper;
import com.cs.study.sample.mapper.CodingJob5Mapper;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.BookKoreanNovelsInfo6VO;
import com.cs.study.sample.vo.CodingInfo3VO;
import com.cs.study.sample.vo.CodingJob5VO;

@Service
public class BookForeignNovelsInfo7Service {
	
	public final BookForeignNovelsInfo7Mapper bookForeignNovelsInfo7Mapper;
	public BookForeignNovelsInfo7Service(BookForeignNovelsInfo7Mapper bookForeignNovelsInfo7Mapper) {
		this.bookForeignNovelsInfo7Mapper = bookForeignNovelsInfo7Mapper;
	}
	// 1개 조회
	public BookForeignNovelsInfo7VO bookForeignNovelsInfoSelectOne(BookForeignNovelsInfo7VO bookForeignNovelsInfo7VO) {
		return bookForeignNovelsInfo7Mapper.bookForeignNovelsInfoSelectOne(bookForeignNovelsInfo7VO);
	}
	public List<BookForeignNovelsInfo7VO> bookForeignNovelsInfoList(BookForeignNovelsInfo7VO bookForeignNovelsInfo7VO){
		return bookForeignNovelsInfo7Mapper.bookForeignNovelsInfoList(bookForeignNovelsInfo7VO);
	}
	public int insertBookForeignNovelsInfo(BookForeignNovelsInfo7VO bookForeignNovelsInfo7VO) {
		return bookForeignNovelsInfo7Mapper.insertBookForeignNovelsInfo(bookForeignNovelsInfo7VO);
	} // 등록
	
	public int saveBookForeignNovelsInfo(BookForeignNovelsInfo7VO bookForeignNovelsInfo7VO) {
		return bookForeignNovelsInfo7Mapper.saveBookForeignNovelsInfo(bookForeignNovelsInfo7VO);
	} // 저장 및 등록
	
	public int updateBookForeignNovelsInfo(BookForeignNovelsInfo7VO bookForeignNovelsInfo7VO) {
		return bookForeignNovelsInfo7Mapper.updateBookForeignNovelsInfo(bookForeignNovelsInfo7VO);
	} // 업뎃
	
	public int deleteBookForeignNovelsInfo(BookForeignNovelsInfo7VO bookForeignNovelsInfo7VO) {
		return bookForeignNovelsInfo7Mapper.deleteBookForeignNovelsInfo(bookForeignNovelsInfo7VO);
	} // 삭제
}
