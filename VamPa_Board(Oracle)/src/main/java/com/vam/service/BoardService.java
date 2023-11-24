package com.vam.service;

import java.util.List;

import com.vam.model.BoardVO;

public interface BoardService {
	public void enroll(BoardVO board);
	
	 /* 게시판 목록 */
    public List<BoardVO> getList();
}
