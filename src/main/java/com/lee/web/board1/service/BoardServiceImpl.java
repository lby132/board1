package com.lee.web.board1.service;

import com.lee.web.board1.dao.BoardDAO;
import com.lee.web.board1.model.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
