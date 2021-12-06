package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.OnedayClassHandcraft59VO;
@Mapper
public interface OnedayClassHandcraft59Mapper {
	
	public OnedayClassHandcraft59VO onedayClassHandcraftSelectOne(OnedayClassHandcraft59VO onedayClassHandcraft59VO); 

	public List<OnedayClassHandcraft59VO> onedayClassHandcraftList(OnedayClassHandcraft59VO onedayClassHandcraft59VO);
	
	public int insertOnedayClassHandcraft(OnedayClassHandcraft59VO onedayClassHandcraft59VO); 
	
	public int saveOnedayClassHandcraft(OnedayClassHandcraft59VO onedayClassHandcraft59VO); 
	
	public int updateOnedayClassHandcraft(OnedayClassHandcraft59VO onedayClassHandcraft59VO); 
	
	public int deleteOnedayClassHandcraft(OnedayClassHandcraft59VO onedayClassHandcraft59VO);
}
