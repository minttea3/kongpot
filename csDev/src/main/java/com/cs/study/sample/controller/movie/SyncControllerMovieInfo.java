package com.cs.study.sample.controller.movie;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.MovieInfo44Service;
import com.cs.study.sample.vo.MovieInfo44VO;

@Controller
public class SyncControllerMovieInfo {

	
	  private final MovieInfo44Service movieInfo44Service;
	  
	  public SyncControllerMovieInfo(MovieInfo44Service movieInfo44Service) { 
		  this.movieInfo44Service = movieInfo44Service;
	  }
	 
	@GetMapping("/movieInfoList")
	public String movieInfoList(Model model, MovieInfo44VO  movieInfo44VO) {
		List<MovieInfo44VO> movieInfoList = movieInfo44Service.movieInfoList(movieInfo44VO);
		model.addAttribute("movieInfoList", movieInfoList);
		model.addAttribute("movieInfo44VO",movieInfo44VO);
		
		return "sample/movie/movieInfoList";
	}
	
	  @GetMapping("/syncMovieInfoForm") 
	  public String syncAquariumfishInfoForm(Model model, MovieInfo44VO  movieInfo44VO){
			
			  if (!StringUtils.isEmpty( movieInfo44VO.getMiIdx() )){ 
				  MovieInfo44VO movieInfoSelectOne = movieInfo44Service.movieInfoSelectOne(movieInfo44VO);
			  model.addAttribute("movieInfo44VO", movieInfoSelectOne); 
			  }
	  return "sample/movie/syncMovieInfoForm"; 
	  }
	 
	
	  @PostMapping("/syncMovieInfoFormSave") 
	  public String syncAquariumfishInfoFormSave(Model  model, MovieInfo44VO  movieInfo44VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = movieInfo44Service.insertMovieInfo(movieInfo44VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = movieInfo44Service.updateMovieInfo(movieInfo44VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = movieInfo44Service.deleteMovieInfo(movieInfo44VO);
		  } 
		  return "redirect:movieInfoList";
	  }
	 
}
