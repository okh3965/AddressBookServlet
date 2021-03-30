package com.bit.servlet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.servlet.dao.PhoneBookDao;
import com.bit.servlet.dao.PhoneBookDaoImpl;
import com.bit.servlet.dao.PhoneBookVo;

// 서블릿 등록
@WebServlet(name="Addresslist", urlPatterns="/al")
public class AddresslistServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getParameter("a");
		
		if("form".equals(action)) {
			//등록 폼 모드 a = form
			RequestDispatcher rd =
					getServletContext().getRequestDispatcher("/WEB-INF/views/addresslist/form.jsp");
			rd.forward(req, resp);			
		} else if("delete".equals(action)) {
			Long id = Long.valueOf(req.getParameter("id"));
			
			PhoneBookDao dao = new PhoneBookDaoImpl(); 
			dao.delete(id);
			//리스트로 복귀
			resp.sendRedirect(req.getContextPath() + "/al");
		} else if("find".equals(action)) {
			String keyword = req.getParameter("keyword");
			System.out.println(keyword);
			PhoneBookDao dao = new PhoneBookDaoImpl();
			List<PhoneBookVo> list = dao.search(keyword);
			req.setAttribute("list", list);
			
			RequestDispatcher rd =
					getServletContext().getRequestDispatcher("/WEB-INF/views/addresslist/index.jsp");
			rd.forward(req, resp);
		} else {
			PhoneBookDao dao = new PhoneBookDaoImpl();
			List<PhoneBookVo> list = dao.getList();
			req.setAttribute("list", list);
			
			RequestDispatcher rd =
					getServletContext().getRequestDispatcher("/WEB-INF/views/addresslist/index.jsp");
			rd.forward(req, resp);
		}	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getParameter("action");
		
		if("insert".equals(action)) {
			String name = req.getParameter("name");
			String hp = req.getParameter("hp");
			String tel = req.getParameter("tel");
			
			PhoneBookVo vo = new PhoneBookVo();
			vo.setName(name);
			vo.setHp(hp);
			vo.setTel(tel);
			
			PhoneBookDao dao = new PhoneBookDaoImpl();
			
			dao.insert(vo);
			resp.sendRedirect(req.getContextPath() + "/al");
		} else {
			doGet(req, resp);
		}
	}
	
	

	
}
