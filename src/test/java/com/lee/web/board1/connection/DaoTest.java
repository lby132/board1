package com.lee.web.board1.connection;

import com.lee.web.board1.dao.BoardDAO;
import com.lee.web.board1.dao.BoardDAOImpl;
import com.lee.web.board1.model.BoardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class DaoTest {

    @Autowired
    private BoardDAO boardDAO;

    private BoardDAOImpl boardDAOImpl;

    @AfterEach
    public void afterEach() {
        boardDAOImpl.clearStore();
    }

    @Test
    public void boardList() throws Exception {
        List<BoardVO> boardList = boardDAO.getBoardList();
        if (boardList.size() > 0) {
           for (BoardVO list : boardList){
               log.info(list + " = BoardList ");
           }
        }else{
            log.info("데이터가 없습니다.");
        }
    }

    @Test
    public void insertBoard() throws Exception {
        BoardVO boardVO = new BoardVO();
        boardVO.setBid(2);
        boardVO.setTitle("2번 게시물 입니다.");
        boardVO.setContent("2번 게시물 입니다.");
        boardVO.setTag("2");
        boardVO.setRegId("quddddd");

        int insert = boardDAO.insertBoard(boardVO);
        if (insert > 0) {
            log.info("데이터 저장 성공");
        }else{
            log.info("데이터 저장 실패");
        }
    }


    @Test
    public void boardContent() throws Exception {

        BoardVO boardContent = boardDAO.getBoardContent(1);

        if (boardContent != null) {
            log.info("글번호" + boardContent.getBid());
            log.info("글제목" + boardContent.getTitle());
            log.info("글태그" + boardContent.getTag());
            log.info("조회수" + boardContent.getViewCnt());
            log.info("작성자" + boardContent.getRegId());
            log.info("작성일" + boardContent.getRegDt());
            log.info("수정일" + boardContent.getEditDt());
        } else {
            log.info("데이터가 없습니다.");
        }
    }

    @Test
    public void updateBoard() throws Exception {
        BoardVO boardVO = new BoardVO();
        int update = boardDAO.updateBoard(1);

        if (update > 0) {
            boardVO.setTitle("2-2번 게시물 입니다.");
            boardVO.setContent("2-2번 게시물 입니다.");
            boardVO.setTag("2-2");
            boardVO.setRegId("qud");
        }else {
            log.info("수정 실패");
        }
    }

    @Test
    public void deleteBoard() throws Exception {
        int delete = boardDAO.deleteBoard(1);

        if (delete > 0) {
            log.info("게시글 삭제 성공");
        } else {
            log.info("게시글 삭제 실패");
        }
    }


}
