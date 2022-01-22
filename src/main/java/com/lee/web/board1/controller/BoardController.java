package com.lee.web.board1.controller;

import com.lee.web.board1.model.BoardVO;
import com.lee.web.board1.model.Pagination;
import com.lee.web.board1.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @RequestMapping(value = "/getBoardList", method = RequestMethod.GET)
    public String getBoardList(Model model
    ,@RequestParam(required = false, defaultValue = "1") int page
    ,@RequestParam(required = false, defaultValue = "1") int range
    ) throws Exception {
        int listCnt = boardService.getBoardListCnt();

        Pagination pagination = new Pagination(page, range, listCnt);

        model.addAttribute("pagination" ,pagination);
        model.addAttribute("boardList", boardService.getBoardList(pagination));
        return "board/boardList";
    }

    @RequestMapping(value = "/contentBoard", method = RequestMethod.GET)
    public String contentBoard(Model model, @RequestParam("bid") int bid) throws Exception {
        model.addAttribute("boardContent", boardService.getBoardContent(bid));
        return "board/boardContent";
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

    @GetMapping("/editForm")
    public String updateBoard(Model model, @RequestParam("bid") int bid) throws Exception {
        model.addAttribute("boardContent", boardService.getBoardContent(bid));
        return "board/boardUpdate";
    }

    @PostMapping("/updateBoard")
    public String updateBoard(@ModelAttribute BoardVO boardVO) throws Exception {
        boardService.updateBoard(boardVO);
        return "redirect:/getBoardList";
    }

    @GetMapping("/deleteBoard")
    public String deleteBoard(@RequestParam int bid) throws Exception {
        boardService.deleteBoard(bid);
        return "redirect:/getBoardList";
    }

}
