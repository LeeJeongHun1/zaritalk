package kr.co.communityJh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.communityJh.service.BoardService;
import kr.co.communityJh.vo.Board;

/**
 * @author "jhlee"
 * 커뮤니티 게시판 컨트롤러 
 */
@Controller
@RequestMapping("/boards")
public class BoardController {

	@Autowired
	BoardService service;
	
	/**
	 * @return 게시판 list page
	 * db에 조회된 모든 게시글을 보여준다. 추후 페이징, auth 설정 필요
	 */
	@GetMapping()
	public String boards(Model model) {
		model.addAttribute("boards", service.findAll());
		return "board/list";
		
	}
	
	@GetMapping("/write")
	public String write(Model model) {
		model.addAttribute("board", new Board());
		return "board/write";
		
	}
	
	/**
	 * @param board
	 * @return
	 */
	@PostMapping("/write")
	public String write(@ModelAttribute Board board) {
		System.out.println(board);
		service.save(board);
		return "redirect:/boards/write";
		
	}
	
}