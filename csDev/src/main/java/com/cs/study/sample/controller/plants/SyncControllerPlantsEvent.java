package com.cs.study.sample.controller.plants;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.PlantsBlog33Service;
import com.cs.study.sample.service.PlantsBlogger32Service;
import com.cs.study.sample.service.PlantsCare31Service;
import com.cs.study.sample.service.PlantsEvent35Service;
import com.cs.study.sample.service.PlantsInfo30Service;
import com.cs.study.sample.vo.PlantsEvent35VO;
import com.cs.study.sample.vo.PlantsEvent35VO;
import com.cs.study.sample.vo.PlantsEvent35VO;
import com.cs.study.sample.vo.PlantsEvent35VO;
import com.cs.study.sample.vo.PlantsEvent35VO;

@Controller
public class SyncControllerPlantsEvent {

	
	  private final PlantsEvent35Service plantsEvent35Service;
	  
	  public SyncControllerPlantsEvent(PlantsEvent35Service plantsEvent35Service) { 
		  this.plantsEvent35Service = plantsEvent35Service;
	  }
	 
	@GetMapping("/plantsEventList")
	public String bookBestSellerInfoList(Model model, PlantsEvent35VO  plantsEvent35VO) {
		List<PlantsEvent35VO> plantsBloggerList = plantsEvent35Service.plantsEventList(plantsEvent35VO);
		model.addAttribute("plantsBloggerList", plantsBloggerList);
		model.addAttribute("plantsEvent35VO",plantsEvent35VO);
		
		return "sample/plants/plantsEventList";
	}
	
	  @GetMapping("/syncPlantsEventForm") 
	  public String syncBookBestSellerForm(Model model, PlantsEvent35VO  plantsEvent35VO){
			
			  if (!StringUtils.isEmpty( plantsEvent35VO.getPeIdx() )){ 
				  PlantsEvent35VO plantsEventSelectOne = plantsEvent35Service.plantsEventSelectOne(plantsEvent35VO);
			  model.addAttribute("plantsEvent35VO", plantsEventSelectOne); 
			  }
	  return "sample/plants/syncPlantsEventForm"; 
	  }
	 
	
	  @PostMapping("/syncPlantsEventFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, PlantsEvent35VO  plantsEvent35VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = plantsEvent35Service.insertPlantsEvent(plantsEvent35VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = plantsEvent35Service.updatePlantsEvent(plantsEvent35VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = plantsEvent35Service.deletePlantsEvent(plantsEvent35VO);
		  } 
		  return "redirect:plantsEventList";
	  }
	 
}
