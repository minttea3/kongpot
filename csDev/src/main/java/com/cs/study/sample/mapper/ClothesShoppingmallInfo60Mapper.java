package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.ClothesShoppingmallinfo60VO;
@Mapper
public interface ClothesShoppingmallInfo60Mapper {
	
	public ClothesShoppingmallinfo60VO clothesShoppingmallinfoSelectOne(ClothesShoppingmallinfo60VO clothesShoppingmallinfo60VO); 

	public List<ClothesShoppingmallinfo60VO> clothesShoppingmallinfoList(ClothesShoppingmallinfo60VO clothesShoppingmallinfo60VO);
	
	public int insertClothesShoppingmallinfo(ClothesShoppingmallinfo60VO clothesShoppingmallinfo60VO); 
	
	public int saveClothesShoppingmallinfo(ClothesShoppingmallinfo60VO clothesShoppingmallinfo60VO); 
	
	public int updateClothesShoppingmallinfo(ClothesShoppingmallinfo60VO clothesShoppingmallinfo60VO); 
	
	public int deleteClothesShoppingmallinfo(ClothesShoppingmallinfo60VO clothesShoppingmallinfo60VO);
}
