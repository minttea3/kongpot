package com.cs.study.sample.controller.plants;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.PlantsNews34Service;
import com.cs.study.sample.vo.PlantsNews34VO;

@Controller
public class SyncControllerPlantsNews {

	
	  private final PlantsNews34Service plantsNews34Service;
	  
	  public SyncControllerPlantsNews(PlantsNews34Service plantsNews34Service) { 
		  this.plantsNews34Service = plantsNews34Service;
	  }
	 
	@GetMapping("/plantsNewsList")
	public String bookBestSellerInfoList(Model model, PlantsNews34VO  plantsNews34VO) {
		List<PlantsNews34VO> plantsNewsList = plantsNews34Service.plantsNewsList(plantsNews34VO);
		model.addAttribute("plantsNewsList", plantsNewsList);
		model.addAttribute("plantsNews34VO",plantsNews34VO);
		
		return "sample/plants/plantsNewsList";
	}
	
	  @GetMapping("/syncPlantsNewsForm") 
	  public String syncBookBestSellerForm(Model model, PlantsNews34VO  plantsNews34VO){
			
			  if (!StringUtils.isEmpty( plantsNews34VO.getPnIdx() )){ 
				  PlantsNews34VO plantsNewsSelectOne = plantsNews34Service.plantsNewsSelectOne(plantsNews34VO);
			  model.addAttribute("plantsNews34VO", plantsNewsSelectOne); 
			  }
	  return "sample/plants/syncPlantsNewsForm"; 
	  }
	 
	
	  @PostMapping("/syncPlantsNewsFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, PlantsNews34VO  plantsNews34VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = plantsNews34Service.insertPlantsNews(plantsNews34VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = plantsNews34Service.updatePlantsNews(plantsNews34VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = plantsNews34Service.deletePlantsNews(plantsNews34VO);
		  } 
		  return "redirect:plantsNewsList";
	  }
	 
}
