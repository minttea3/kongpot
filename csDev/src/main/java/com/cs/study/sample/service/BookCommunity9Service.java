package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.BookCommuntiy9Mapper;
import com.cs.study.sample.vo.BookCommunity9VO;

@Service
public class BookCommunity9Service {
	
	public final BookCommuntiy9Mapper bookCommuntiy9Mapper;
	public BookCommunity9Service(BookCommuntiy9Mapper bookCommuntiy9Mapper) {
		this.bookCommuntiy9Mapper = bookCommuntiy9Mapper;
	}
	public BookCommunity9VO bookCommunitySelectOne(BookCommunity9VO bookCommunity9VO) {
		return bookCommuntiy9Mapper.bookCommunitySelectOne(bookCommunity9VO);
	}
	public List<BookCommunity9VO> bookCommunityList(BookCommunity9VO bookCommunity9VO){
		return bookCommuntiy9Mapper.bookCommunityList(bookCommunity9VO);
	}
	public int insertBookCommunity(BookCommunity9VO bookCommunity9VO) {
		return bookCommuntiy9Mapper.insertBookCommunity(bookCommunity9VO);
	}
	
	public int saveBookCommunity(BookCommunity9VO bookCommunity9VO) {
		return bookCommuntiy9Mapper.saveBookCommunity(bookCommunity9VO);
	} 
	
	public int updateBookCommunity(BookCommunity9VO bookCommunity9VO) {
		return bookCommuntiy9Mapper.updateBookCommunity(bookCommunity9VO);
	} 
	
	public int deleteBookCommunity(BookCommunity9VO bookCommunity9VO) {
		return bookCommuntiy9Mapper.deleteBookCommunity(bookCommunity9VO);
	} 
}
