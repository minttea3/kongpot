package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.OnedayClassBread51Mapper;
import com.cs.study.sample.vo.OnedayClassBread51VO;

@Service
public class OnedayClassBread51Service {
	
	public final OnedayClassBread51Mapper onedayClassBread51Mapper;
	public OnedayClassBread51Service(OnedayClassBread51Mapper onedayClassBread51Mapper) {
		this.onedayClassBread51Mapper = onedayClassBread51Mapper;
	}
	public OnedayClassBread51VO onedayClassBreadSelectOne(OnedayClassBread51VO onedayClassBread51VO) {
		return onedayClassBread51Mapper.onedayClassBreadSelectOne(onedayClassBread51VO);
	}
	public List<OnedayClassBread51VO> onedayClassBreadList(OnedayClassBread51VO onedayClassBread51VO){
		return onedayClassBread51Mapper.onedayClassBreadList(onedayClassBread51VO);
	}
	public int insertOnedayClassBread(OnedayClassBread51VO onedayClassBread51VO) {
		String ocbClassStatus = onedayClassBread51VO.getOcbClassStatus();
		if(ocbClassStatus == null) {
			onedayClassBread51VO.setOcbClassStatus("N");
		}
		return onedayClassBread51Mapper.insertOnedayClassBread(onedayClassBread51VO);
	}
	
	public int saveOnedayClassBread(OnedayClassBread51VO onedayClassBread51VO) {
		String ocbClassStatus = onedayClassBread51VO.getOcbClassStatus();
		if(ocbClassStatus == null) {
			onedayClassBread51VO.setOcbClassStatus("N");
		}
		return onedayClassBread51Mapper.saveOnedayClassBread(onedayClassBread51VO);
	} 
	
	public int updateOnedayClassBread(OnedayClassBread51VO onedayClassBread51VO) {
		String ocbClassStatus = onedayClassBread51VO.getOcbClassStatus();
		if(ocbClassStatus == null) {
			onedayClassBread51VO.setOcbClassStatus("N");
		}
		return onedayClassBread51Mapper.updateOnedayClassBread(onedayClassBread51VO);
	} 
	
	public int deleteOnedayClassBread(OnedayClassBread51VO onedayClassBread51VO) {
		return onedayClassBread51Mapper.deleteOnedayClassBread(onedayClassBread51VO);
	} 
}
