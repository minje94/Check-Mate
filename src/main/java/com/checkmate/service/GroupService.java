package com.checkmate.service;

import java.util.List;

import com.checkmate.vo.GroupPointVO;
import com.checkmate.vo.GroupVO;

public interface GroupService {

	public void GroupCreate(GroupVO groupVO) throws Exception;
	
	public List<GroupVO> GroupList(GroupVO groupVO) throws Exception;	
	
	public int GroupListCount(GroupVO groupVO) throws Exception;
	
	// 원하는 그룹의 관리자 찾기
	public GroupVO findMaster (GroupVO groupVO) throws Exception;
	
	// 유저 포인트 넣기
	public void userPoint(GroupPointVO groupPointVO) throws Exception;
}
