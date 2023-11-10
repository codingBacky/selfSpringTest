package com.backy.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.backy.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testGetAll() {
		mapper.getAll().forEach(board -> log.info(board));
	}
	
	@Test
	public void testGetOne() {
		mapper.getOne(1);
	}
	
	@Test
	public void testUpdate() {
		BoardVO vo = BoardVO.builder()
				.uname("테스트")
				.phone("01088888888")
				.age(10)
				.uno(5)
				.build();
		
		mapper.update(vo);
	}
	
	@Test
	public void testInsert() {
		BoardVO vo = BoardVO.builder()
				.uname("테스트이름22")
				.phone("01044455552")
				.age(10)
				.build();
		mapper.insert(vo);
	}
	
	@Test
	public void testDelete() {
		mapper.delete(5);
	}
}
