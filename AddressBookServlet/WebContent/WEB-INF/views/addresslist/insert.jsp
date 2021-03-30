<%@page import="com.bit.servlet.dao.PhoneBookDaoImpl"%>
<%@page import="com.bit.servlet.dao.PhoneBookDao"%>
<%@page import="com.bit.servlet.dao.PhoneBookVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	// 요청 파라미터 받기
String name = request.getParameter("name");
String hp = request.getParameter("hp");
String tel = request.getParameter("tel");

//	VO 객체
PhoneBookVo vo = new PhoneBookVo(name, hp, tel);
PhoneBookDao dao = new PhoneBookDaoImpl();

dao.insert(vo);	// 저장 완료

response.sendRedirect(request.getContextPath() + "/addresslist/");

%>