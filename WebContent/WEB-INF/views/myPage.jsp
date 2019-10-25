<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>MyPage 입니다.</h1>
<h2>${member.uname}님 반갑습니다.</h2>	<!-- el태그는 ... req에서 찾고 없으면 session으로 올라가서 멤버라는이름 있는지 찾음 -->

<a href="logout">로그아웃</a>
</body>
</html>