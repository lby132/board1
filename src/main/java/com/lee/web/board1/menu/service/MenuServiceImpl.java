package com.lee.web.board1.menu.service;

import com.lee.web.board1.menu.dao.MenuDAO;
import com.lee.web.board1.menu.dao.MenuDAOImpl;
import com.lee.web.board1.menu.model.MenuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDAO menuDAO;

    public MenuServiceImpl(MenuDAO menuDAO) {
        this.menuDAO = menuDAO;
    }

    @Override
    public List<MenuVO> getMenuList() throws Exception {
        return menuDAO.getMenuList();
    }

    @Override
    public int saveMenu(MenuVO menuVO) throws Exception {
        return menuDAO.saveMenu(menuVO);
    }

    @Override
    public int updateMenu(MenuVO menuVO) throws Exception {
        return menuDAO.updateMenu(menuVO);
    }

    @Override
    public int deleteMenu(int code) throws Exception {
        return menuDAO.deleteMenu(code);
    }
}
