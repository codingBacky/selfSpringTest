package com.backy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backy.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/member/*")
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("list", service.getAll());
	}
	
	
	
}
