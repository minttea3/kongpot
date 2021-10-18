package com.cs.study.sample.controller.plants;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.study.sample.service.PlantsInfo30Service;
import com.cs.study.sample.vo.PlantsInfo30VO;

@Controller
public class SyncControllerPlantsInfo {

	
	  private final PlantsInfo30Service plantsInfo30Service;
	  
	  public SyncControllerPlantsInfo(PlantsInfo30Service plantsInfo30Service) { 
		  this.plantsInfo30Service = plantsInfo30Service;
	  }
	 
	@GetMapping("/plantsInfoList")
	public String bookBestSellerInfoList(Model model, PlantsInfo30VO  plantsInfo30VO) {
		List<PlantsInfo30VO> plantsInfoList = plantsInfo30Service.plantsInfoList(plantsInfo30VO);
		model.addAttribute("plantsInfoList", plantsInfoList);
		model.addAttribute("plantsInfo30VO",plantsInfo30VO);
		
		return "sample/plants/plantsInfoList";
	}
	
	  @GetMapping("/syncPlantsInfoForm") 
	  public String syncBookBestSellerForm(Model model, PlantsInfo30VO  plantsInfo30VO){
			
			  if (!StringUtils.isEmpty( plantsInfo30VO.getPiIdx() )){ 
				  PlantsInfo30VO plantsInfoSelectOne = plantsInfo30Service.plantsInfoSelectOne(plantsInfo30VO);
			  model.addAttribute("plantsInfo30VO", plantsInfoSelectOne); 
			  }
	  return "sample/plants/syncPlantsInfoForm"; 
	  }
	 
	
	  @PostMapping("/syncPlantsInfoFormSave") 
	  public String syncBookBestsellerFormSave(Model  model, PlantsInfo30VO  plantsInfo30VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = plantsInfo30Service.insertPlantsInfo(plantsInfo30VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = plantsInfo30Service.updatePlantsInfo(plantsInfo30VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = plantsInfo30Service.deletePlantsInfo(plantsInfo30VO);
		  } 
		  return "redirect:plantsInfoList";
	  }
	 
}
