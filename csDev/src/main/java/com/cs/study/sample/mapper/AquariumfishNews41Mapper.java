package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.AquariumfishNews41VO;
@Mapper
public interface AquariumfishNews41Mapper {
	
	public AquariumfishNews41VO aquariumfishNewsSelectOne(AquariumfishNews41VO aquariumfishNews41VO); 

	public List<AquariumfishNews41VO> aquariumfishNewsList(AquariumfishNews41VO aquariumfishNews41VO);
	
	public int insertAquariumfishNews(AquariumfishNews41VO aquariumfishNews41VO); 
	
	public int saveAquariumfishNews(AquariumfishNews41VO aquariumfishNews41VO); 
	
	public int updateAquariumfishNews(AquariumfishNews41VO aquariumfishNews41VO); 
	
	public int deleteAquariumfishNews(AquariumfishNews41VO aquariumfishNews41VO);
}
