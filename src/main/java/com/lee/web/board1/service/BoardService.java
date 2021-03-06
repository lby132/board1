package com.lee.web.board1.service;

import com.lee.web.board1.model.BoardVO;
import com.lee.web.board1.model.Pagination;

import java.util.List;

public interface BoardService {

    public List<BoardVO> getBoardList(Pagination pagination) throws Exception;

    public BoardVO getBoardContent(int bid) throws Exception;

    public int insertBoard(BoardVO boardVO) throws Exception;

    public int updateBoard(BoardVO boardVO) throws Exception;

    public int deleteBoard(int bid) throws Exception;

    public int updateBoard(int bid) throws Exception;

    public int updateViewCnt(int bid) throws Exception;

    public int getBoardListCnt() throws Exception;
}
