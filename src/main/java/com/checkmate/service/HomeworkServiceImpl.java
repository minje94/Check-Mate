package com.checkmate.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.checkmate.dao.HomeworkDAO;
import com.checkmate.vo.GroupVO;
import com.checkmate.vo.HomeworkVO;

@Service
public class HomeworkServiceImpl implements HomeworkService {

	@Inject
	private HomeworkDAO dao;
	
	@Override
	public List<HomeworkVO> homeworkListMini(GroupVO groupVO) throws Exception {
		return dao.homeworkListMini(groupVO);
	}

	@Override
	public int homeworkListCount(GroupVO groupVO) throws Exception {
		return dao.homeworkListCount(groupVO);
	}

	@Override
	public void write(HomeworkVO homeworkVO) throws Exception {
		dao.write(homeworkVO);
	}

	@Override
	public List<HomeworkVO> homeworkPossibleIdList(GroupVO groupVO) throws Exception {
		return dao.homeworkPossibleIdList(groupVO);
	}

	@Override
	public HomeworkVO hwFindVo(HomeworkVO homeworkVO) throws Exception {
		return dao.hwFindVo(homeworkVO);
	}

	@Override
	public List<HomeworkVO> hwFindList(HomeworkVO homeworkVO) throws Exception {
		return dao.hwFindList(homeworkVO);
	}

	@Override
	public List<HomeworkVO> hwImpossibleIdList(GroupVO groupVO) throws Exception {
		return dao.hwImpossibleIdList(groupVO);
	}

}