package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.BookBestseller8Mapper;
import com.cs.study.sample.mapper.BookUsedMarketplace10Mapper;
import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.BookUsedMarketplace10VO;

@Service
public class BookUsedMarketplace10Service {
	
	public final BookUsedMarketplace10Mapper bookUsedMarketplace10Mapper;
	public BookUsedMarketplace10Service(BookUsedMarketplace10Mapper bookUsedMarketplace10Mapper) {
		this.bookUsedMarketplace10Mapper = bookUsedMarketplace10Mapper;
	}
	public BookUsedMarketplace10VO bookUsedMarketplaceSelectOne(BookUsedMarketplace10VO bookUsedMarketplace10VO) {
		return bookUsedMarketplace10Mapper.bookUsedMarketplaceSelectOne(bookUsedMarketplace10VO);
	}
	public List<BookUsedMarketplace10VO> bookUsedMarketplaceList(BookUsedMarketplace10VO bookUsedMarketplace10VO){
		return bookUsedMarketplace10Mapper.bookUsedMarketplaceList(bookUsedMarketplace10VO);
	}
	public int insertBookUsedMarketplace(BookUsedMarketplace10VO bookUsedMarketplace10VO) {
		return bookUsedMarketplace10Mapper.insertBookUsedMarketplace(bookUsedMarketplace10VO);
	}
	
	public int saveBookUsedMarketplace(BookUsedMarketplace10VO bookUsedMarketplace10VO) {
		return bookUsedMarketplace10Mapper.saveBookUsedMarketplace(bookUsedMarketplace10VO);
	} 
	
	public int updateBookUsedMarketplace(BookUsedMarketplace10VO bookUsedMarketplace10VO) {
		return bookUsedMarketplace10Mapper.updateBookUsedMarketplace(bookUsedMarketplace10VO);
	} 
	
	public int deleteBookUsedMarketplace(BookUsedMarketplace10VO bookUsedMarketplace10VO) {
		return bookUsedMarketplace10Mapper.deleteBookUsedMarketplace(bookUsedMarketplace10VO);
	} 
}
