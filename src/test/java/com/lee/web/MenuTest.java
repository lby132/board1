package com.lee.web;

import com.lee.web.board1.menu.dao.MenuDAO;
import com.lee.web.board1.menu.dao.MenuDAOImpl;
import com.lee.web.board1.menu.model.MenuVO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MenuTest {

    @Autowired
    private MenuDAOImpl menuDAO;

    @Test
    void getMenuList() throws Exception {
        List<MenuVO> menuList = menuDAO.getMenuList();

        assertThat(menuList.size()).isEqualTo(1);
    }
}
