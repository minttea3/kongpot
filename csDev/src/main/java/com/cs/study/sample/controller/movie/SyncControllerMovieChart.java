package com.cs.study.sample.controller.movie;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.MovieChart46Service;
import com.cs.study.sample.service.MovieInfo44Service;
import com.cs.study.sample.vo.MovieChart46VO;
import com.cs.study.sample.vo.MovieChart46VO;

@Controller
public class SyncControllerMovieChart {

	
	  private final MovieChart46Service movieChart46Service;
	  
	  public SyncControllerMovieChart(MovieChart46Service movieChart46Service) { 
		  this.movieChart46Service = movieChart46Service;
	  }
	 
	@GetMapping("/movieChartList")
	public String movieChartList(Model model, MovieChart46VO  movieChart46VO) {
		List<MovieChart46VO> movieChartList = movieChart46Service.movieChartList(movieChart46VO);
		model.addAttribute("movieChartList", movieChartList);
		model.addAttribute("movieChart46VO",movieChart46VO);
		
		return "sample/movie/movieChartList";
	}
	
	  @GetMapping("/syncMovieChartForm") 
	  public String syncAquariumfishInfoForm(Model model, MovieChart46VO  movieChart46VO){
			
			  if (!StringUtils.isEmpty( movieChart46VO.getMcIdx() )){ 
				  MovieChart46VO movieChartSelectOne = movieChart46Service.movieChartSelectOne(movieChart46VO);
			  model.addAttribute("movieChart46VO", movieChartSelectOne); 
			  }
	  return "sample/movie/syncMovieChartForm"; 
	  }
	 
	
	  @PostMapping("/syncMovieChartFormSave") 
	  public String syncAquariumfishInfoFormSave(Model  model, MovieChart46VO  movieChart46VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = movieChart46Service.insertMovieChart(movieChart46VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = movieChart46Service.updateMovieChart(movieChart46VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = movieChart46Service.deleteMovieChart(movieChart46VO);
		  } 
		  return "redirect:movieChartList";
	  }
	 
}
