package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.BookBestseller8Mapper;
import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;

@Service
public class BookBestseller8Service {
	
	public final BookBestseller8Mapper bookBestseller8Mapper;
	public BookBestseller8Service(BookBestseller8Mapper bookBestseller8Mapper) {
		this.bookBestseller8Mapper = bookBestseller8Mapper;
	}
	public BookBestseller8VO bookForeignNovelsInfoSelectOne(BookBestseller8VO bookBestseller8VO) {
		return bookBestseller8Mapper.bookBestsellerSelectOne(bookBestseller8VO);
	}
	public List<BookBestseller8VO> bookForeignNovelsInfoList(BookBestseller8VO bookBestseller8VO){
		return bookBestseller8Mapper.bookBestsellerList(bookBestseller8VO);
	}
	public int insertBookForeignNovelsInfo(BookBestseller8VO bookBestseller8VO) {
		return bookBestseller8Mapper.insertBookBestseller(bookBestseller8VO);
	}
	
	public int saveBookForeignNovelsInfo(BookBestseller8VO bookBestseller8VO) {
		return bookBestseller8Mapper.saveBookBestseller(bookBestseller8VO);
	} 
	
	public int updateBookForeignNovelsInfo(BookBestseller8VO bookBestseller8VO) {
		return bookBestseller8Mapper.updateBookBestseller(bookBestseller8VO);
	} 
	
	public int deleteBookForeignNovelsInfo(BookBestseller8VO bookBestseller8VO) {
		return bookBestseller8Mapper.deleteBookBestseller(bookBestseller8VO);
	} 
}
