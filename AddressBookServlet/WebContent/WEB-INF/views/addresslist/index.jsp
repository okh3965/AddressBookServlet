<%@page import="com.bit.servlet.dao.PhoneBookVo"%>
<%@page import="com.bit.servlet.dao.PhoneBookDaoImpl"%>
<%@page import="com.bit.servlet.dao.PhoneBookDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트 확인</title>
</head>
<body>
	<h1>주소록 Servlet</h1>
	<form action="<c:url value = "/al?a=find"/>"
		method="POST">
		<label>검색어</label>
		<input type="text" name="keyword" />
		<input type="submit" value="검색" />
	</form>
	
			<!-- 정보 테이블 -->
	<table border=1>
		<tr>
			<th>이름</th>
			<th>휴대전화번호</th>
			<th>집전화번호</th>
			<th>도구</th>								
		</tr>
		<c:forEach items="${ list }" var="vo">		
		<tr>
			<td>${ vo.name }</td>
			<td>${ vo.hp }</td>
			<td>${ vo.tel }</td>
			<td>
				<form action="<c:url value="/al"/>">
					<input type="hidden" name="a" value="delete" />
					<!-- 게시물의 no(PK) -->
					<input type="hidden" name="id" value="${ vo.id }"/>
					<!-- 전송 버튼 -->
					<input type="submit" value="삭제" />
				</form>
			</td>
		</tr>
		</c:forEach>							
		<!-- 삭제 버튼 -->
	</table>		
	<p>
		<a href="<c:url value = "/al?a=form"/>">새 주소 추가</a>
	</p>

</body>
</html>