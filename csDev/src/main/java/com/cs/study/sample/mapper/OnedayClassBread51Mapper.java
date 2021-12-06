package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.OnedayClassBread51VO;
@Mapper
public interface OnedayClassBread51Mapper {
	
	public OnedayClassBread51VO onedayClassBreadSelectOne(OnedayClassBread51VO onedayClassBread51VO); 

	public List<OnedayClassBread51VO> onedayClassBreadList(OnedayClassBread51VO onedayClassBread51VO);
	
	public int insertOnedayClassBread(OnedayClassBread51VO onedayClassBread51VO); 
	
	public int saveOnedayClassBread(OnedayClassBread51VO onedayClassBread51VO); 
	
	public int updateOnedayClassBread(OnedayClassBread51VO onedayClassBread51VO); 
	
	public int deleteOnedayClassBread(OnedayClassBread51VO onedayClassBread51VO);
}
