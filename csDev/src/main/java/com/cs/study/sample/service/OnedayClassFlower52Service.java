package com.cs.study.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.study.sample.mapper.OnedayClassFlower52Mapper;
import com.cs.study.sample.vo.OnedayClassFlower52VO;

@Service
public class OnedayClassFlower52Service {
	
	public final OnedayClassFlower52Mapper onedayClassFlower52Mapper;
	public OnedayClassFlower52Service(OnedayClassFlower52Mapper onedayClassFlower52Mapper) {
		this.onedayClassFlower52Mapper = onedayClassFlower52Mapper;
	}
	public OnedayClassFlower52VO onedayClassFlowerSelectOne(OnedayClassFlower52VO onedayClassFlower52VO) {
		return onedayClassFlower52Mapper.onedayClassFlowerSelectOne(onedayClassFlower52VO);
	}
	public List<OnedayClassFlower52VO> onedayClassFlowerList(OnedayClassFlower52VO onedayClassFlower52VO){
		return onedayClassFlower52Mapper.onedayClassFlowerList(onedayClassFlower52VO);
	}
	public int insertOnedayClassFlower(OnedayClassFlower52VO onedayClassFlower52VO) {
		return onedayClassFlower52Mapper.insertOnedayClassFlower(onedayClassFlower52VO);
	}
	
	public int saveOnedayClassFlower(OnedayClassFlower52VO onedayClassFlower52VO) {

		return onedayClassFlower52Mapper.saveOnedayClassFlower(onedayClassFlower52VO);
	} 
	
	public int updateOnedayClassFlower(OnedayClassFlower52VO onedayClassFlower52VO) {
				return onedayClassFlower52Mapper.updateOnedayClassFlower(onedayClassFlower52VO);
	} 
	
	public int deleteOnedayClassFlower(OnedayClassFlower52VO onedayClassFlower52VO) {
		return onedayClassFlower52Mapper.deleteOnedayClassFlower(onedayClassFlower52VO);
	} 
}
