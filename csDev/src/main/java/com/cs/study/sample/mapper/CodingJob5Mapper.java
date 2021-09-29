package com.cs.study.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cs.study.sample.vo.CodingInfo3VO;
import com.cs.study.sample.vo.CodingJob5VO;
@Mapper
public interface CodingJob5Mapper {
	
	public CodingJob5VO codingJobSelectOne(CodingJob5VO codingJob5VO); // �Ѱ� ��ȸ

	public List<CodingJob5VO> codingJobList(CodingJob5VO codingJob5VO);// ��ü ��ȸ
	
	public int insertCodingJob(CodingJob5VO codingJob5VO); // ���
	
	public int saveCodingJob(CodingJob5VO codingJob5VO); // ���� �� ���
	
	public int updateCodingJob(CodingJob5VO codingJob5VO); // ����
	
	public int deleteCodingJob(CodingJob5VO codingJob5VO); // ����
}
