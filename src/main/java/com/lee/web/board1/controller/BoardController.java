package com.lee.web.board1.controller;

import com.lee.web.board1.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @RequestMapping(value = "/getBoardList", method = RequestMethod.GET)
    public String getBoardList(Model model) throws Exception {
        model.addAttribute("boardList", boardService.getBoardList());
        return "boardList";
    }

}
