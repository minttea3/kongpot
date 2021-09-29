package com.cs.study.sample.controller.book;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.BookBestseller8Service;
import com.cs.study.sample.service.BookForeignNovelsInfo7Service;
import com.cs.study.sample.service.BookKoreanNovelsInfo6Service;
import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.BookKoreanNovelsInfo6VO;

@Controller
public class SyncControllerBookBestSellerInfo {

	
	  private final BookBestseller8Service bookBestseller8Service;
	  
	  public SyncControllerBookBestSellerInfo(BookBestseller8Service bookBestseller8Service) { 
		  this.bookBestseller8Service = bookBestseller8Service;
	  }
	 
	@GetMapping("/bookBestSellerInfoList")
	public String bookBestSellerInfoList(Model model, BookBestseller8VO  bookBestseller8VO) {
		List<BookBestseller8VO> bookForeignNovelsInfoList = bookBestseller8Service.bookForeignNovelsInfoList(bookBestseller8VO);
		model.addAttribute("bookForeignNovelsInfoList", bookForeignNovelsInfoList);
		model.addAttribute("bookBestseller8VO",bookBestseller8VO);
		
		return "sample/book/bookBestSellerInfoList";
	}
	
	  @GetMapping("/syncBookBestSellerForm") 
	  public String syncBookBestSellerForm(Model model, BookBestseller8VO  bookBestseller8VO){
			
			  if (!StringUtils.isEmpty( bookBestseller8VO.getBbIdx() )){ 
				  BookBestseller8VO bookForeignNovelsInfoSelectOne = bookBestseller8Service.bookForeignNovelsInfoSelectOne(bookBestseller8VO);
			  model.addAttribute("bookBestseller8VO", bookForeignNovelsInfoSelectOne); 
			  }
	  return "sample/book/syncBookBestSellerForm"; 
	  }
	 
	
	  @PostMapping("/syncBookBestsellerFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, BookBestseller8VO  bookBestseller8VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = bookBestseller8Service.insertBookForeignNovelsInfo(bookBestseller8VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = bookBestseller8Service.updateBookForeignNovelsInfo(bookBestseller8VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = bookBestseller8Service.deleteBookForeignNovelsInfo(bookBestseller8VO);
		  } 
		  return "redirect:bookBestSellerInfoList";
	  }
	 
}
