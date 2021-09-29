package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.BookEvent11Mapper;
import com.cs.study.sample.vo.BookEvent11VO;

@Service
public class BookEvent11Service {
	
	public final BookEvent11Mapper bookEvent11Mapper;
	public BookEvent11Service(BookEvent11Mapper bookEvent11Mapper) {
		this.bookEvent11Mapper = bookEvent11Mapper;
	}
	public BookEvent11VO bookEventSelectOne(BookEvent11VO bookEvent11VO) {
		return bookEvent11Mapper.bookEventSelectOne(bookEvent11VO);
	}
	public List<BookEvent11VO> bookEventList(BookEvent11VO bookEvent11VO){
		return bookEvent11Mapper.bookEventList(bookEvent11VO);
	}
	public int insertBookEvent(BookEvent11VO bookEvent11VO) {
		return bookEvent11Mapper.insertBookEvent(bookEvent11VO);
	}
	
	public int saveBookEvent(BookEvent11VO bookEvent11VO) {
		return bookEvent11Mapper.saveBookEvent(bookEvent11VO);
	} 
	
	public int updateBookEvent(BookEvent11VO bookEvent11VO) {
		return bookEvent11Mapper.updateBookEvent(bookEvent11VO);
	} 
	
	public int deleteBookBestseller(BookEvent11VO bookEvent11VO) {
		return bookEvent11Mapper.deleteBookBestseller(bookEvent11VO);
	} 
}
