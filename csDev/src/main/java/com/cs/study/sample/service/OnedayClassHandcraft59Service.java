package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.OnedayClassHandcraft59Mapper;
import com.cs.study.sample.vo.OnedayClassHandcraft59VO;

@Service
public class OnedayClassHandcraft59Service {
	
	public final OnedayClassHandcraft59Mapper onedayClassHandcraft59Mapper;
	public OnedayClassHandcraft59Service(OnedayClassHandcraft59Mapper onedayClassHandcraft59Mapper) {
		this.onedayClassHandcraft59Mapper = onedayClassHandcraft59Mapper;
	}
	public OnedayClassHandcraft59VO onedayClassHandcraftSelectOne(OnedayClassHandcraft59VO onedayClassHandcraft59VO) {
		return onedayClassHandcraft59Mapper.onedayClassHandcraftSelectOne(onedayClassHandcraft59VO);
	}
	public List<OnedayClassHandcraft59VO> onedayClassHandcraftList(OnedayClassHandcraft59VO onedayClassHandcraft59VO){
		return onedayClassHandcraft59Mapper.onedayClassHandcraftList(onedayClassHandcraft59VO);
	}
	public int insertOnedayClassHandcraft(OnedayClassHandcraft59VO onedayClassHandcraft59VO) {
		// 체크박스 널일때 N처리
		if(onedayClassHandcraft59VO.getOchClassStatus() == null) {
			onedayClassHandcraft59VO.setOchClassStatus("N");
		}
		return onedayClassHandcraft59Mapper.insertOnedayClassHandcraft(onedayClassHandcraft59VO);
	}
	
	public int saveOnedayClassHandcraft(OnedayClassHandcraft59VO onedayClassHandcraft59VO) {
		// 체크박스 널일때 N처리
		if(onedayClassHandcraft59VO.getOchClassStatus() == null) {
			onedayClassHandcraft59VO.setOchClassStatus("N");
		}
		return onedayClassHandcraft59Mapper.saveOnedayClassHandcraft(onedayClassHandcraft59VO);
	} 
	
	public int updateOnedayClassHandcraft(OnedayClassHandcraft59VO onedayClassHandcraft59VO) {
		// 체크박스 널일때 N처리
		if(onedayClassHandcraft59VO.getOchClassStatus() == null) {
			onedayClassHandcraft59VO.setOchClassStatus("N");
		}
		return onedayClassHandcraft59Mapper.updateOnedayClassHandcraft(onedayClassHandcraft59VO);
	} 
	
	public int deleteOnedayClassHandcraft(OnedayClassHandcraft59VO onedayClassHandcraft59VO) {
		return onedayClassHandcraft59Mapper.deleteOnedayClassHandcraft(onedayClassHandcraft59VO);
	} 
}
