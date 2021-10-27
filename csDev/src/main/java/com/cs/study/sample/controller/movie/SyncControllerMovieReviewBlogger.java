package com.cs.study.sample.controller.movie;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.MovieInfo44Service;
import com.cs.study.sample.service.MovieReviewBlogger45Service;
import com.cs.study.sample.vo.MovieReviewBlogger45VO;
import com.cs.study.sample.vo.MovieReviewBlogger45VO;

@Controller
public class SyncControllerMovieReviewBlogger {

	
	  private final MovieReviewBlogger45Service movieReviewBlogger45Service;
	  
	  public SyncControllerMovieReviewBlogger(MovieReviewBlogger45Service movieReviewBlogger45Service) { 
		  this.movieReviewBlogger45Service = movieReviewBlogger45Service;
	  }
	 
	@GetMapping("/movieReviewBloggerList")
	public String movieReviewBloggerList(Model model, MovieReviewBlogger45VO  movieReviewBlogger45VO) {
		List<MovieReviewBlogger45VO> movieReviewBloggerList = movieReviewBlogger45Service.movieReviewBloggerList(movieReviewBlogger45VO);
		model.addAttribute("movieReviewBloggerList", movieReviewBloggerList);
		model.addAttribute("movieReviewBlogger45VO",movieReviewBlogger45VO);
		
		return "sample/movie/movieReviewBloggerList";
	}
	
	  @GetMapping("/syncMovieReviewBloggerForm") 
	  public String movieReviewBloggerSelectOne(Model model, MovieReviewBlogger45VO  movieReviewBlogger45VO){
			
			  if (!StringUtils.isEmpty( movieReviewBlogger45VO.getMrbIdx() )){ 
				  MovieReviewBlogger45VO movieReviewBloggerSelectOne = movieReviewBlogger45Service.movieReviewBloggerSelectOne(movieReviewBlogger45VO);
			  model.addAttribute("movieReviewBlogger45VO", movieReviewBloggerSelectOne); 
			  }
	  return "sample/movie/syncMovieReviewBloggerForm"; 
	  }
	 
	
	  @PostMapping("/syncMovieReviewBloggerFormSave") 
	  public String syncMovieReviewBloggerFormSave(Model  model, MovieReviewBlogger45VO  movieReviewBlogger45VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = movieReviewBlogger45Service.insertMovieReviewBlogger(movieReviewBlogger45VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = movieReviewBlogger45Service.updateMovieReviewBlogger(movieReviewBlogger45VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = movieReviewBlogger45Service.deleteMovieReviewBlogger(movieReviewBlogger45VO);
		  } 
		  return "redirect:movieReviewBloggerList";
	  }
	 
}
