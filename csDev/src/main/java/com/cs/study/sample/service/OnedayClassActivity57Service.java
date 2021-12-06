package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.OnedayClassActivity57Mapper;
import com.cs.study.sample.vo.OnedayClassActivity57VO;

@Service
public class OnedayClassActivity57Service {
	
	public final OnedayClassActivity57Mapper onedayClassActivity57Mapper;
	public OnedayClassActivity57Service(OnedayClassActivity57Mapper onedayClassActivity57Mapper) {
		this.onedayClassActivity57Mapper = onedayClassActivity57Mapper;
	}
	public OnedayClassActivity57VO onedayClassActivitySelectOne(OnedayClassActivity57VO onedayClassActivity57VO) {
		return onedayClassActivity57Mapper.onedayClassActivitySelectOne(onedayClassActivity57VO);
	}
	public List<OnedayClassActivity57VO> onedayClassActivityList(OnedayClassActivity57VO onedayClassActivity57VO){
		return onedayClassActivity57Mapper.onedayClassActivityList(onedayClassActivity57VO);
	}
	public int insertOnedayClassActivity(OnedayClassActivity57VO onedayClassActivity57VO) {
		// 체크박스 널일때 N처리
		if(onedayClassActivity57VO.getOcacClassStatus() == null) {
			onedayClassActivity57VO.setOcacClassStatus("N");
		}
		return onedayClassActivity57Mapper.insertOnedayClassActivity(onedayClassActivity57VO);
	}
	
	public int saveOnedayClassActivity(OnedayClassActivity57VO onedayClassActivity57VO) {
		// 체크박스 널일때 N처리
				if(onedayClassActivity57VO.getOcacClassStatus() == null) {
					onedayClassActivity57VO.setOcacClassStatus("N");
				}
		return onedayClassActivity57Mapper.saveOnedayClassActivity(onedayClassActivity57VO);
	} 
	
	public int updateOnedayClassActivity(OnedayClassActivity57VO onedayClassActivity57VO) {
		// 체크박스 널일때 N처리
				if(onedayClassActivity57VO.getOcacClassStatus() == null) {
					onedayClassActivity57VO.setOcacClassStatus("N");
				}
		return onedayClassActivity57Mapper.updateOnedayClassActivity(onedayClassActivity57VO);
	} 
	
	public int deleteOnedayClassActivity(OnedayClassActivity57VO onedayClassActivity57VO) {
		return onedayClassActivity57Mapper.deleteOnedayClassActivity(onedayClassActivity57VO);
	} 
}
