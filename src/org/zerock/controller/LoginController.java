package org.zerock.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.zerock.domain.MemberVO;
import org.zerock.service.MemberService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService service;
	
	public LoginController() {
		this.service = new MemberService();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uid = request.getParameter("uid");
		String upw = request.getParameter("upw");
		
		System.out.println("uid: " + uid);
		System.out.println("upw: " + upw);
		
		MemberVO vo = service.findByUidUpw(uid, upw);
		
		System.out.println(vo);
		
		if(vo == null) {
			System.out.println("로그인 실패");
			response.sendRedirect("login?msg=error");
			return;
		}
		
		//세션 얻음 
		HttpSession session = request.getSession();
		
		//session은 vo자체를 집어넣음
		session.setAttribute("member", vo);
		
		//get
		response.sendRedirect("myPage");
		
	}

}
