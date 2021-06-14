package com.itbank.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.itbank.service.GuestBookService;

@Controller
public class HomeController {
	@Autowired
	private GuestBookService gs;
	
	@GetMapping(value = "/select", produces = "application/text; charset=utf-8")
	@ResponseBody
	public String selectAll() throws JsonProcessingException {
		return gs.selectAll();
	}
	
//	@GetMapping("/select")
//	public String selectAll(HttpServletResponse response) throws JsonProcessingException, IOException {
//		PrintWriter out = response.getWriter();
//		return "home";
//	}
	
	@PostMapping(value = "/insert", produces = "application/json; charset=utf-8")
	@ResponseBody
	public int insert(@RequestBody Map<String, String> map) {
		return gs.insert(map);
	}
}
