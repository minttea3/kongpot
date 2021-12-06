package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.OnedayClassLifeStyle58Mapper;
import com.cs.study.sample.vo.OnedayClassLifeStyle58VO;

@Service
public class OnedayClassLifeStyle58Service {
	
	public final OnedayClassLifeStyle58Mapper onedayClassLifeStyle58Mapper;
	public OnedayClassLifeStyle58Service(OnedayClassLifeStyle58Mapper onedayClassLifeStyle58Mapper) {
		this.onedayClassLifeStyle58Mapper = onedayClassLifeStyle58Mapper;
	}
	public OnedayClassLifeStyle58VO onedayClassLifeStyleSelectOne(OnedayClassLifeStyle58VO onedayClassLifeStyle58VO) {
		return onedayClassLifeStyle58Mapper.onedayClassLifeStyleSelectOne(onedayClassLifeStyle58VO);
	}
	public List<OnedayClassLifeStyle58VO> onedayClassLifeStyleList(OnedayClassLifeStyle58VO onedayClassLifeStyle58VO){
		return onedayClassLifeStyle58Mapper.onedayClassLifeStyleList(onedayClassLifeStyle58VO);
	}
	public int insertOnedayClassLifeStyle(OnedayClassLifeStyle58VO onedayClassLifeStyle58VO) {
		// 체크박스 널일때 N처리
		if(onedayClassLifeStyle58VO.getOclsClassStatus() == null) {
			onedayClassLifeStyle58VO.setOclsClassStatus("N");
		}
		return onedayClassLifeStyle58Mapper.insertOnedayClassLifeStyle(onedayClassLifeStyle58VO);
	}
	
	public int saveOnedayClassLifeStyle(OnedayClassLifeStyle58VO onedayClassLifeStyle58VO) {
		// 체크박스 널일때 N처리
		if(onedayClassLifeStyle58VO.getOclsClassStatus() == null) {
			onedayClassLifeStyle58VO.setOclsClassStatus("N");
		}
		return onedayClassLifeStyle58Mapper.saveOnedayClassLifeStyle(onedayClassLifeStyle58VO);
	} 
	
	public int updateOnedayClassLifeStyle(OnedayClassLifeStyle58VO onedayClassLifeStyle58VO) {
		// 체크박스 널일때 N처리
		if(onedayClassLifeStyle58VO.getOclsClassStatus() == null) {
			onedayClassLifeStyle58VO.setOclsClassStatus("N");
		}
		return onedayClassLifeStyle58Mapper.updateOnedayClassLifeStyle(onedayClassLifeStyle58VO);
	} 
	
	public int deleteOnedayClassLifeStyle(OnedayClassLifeStyle58VO onedayClassLifeStyle58VO) {
		return onedayClassLifeStyle58Mapper.deleteOnedayClassLifeStyle(onedayClassLifeStyle58VO);
	} 
}
