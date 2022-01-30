package com.lee.web.board1.menu.dao;

import com.lee.web.board1.menu.model.MenuVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MenuDAOImpl implements MenuDAO {

    @Autowired
    public SqlSession sqlSession;

    public MenuDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<MenuVO> getMenuList() throws Exception {
        return sqlSession.selectList("com.lee.web.menu.MenuMapper.getMenuList");
    }

    @Override
    public int saveMenu(MenuVO menuVO) throws Exception {
        return sqlSession.insert("com.lee.web.menu.MenuMapper.insertMenu", menuVO);
    }

    @Override
    public int updateMenu(MenuVO menuVO) throws Exception {
        return sqlSession.update("com.lee.web.menu.MenuMapper.updateMenu",menuVO);
    }

    @Override
    public int deleteMenu(int code) throws Exception {
        return sqlSession.delete("com.lee.web.menu.MenuMapper.deleteMenu", code);
    }
}
