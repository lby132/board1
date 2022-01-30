package com.lee.web.board1.menu.service;

import com.lee.web.board1.menu.model.MenuVO;

import java.util.List;

public interface MenuService {

    public List<MenuVO> getMenuList() throws Exception;

    public int saveMenu(MenuVO menuVO) throws Exception;

    public int updateMenu(MenuVO menuVO) throws Exception;

    public int deleteMenu(int code) throws Exception;
}
