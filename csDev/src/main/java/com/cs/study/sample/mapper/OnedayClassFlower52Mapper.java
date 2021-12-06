package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.OnedayClassFlower52VO;
@Mapper
public interface OnedayClassFlower52Mapper {
	
	public OnedayClassFlower52VO onedayClassFlowerSelectOne(OnedayClassFlower52VO onedayClassFlower52VO); 

	public List<OnedayClassFlower52VO> onedayClassFlowerList(OnedayClassFlower52VO onedayClassFlower52VO);
	
	public int insertOnedayClassFlower(OnedayClassFlower52VO onedayClassFlower52VO); 
	
	public int saveOnedayClassFlower(OnedayClassFlower52VO onedayClassFlower52VO); 
	
	public int updateOnedayClassFlower(OnedayClassFlower52VO onedayClassFlower52VO); 
	
	public int deleteOnedayClassFlower(OnedayClassFlower52VO onedayClassFlower52VO);
}
