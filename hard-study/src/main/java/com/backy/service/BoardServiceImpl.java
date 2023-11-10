package com.backy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backy.domain.BoardVO;
import com.backy.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

	private final BoardMapper mapper;
	
	@Override
	public List<BoardVO> getAll() {
		log.info("getAll 실행완료");
		return mapper.getAll();
	}

	@Override
	public BoardVO getOne(int uno) {
		log.info("getOne 실행완료");
		return mapper.getOne(uno);
	}

	@Override
	public void update(BoardVO vo) {
		log.info("update 실행완료");
		mapper.update(vo);
	}

	@Override
	public int insert(BoardVO vo) {
		log.info("insert 실행완료");
		return mapper.insert(vo);
	}

	@Override
	public int delete(int uno) {
		log.info("delete 실행완료");
		return mapper.delete(uno);
	}
	
}
