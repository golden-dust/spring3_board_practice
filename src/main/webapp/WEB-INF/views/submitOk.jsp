<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성 완료</title>
</head>
<body>
	<h2></h2>
	<hr>
	<h4>글 작성이 완료되었습니다</h4>
	<p>
		작성자 : ${post.userId}<br>
		제목 : ${post.title}<br>
		내용 : ${post.content}<br>
	</p>
	<a href="list">글 목록으로 돌아가기</a>
</body>
</html>