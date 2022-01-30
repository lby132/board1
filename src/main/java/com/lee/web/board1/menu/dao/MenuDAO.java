package com.lee.web.board1.menu.dao;

import com.lee.web.board1.menu.model.MenuVO;

import java.util.List;

public interface MenuDAO {

    public List<MenuVO> getMenuList() throws Exception;

    public int saveMenu(MenuVO menuVO) throws Exception;

    public int updateMenu(MenuVO menuVO) throws Exception;

    public int deleteMenu(int code) throws Exception;
}
