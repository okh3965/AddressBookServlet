<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전화번호 리스트: 가입폼</title>
</head>
<body>
	<h1>주소록 Servlet</h1>
	<p>새 주소 등록</p>

	<form action="<c:url value = "/al"/>"
		method="POST">
		<input type="hidden" name="action" value="insert"/>
		<label for="name">이름</label>
		<br/>
		<input type="text" name="name" />
		<br/>
		<label for="hp">휴대전화번호</label>
		<br/>
		<input type="text" name="hp" id="hp" />
		<br/>
		<label for="tel">집전화번호</label>
		<br/>
		<input type="text" name="tel" id="tel" />
		<br/>
		<input type="submit" value="주소 등록" />
	</form>
	<p>
		<a href="<c:url value="/al"/>">목록</a>
	</p>
	
</body>
</html>