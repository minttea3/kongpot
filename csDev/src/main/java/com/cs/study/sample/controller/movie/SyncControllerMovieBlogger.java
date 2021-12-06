package com.cs.study.sample.controller.movie;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.MovieBlogger48Service;
import com.cs.study.sample.vo.MovieBlogger48VO;

@Controller
public class SyncControllerMovieBlogger {

	
	  private final MovieBlogger48Service movieBlogger48Service;
	  
	  public SyncControllerMovieBlogger(MovieBlogger48Service movieBlogger48Service) { 
		  this.movieBlogger48Service = movieBlogger48Service;
	  }
	 
	@GetMapping("/movieBloggerList")
	public String movieBloggerList(Model model, MovieBlogger48VO  movieBlogger48VO) {
		List<MovieBlogger48VO> movieBloggerList = movieBlogger48Service.movieBloggerList(movieBlogger48VO);
		model.addAttribute("movieBloggerList", movieBloggerList);
		model.addAttribute("movieBlogger48VO",movieBlogger48VO);
		
		return "sample/movie/movieBloggerList";
	}
	
	  @GetMapping("/syncMovieBloggerForm") 
	  public String syncAquariumfishInfoForm(Model model, MovieBlogger48VO  movieBlogger48VO){
			
			  if (!StringUtils.isEmpty( movieBlogger48VO.getMbIdx() )){ 
				  MovieBlogger48VO movieBloggerSelectOne = movieBlogger48Service.movieBloggerSelectOne(movieBlogger48VO);
			  model.addAttribute("movieBlogger48VO", movieBloggerSelectOne); 
			  }
	  return "sample/movie/syncMovieBloggerForm"; 
	  }
	 
	
	  @PostMapping("/syncMovieBloggerFormSave") 
	  public String syncAquariumfishInfoFormSave(Model  model, MovieBlogger48VO  movieBlogger48VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = movieBlogger48Service.insertMovieBlogger(movieBlogger48VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = movieBlogger48Service.updateMovieBlogger(movieBlogger48VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = movieBlogger48Service.deleteMovieBlogger(movieBlogger48VO);
		  } 
		  return "redirect:movieBloggerList";
	  }
	 
}
