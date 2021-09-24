package com.itbank.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.MemberDAO;
import com.itbank.model.MemberDTO;


@Controller
public class HomeController {
	@Autowired
	private MemberDAO memberDAO;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("userList")
	public ModelAndView userList(ModelAndView mav) {
		List<MemberDTO> list = memberDAO.selectUsers();
		mav.addObject("list", list);
		return mav;
	}
	
	@GetMapping("login")
	public String login() {
		return "login";
	}
	
	@PostMapping("login") 
	public String login(String userId, String userPw, HttpServletRequest request) throws EmptyResultDataAccessException {
		HttpSession session = request.getSession();
		
		MemberDTO dto = memberDAO.login(userId, userPw);
		
		if(dto != null) {
			session.setAttribute("user", dto);
			return "redirect:/";
		}
		else return "/login";
	}
	
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public String loginFail(HttpServletRequest request) {
		request.setAttribute("loginFailMsg", "로그인 실패..");
		return "/login";
	}
	
	
	@GetMapping("logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("modify")
	public String modify() {
		return "modify";
	}
	
	@PostMapping("modify")
	public ModelAndView modify(MemberDTO dto, ModelAndView mav, HttpServletRequest request) {
		boolean isUpdate = memberDAO.modify(dto);
		HttpSession session = request.getSession();
		session.invalidate();
		mav.setViewName("modify");
		
		if(isUpdate) {
			mav.addObject("msg", "수정 완료!! 다시 로그인 해주세요");
			mav.addObject("flag", true);
		}
		else {
			mav.addObject("msg", "수정 실패!!");
			mav.addObject("flag", false);
		}
		
		return mav;
	}
	
	@GetMapping("join")
	public String join() {
		return "join";
	}
	
	@PostMapping("join")
	public ModelAndView join(MemberDTO dto, ModelAndView mav) {
		boolean isJoin = memberDAO.join(dto);
		String msg = null;
		boolean flag = false;
		
		if(isJoin) {
			msg = "회원가입 성공!! 로그인페이지로 이동합니다.";
			flag = true;
		}
		else {
			msg = "회원가입 실패..회원가입 페이지로 이동합니다.";
		}
		mav.addObject("joinMsg", msg);
		mav.addObject("joinFlag", flag);
		
		return mav;
	}
}






















