package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.AquariumfishExpoGuestbook40VO;
@Mapper
public interface AquariumfishExpoGuestbook40Mapper {
	
	public AquariumfishExpoGuestbook40VO aquariumfishExpoGuestbookSelectOne(AquariumfishExpoGuestbook40VO aquariumfishExpoGuestbook40VO); 

	public List<AquariumfishExpoGuestbook40VO> aquariumfishExpoGuestbookList(AquariumfishExpoGuestbook40VO aquariumfishExpoGuestbook40VO);
	
	public int insertAquariumfishExpo(AquariumfishExpoGuestbook40VO aquariumfishExpoGuestbook40VO); 
	
	public int saveAquariumfishExpoGuestbook(AquariumfishExpoGuestbook40VO aquariumfishExpoGuestbook40VO); 
	
	public int updateAquariumfishExpoGuestbook(AquariumfishExpoGuestbook40VO aquariumfishExpoGuestbook40VO); 
	
	public int deleteAquariumfishExpoGuestbook(AquariumfishExpoGuestbook40VO aquariumfishExpoGuestbook40VO);
}
