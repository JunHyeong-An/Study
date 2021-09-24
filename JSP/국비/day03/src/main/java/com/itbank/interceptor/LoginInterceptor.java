package com.itbank.interceptor;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

// 사용자가 보내는 request를 중간에 가로챈다.
// 컨트롤러에 도착하기전에 먼저 request를 확인 해 볼 수 있다.
public class LoginInterceptor extends HandlerInterceptorAdapter{
	// 반환형 boolean은 계속할건지 그만할건지를 알려주는 것이다.
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 클라이언트의 요청이 컨트롤러 메서드에 도달하기 전에 작동한다.
		// 반환값에 따라서 컨트롤러의 메서드를 예정대로 진행할지 말지 결정할 수 있다.
		System.out.println("preHandle!!");
		
//		HttpSession session = request.getSession(false);	// 세션이 없으면 새로 생성하지 않는다
		HttpSession session = request.getSession(false);	// 세션이 없으면 새로 생성한다
		
		if(session.getAttribute("user") == null) {
			response.sendRedirect(request.getContextPath()+ "/login");
			return false;
		}
		
//		return true;	// 원래 요청대로 진행해라(continue : true) 컨트롤러가 실행되지만 클라이언트가 확인할 새도 없이 바로 리다이렉트
		return true;	// 원래 요청대로 진행하지 마라(continue : false)
		
// 		응답이 커밋된 후에는, sendRedirect()를 호출 할 수 없습니다. 
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// 컨트롤러의 메서드가 수행되거 나서, view로 넘어가기 전에 작동하는 메서드
		Random ran = new Random();
		String[] bgcolor = {"burlywood", "skyblue", "#dadada"};
		modelAndView.addObject("bgcolor", bgcolor[ran.nextInt(2)]);
		
		System.out.println("postHandle!!");
	}
}
