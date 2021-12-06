package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.OnedayClassMember50VO;
@Mapper
public interface OnedayClassMember50Mapper {
	
	public OnedayClassMember50VO onedayClassMemberSelectOne(OnedayClassMember50VO onedayClassMember50VO); 

	public List<OnedayClassMember50VO> onedayClassMemberList(OnedayClassMember50VO onedayClassMember50VO);
	
	public int insertOnedayClassMember(OnedayClassMember50VO onedayClassMember50VO); 
	
	public int saveOnedayClassMember(OnedayClassMember50VO onedayClassMember50VO); 
	
	public int updateOnedayClassMember(OnedayClassMember50VO onedayClassMember50VO); 
	
	public int deleteOnedayClassMember(OnedayClassMember50VO onedayClassMember50VO);
}
