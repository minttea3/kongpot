package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.OnedayClassActivity57VO;
@Mapper
public interface OnedayClassActivity57Mapper {
	
	public OnedayClassActivity57VO onedayClassActivitySelectOne(OnedayClassActivity57VO onedayClassActivity57VO); 

	public List<OnedayClassActivity57VO> onedayClassActivityList(OnedayClassActivity57VO onedayClassActivity57VO);
	
	public int insertOnedayClassActivity(OnedayClassActivity57VO onedayClassActivity57VO); 
	
	public int saveOnedayClassActivity(OnedayClassActivity57VO onedayClassActivity57VO); 
	
	public int updateOnedayClassActivity(OnedayClassActivity57VO onedayClassActivity57VO); 
	
	public int deleteOnedayClassActivity(OnedayClassActivity57VO onedayClassActivity57VO);
}
