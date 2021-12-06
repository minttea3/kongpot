package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.OnedayClassTicket56VO;
@Mapper
public interface OnedayClassTicket56Mapper {
	
	public OnedayClassTicket56VO onedayClassTicketSelectOne(OnedayClassTicket56VO onedayClassTicket56VO); 

	public List<OnedayClassTicket56VO> onedayClassTicketList(OnedayClassTicket56VO onedayClassTicket56VO);
	
	public int insertOnedayClassTicket(OnedayClassTicket56VO onedayClassTicket56VO); 
	
	public int saveOnedayClassTicket(OnedayClassTicket56VO onedayClassTicket56VO); 
	
	public int updateOnedayClassTicket(OnedayClassTicket56VO onedayClassTicket56VO); 
	
	public int deleteOnedayClassTicket(OnedayClassTicket56VO onedayClassTicket56VO);
}
