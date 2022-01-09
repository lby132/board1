package com.lee.web.board1.controller;

import com.lee.web.board1.model.BoardVO;
import com.lee.web.board1.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
        return "board/boardList";
    }

    @RequestMapping(value = "/contentBoard", method = RequestMethod.GET)
    public String contentBoard(Model model, @RequestParam("bid") int bid) throws Exception {
        model.addAttribute("boardContent", boardService.getBoardContent(bid));
        return "board/boardForm";
    }

    @RequestMapping(value = "/boardForm")
    public String boardForm() throws Exception {
        return "board/boardForm";
    }

    @RequestMapping(value = "/saveBoard", method = RequestMethod.POST)
    public String saveBoard(@ModelAttribute("BoardVO") BoardVO boardVO, RedirectAttributes rttr) throws Exception {
        boardService.insertBoard(boardVO);
        return "redirect:/getBoardList";
    }
}
