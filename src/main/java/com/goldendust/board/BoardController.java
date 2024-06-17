package com.goldendust.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goldendust.board.dto.Post;

@Controller
public class BoardController {
	
	@RequestMapping(value="/submitOk")
	public String submitOk(Post newPost, Model model) {
		
		model.addAttribute("newPost", newPost);
		
		return "submitOk";
	}
	
}
