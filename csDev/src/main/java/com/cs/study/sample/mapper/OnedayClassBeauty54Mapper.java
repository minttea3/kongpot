package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.OnedayClassBeauty54VO;
@Mapper
public interface OnedayClassBeauty54Mapper {
	
	public OnedayClassBeauty54VO onedayClassBeautySelectOne(OnedayClassBeauty54VO onedayClassBeauty54VO); 

	public List<OnedayClassBeauty54VO> onedayClassBeautyList(OnedayClassBeauty54VO onedayClassBeauty54VO);
	
	public int insertOnedayClassBeauty(OnedayClassBeauty54VO onedayClassBeauty54VO); 
	
	public int saveOnedayClassBeauty(OnedayClassBeauty54VO onedayClassBeauty54VO); 
	
	public int updateOnedayClassBeauty(OnedayClassBeauty54VO onedayClassBeauty54VO); 
	
	public int deleteOnedayClassBeauty(OnedayClassBeauty54VO onedayClassBeauty54VO);
}
