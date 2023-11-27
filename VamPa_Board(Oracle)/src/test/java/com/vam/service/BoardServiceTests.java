package com.vam.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTests {
	private static final Logger log = LoggerFactory.getLogger(BoardServiceTests.class);

	@Autowired
	private BoardService service;

	/*
	 * 게시판 조회
	 * 
	 * @Test public void testGETPage() {
	 * 
	 * int bno = 50;
	 * 
	 * log.info("" + service.getPage(bno));
	 * 
	 * }
	 */

    /* 게시판 수정 */
     @Test
     public void testModify() {
         
         BoardVO board = new BoardVO();
         board.setBno(50);
         board.setTitle("수정 제목");
         board.setContent("수정 내용");
         
         int result = service.modify(board);
         log.info("result : " +result);
         
     }     
}