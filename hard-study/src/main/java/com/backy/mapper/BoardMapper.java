package com.backy.mapper;

import java.util.List;

import com.backy.domain.BoardVO;

public interface BoardMapper {
	public List<BoardVO> getAll();
	
	public BoardVO getOne(int uno);
	
	public void update(BoardVO vo);
	
	public int insert(BoardVO vo);
	
	public int delete(int uno);
}
