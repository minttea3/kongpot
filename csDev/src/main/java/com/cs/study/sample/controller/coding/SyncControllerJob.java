package com.cs.study.sample.controller.coding;

import com.cs.study.sample.service.CodingJob5Service;
import com.cs.study.sample.service.CodingQnA2Service;
import com.cs.study.sample.service.SampleService;
import com.cs.study.sample.vo.CodingJob5VO;
import com.cs.study.sample.vo.CodingQnA2VO;
import com.cs.study.sample.vo.SampleVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SyncControllerJob {

	
	  private final CodingJob5Service codingJob5Service;
	  
	  public SyncControllerJob(CodingJob5Service codingJob5Service) { 
		  this.codingJob5Service = codingJob5Service;
	  }
	 
	@GetMapping("/codingJobList")
	public String codingJobList(Model model, CodingJob5VO codingJob5VO) {
		List<CodingJob5VO> selectCodingJobList = codingJob5Service.codingJobList(codingJob5VO);
		model.addAttribute("selectCodingJobList",selectCodingJobList);
		 model.addAttribute("codingJob5VO",codingJob5VO);
		
		return "sample/coding/codingJobList";
	}
	
	  @GetMapping("/syncCodingJobForm") 
	  public String syncCodingJobForm(Model model, CodingJob5VO codingJob5VO){
			
			  if (!StringUtils.isEmpty( codingJob5VO.getCjIdx() )){ 
				  CodingJob5VO codingQuaSelectOne = codingJob5Service.codingJobSelectOne(codingJob5VO);
			  model.addAttribute("codingJob5VO", codingQuaSelectOne); }
	  return "sample/coding/syncCodingJobForm"; 
	  }
	 
	
	  @PostMapping("syncCodingJobFormSave") 
	  public String syncCodingJobFormSave(Model  model, CodingJob5VO codingJob5VO, @RequestParam(value="action", required=true) String action){ 
		  if ( "insert".equals(action) ){ 
			  int insertCnt = codingJob5Service.insertCodingJob(codingJob5VO);
			  
		  }else if ( "update".equals(action) ){
			  int updateCnt = codingJob5Service.updateCodingJob(codingJob5VO);
		  }else if (
			  "delete".equals(action) ){ 
			  int deleteCnt = codingJob5Service.deleteCodingJob(codingJob5VO);
		  } 
		  return "redirect:codingJobList";
	  }
	 
}
