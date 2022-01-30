package com.lee.web.board1.menu.controller;

import com.lee.web.board1.menu.model.MenuVO;
import com.lee.web.board1.menu.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/menu")
public class MenuController {

    @GetMapping("/getMenuList")
    public String getMenuList(Model model) throws Exception {
        model.addAttribute("menuVO", new MenuVO());
        return "menu/menu";
    }
}
