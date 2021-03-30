<%@page import="com.bit.servlet.dao.PhoneBookDao"%>
<%@page import="com.bit.servlet.dao.PhoneBookDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% // 파라미터 받아오기, Parameter의 값은 항상 String
Long id = Long.valueOf(request.getParameter("id")); // converting
PhoneBookDao dao = new PhoneBookDaoImpl();

dao.delete(id);

// 리스트 페이지로 리다이렉트
response.sendRedirect(request.getContextPath() + "/addresslist/");
%>