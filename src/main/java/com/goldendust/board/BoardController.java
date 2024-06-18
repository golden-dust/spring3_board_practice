package com.goldendust.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.goldendust.board.dto.Post;
import com.goldendust.board.dto.PostRepository;

@Controller
public class BoardController {
	
	private PostRepository postRepo = new PostRepository();
	
	@RequestMapping(value="/write_completed", method=RequestMethod.GET)
	public String submitOk(@ModelAttribute("post") Post newPost, Model model) {
		
		model.addAttribute("newPost", newPost);
		this.postRepo.addPost(newPost);
		
		return "submitOk";
	}
	
	@RequestMapping(value="/list")
	public String toList(Model model) {
		
		model.addAttribute("postList", this.postRepo.getPostRepository());
		
		return "list";
	}
	
	@RequestMapping(value="/keyword")
	public String keyword() {
		return "keyword";
	}
	
	@RequestMapping(value="/keywordOk")
	public String keywordOk(HttpServletRequest request) {
		
		String keyword = request.getParameter("keyword");

		if(keyword.equals("abc")) {
			return "redirect:keywordGood";
			//return "keywordGood";
		}
		
		return "redirect:keywordBad";
		//return "keywordBad";
	}
	
	@RequestMapping(value="/keywordBad")
	public String keywordBad(Model model) {
		
		model.addAttribute("keyword", "xxx");
		
		return "keywordBad";
	}
	
	@RequestMapping(value="/keywordGood")
	public String keywordGood(Model model) {
		
		model.addAttribute("keyword", "abc");
		
		return "keywordGood"; 
	}
}
