package com.lee.web.board1.service;

import com.lee.web.board1.dao.BoardDAO;
import com.lee.web.board1.model.BoardVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardDAO boardDAO;

    public BoardServiceImpl(BoardDAO boardDAO) {
        this.boardDAO = boardDAO;
    }

    @Override
    public List<BoardVO> getBoardList() throws Exception {
        return boardDAO.getBoardList();
    }

    @Override
    public BoardVO getBoardContent(int bid) throws Exception {
        boardDAO.updateViewCnt(bid);
        return boardDAO.getBoardContent(bid);
    }

    @Override
    public int insertBoard(BoardVO boardVO) throws Exception {
        return boardDAO.insertBoard(boardVO);
    }

    @Override
    public int updateBoard(BoardVO boardVO) throws Exception {
        return boardDAO.updateBoard(boardVO);
    }

    @Override
    public int deleteBoard(int bid) throws Exception {
        return boardDAO.deleteBoard(bid);
    }

    @Override
    public int updateBoard(int bid) throws Exception {
        return boardDAO.updateBoard(bid);
    }

    @Override
    public int updateViewCnt(int bid) throws Exception {
        return boardDAO.updateViewCnt(bid);
    }
}
