package com.cs.study.sample.controller.book;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.BookForeignNovelsInfo7Service;
import com.cs.study.sample.service.BookKoreanNovelsInfo6Service;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.BookKoreanNovelsInfo6VO;

@Controller
public class SyncControllerBookForeignNovelsInfo {

	
	  private final BookForeignNovelsInfo7Service bookForeignNovelsInfo7Service;
	  
	  public SyncControllerBookForeignNovelsInfo(BookForeignNovelsInfo7Service bookForeignNovelsInfo7Service) { 
		  this.bookForeignNovelsInfo7Service = bookForeignNovelsInfo7Service;
	  }
	 
	@GetMapping("/bookForeignNovelsList")
	public String bookForeignNovelsList(Model model, BookForeignNovelsInfo7VO  bookForeignNovelsInfo7VO) {
		List<BookForeignNovelsInfo7VO> bookForeignNovelsInfoList = bookForeignNovelsInfo7Service.bookForeignNovelsInfoList(bookForeignNovelsInfo7VO);
		model.addAttribute("bookForeignNovelsInfoList",bookForeignNovelsInfoList);
		model.addAttribute("bookForeignNovelsInfo7VO",bookForeignNovelsInfo7VO);
		
		return "sample/book/bookForeignNovelsList";
	}
	
	  @GetMapping("/syncbookForeignNovelsForm") 
	  public String syncbookForeignNovelsForm(Model model, BookForeignNovelsInfo7VO  bookForeignNovelsInfo7VO){
			
			  if (!StringUtils.isEmpty( bookForeignNovelsInfo7VO.getBfIdx() )){ 
				  BookForeignNovelsInfo7VO bookKoreanNovelsInfoSelectOne = bookForeignNovelsInfo7Service.bookForeignNovelsInfoSelectOne(bookForeignNovelsInfo7VO);
			  model.addAttribute("bookForeignNovelsInfo7VO", bookKoreanNovelsInfoSelectOne); }
	  return "sample/book/syncbookForeignNovelsForm"; 
	  }
	 
	
	  @PostMapping("/syncBookForeignNovelsFormSave") 
	  public String syncBookForeignNovelsFormSave(Model  model, BookForeignNovelsInfo7VO  bookForeignNovelsInfo7VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = bookForeignNovelsInfo7Service.insertBookForeignNovelsInfo(bookForeignNovelsInfo7VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = bookForeignNovelsInfo7Service.updateBookForeignNovelsInfo(bookForeignNovelsInfo7VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = bookForeignNovelsInfo7Service.deleteBookForeignNovelsInfo(bookForeignNovelsInfo7VO);
		  } 
		  return "redirect:bookForeignNovelsList";
	  }
	 
}
