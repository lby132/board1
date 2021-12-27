package com.lee.web.board1.connection;

import com.lee.web.board1.dao.BoardDAO;
import com.lee.web.board1.model.BoardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SpringBootTest
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
public class DaoTest {

    @Autowired
    private BoardDAO boardDAO;

    @Test
    public void daoTest() throws Exception {
        List<BoardVO> boardList = boardDAO.getBoardList();
        if (boardList.size() > 0) {
           for (BoardVO list : boardList){
               log.info(list + " = BoardList ");
           }
        }else{
            log.info("데이터가 없습니다.");
        }
    }


}
