package com.lee.web.board1.dao;

import com.lee.web.board1.model.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BoardDAOImpl implements BoardDAO{

    private SqlSession sqlSession;

    private static Map<Long, BoardVO> store = new HashMap<>();

    public BoardDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<BoardVO> getBoardList() throws Exception {
        return sqlSession.selectList("com.lee.web.board1.BoardMapper.getBoardList");
    }

    @Override
    public BoardVO getBoardContent(int bid) throws Exception {
        updateViewCnt(bid);
        return sqlSession.selectOne("com.lee.web.board1.BoardMapper.getBoardContent", bid);
    }

    @Override
    public int insertBoard(BoardVO boardVO) throws Exception {
        return sqlSession.insert("com.lee.web.board1.BoardMapper.insertBoard", boardVO);
    }

    @Override
    public int updateBoard(BoardVO boardVO) throws Exception {
        return sqlSession.update("com.lee.web.board1.BoardMapper.updateBoard", boardVO);
    }

    @Override
    public int deleteBoard(int bid) throws Exception {
        return sqlSession.delete("com.lee.web.board1.BoardMapper.deleteBoard", bid);
    }

    @Override
    public int updateBoard(int bid) throws Exception {
        return sqlSession.update("com.lee.web.board1.BoardMapper.updateViewCnt", bid);
    }

    @Override
    public int updateViewCnt(int bid) throws Exception {
        return sqlSession.update("com.lee.web.board1.BoardMapper.updateViewCnt", bid);
    }


}
