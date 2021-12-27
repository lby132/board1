package com.lee.web.board1.dao;

import com.lee.web.board1.model.BoardVO;

import java.util.List;

public interface BoardDAO {

    public List<BoardVO> getBoardList() throws Exception;

    public BoardVO getBoardContent(int bid) throws Exception;

    public int insertBoard(BoardVO boardVO) throws Exception;

    public int updateBoard(BoardVO boardVO) throws Exception;

    public int deleteBoard(int bid) throws Exception;

    public int updateBoard(int bid) throws Exception;

}
