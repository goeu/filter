<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
	//브라우저 껐다가 여기 들어오면 쿠키 없어야 하지만 이 페이지 설정 상 jsp 기본 설정이 true이므로 session 없으면 무조건 하나 만듦 세션이 없어도 만들어 짐
	session.setAttribute("cer", "홍길동");// <String, Object>
%>
<h1>정상 처리되었습니다.</h1>
</body>
</html>