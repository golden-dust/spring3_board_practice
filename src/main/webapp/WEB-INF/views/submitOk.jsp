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
		작성자 : ${newPost.id}<br>
		제목 : ${newPost.title}<br>
		내용 : ${newPost.content}<br>
	</p>
	<a href="list">글 목록으로 돌아가기</a>
</body>
</html>