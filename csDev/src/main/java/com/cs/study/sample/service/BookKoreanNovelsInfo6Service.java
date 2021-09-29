package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.BookKoreanNovelsInfo6Mapper;
import com.cs.study.sample.vo.BookKoreanNovelsInfo6VO;

@Service
public class BookKoreanNovelsInfo6Service {
	
	public final BookKoreanNovelsInfo6Mapper bookKoreanNovelsInfo6Mapper;
	public BookKoreanNovelsInfo6Service(BookKoreanNovelsInfo6Mapper bookKoreanNovelsInfo6Mapper) {
		this.bookKoreanNovelsInfo6Mapper = bookKoreanNovelsInfo6Mapper;
	}
	// 1�� ��ȸ
	public BookKoreanNovelsInfo6VO bookKoreanNovelsInfoSelectOne(BookKoreanNovelsInfo6VO bookKoreanNovelsInfo6VO) {
		return bookKoreanNovelsInfo6Mapper.bookKoreanNovelsInfoSelectOne(bookKoreanNovelsInfo6VO);
	}
	public List<BookKoreanNovelsInfo6VO> bookKoreanNovelsInfoList(BookKoreanNovelsInfo6VO bookKoreanNovelsInfo6VO){
		return bookKoreanNovelsInfo6Mapper.bookKoreanNovelsInfoList(bookKoreanNovelsInfo6VO);
	}
	public int insertBookKoreanNovelsInfo(BookKoreanNovelsInfo6VO bookKoreanNovelsInfo6VO) {
		return bookKoreanNovelsInfo6Mapper.insertBookKoreanNovelsInfo(bookKoreanNovelsInfo6VO);
	} // ���
	
	public int saveBookKoreanNovelsInfo(BookKoreanNovelsInfo6VO bookKoreanNovelsInfo6VO) {
		return bookKoreanNovelsInfo6Mapper.saveBookKoreanNovelsInfo(bookKoreanNovelsInfo6VO);
	} // ���� �� ���
	
	public int updateBookKoreanNovelsInfo(BookKoreanNovelsInfo6VO bookKoreanNovelsInfo6VO) {
		return bookKoreanNovelsInfo6Mapper.updateBookKoreanNovelsInfo(bookKoreanNovelsInfo6VO);
	} // ����
	
	public int deleteBookKoreanNovelsInfo(BookKoreanNovelsInfo6VO bookKoreanNovelsInfo6VO) {
		return bookKoreanNovelsInfo6Mapper.deleteBookKoreanNovelsInfo(bookKoreanNovelsInfo6VO);
	} // ����
}
