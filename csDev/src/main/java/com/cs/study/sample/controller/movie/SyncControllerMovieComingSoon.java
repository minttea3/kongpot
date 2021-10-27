package com.cs.study.sample.controller.movie;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.MovieComingSoon47Service;
import com.cs.study.sample.vo.MovieComingSoon47VO;

@Controller
public class SyncControllerMovieComingSoon {

	
	  private final MovieComingSoon47Service movieComingSoon47Service;
	  
	  public SyncControllerMovieComingSoon(MovieComingSoon47Service movieComingSoon47Service) { 
		  this.movieComingSoon47Service = movieComingSoon47Service;
	  }
	 
	@GetMapping("/movieComingSoonList")
	public String movieComingSoonList(Model model, MovieComingSoon47VO  movieComingSoon47VO) {
		List<MovieComingSoon47VO> movieComingSoonList = movieComingSoon47Service.movieComingSoonList(movieComingSoon47VO);
		model.addAttribute("movieComingSoonList", movieComingSoonList);
		model.addAttribute("movieComingSoon47VO",movieComingSoon47VO);
		
		return "sample/movie/movieComingSoonList";
	}
	
	  @GetMapping("/syncmovieComingSoonForm") 
	  public String syncmovieComingSoonForm(Model model, MovieComingSoon47VO  movieComingSoon47VO){
			
			  if (!StringUtils.isEmpty( movieComingSoon47VO.getMcsIdx() )){ 
				  MovieComingSoon47VO movieComingSoonSelectOne = movieComingSoon47Service.movieComingSoonSelectOne(movieComingSoon47VO);
			  model.addAttribute("movieComingSoon47VO", movieComingSoonSelectOne); 
			  }
	  return "sample/movie/syncmovieComingSoonForm"; 
	  }
	 
	
	  @PostMapping("/syncmovieComingSoonFormSave") 
	  public String syncAquariumfishInfoFormSave(Model  model, MovieComingSoon47VO  movieComingSoon47VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = movieComingSoon47Service.insertMovieComingSoon(movieComingSoon47VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = movieComingSoon47Service.updateMovieComingSoon(movieComingSoon47VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = movieComingSoon47Service.deleteMovieComingSoon(movieComingSoon47VO);
		  } 
		  return "redirect:movieComingSoonList";
	  }
	 
}
