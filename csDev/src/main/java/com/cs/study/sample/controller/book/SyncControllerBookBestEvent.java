package com.cs.study.sample.controller.book;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.BookBestseller8Service;
import com.cs.study.sample.service.BookEvent11Service;
import com.cs.study.sample.service.BookForeignNovelsInfo7Service;
import com.cs.study.sample.service.BookKoreanNovelsInfo6Service;
import com.cs.study.sample.vo.BookBestseller8VO;
import com.cs.study.sample.vo.BookEvent11VO;
import com.cs.study.sample.vo.BookForeignNovelsInfo7VO;
import com.cs.study.sample.vo.BookKoreanNovelsInfo6VO;

@Controller
public class SyncControllerBookBestEvent {

	
	  private final BookEvent11Service bookEvent11Service;
	  
	  public SyncControllerBookBestEvent(BookEvent11Service bookEvent11Service) { 
		  this.bookEvent11Service = bookEvent11Service;
	  }
	 
	@GetMapping("/bookEventList")
	public String bookBestSellerInfoList(Model model, BookEvent11VO  bookEvent11VO) {
		List<BookEvent11VO> bookEventList = bookEvent11Service.bookEventList(bookEvent11VO);
		model.addAttribute("bookEventList", bookEventList);
		model.addAttribute("bookEvent11VO",bookEvent11VO);
		
		return "sample/book/bookEventList";
	}
	
	  @GetMapping("/syncBookEventForm") 
	  public String syncBookBestSellerForm(Model model, BookEvent11VO  bookEvent11VO){
			
			  if (!StringUtils.isEmpty( bookEvent11VO.getBeIdx() )){ 
				  BookEvent11VO bookEventSelectOne = bookEvent11Service.bookEventSelectOne(bookEvent11VO);
			  model.addAttribute("bookEvent11VO", bookEventSelectOne); 
			  }
	  return "sample/book/syncBookEventForm"; 
	  }
	 
	
	  @PostMapping("/syncBookEventFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, BookEvent11VO  bookEvent11VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = bookEvent11Service.insertBookEvent(bookEvent11VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = bookEvent11Service.updateBookEvent(bookEvent11VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = bookEvent11Service.deleteBookBestseller(bookEvent11VO);
		  } 
		  return "redirect:bookEventList";
	  }
	 
}
