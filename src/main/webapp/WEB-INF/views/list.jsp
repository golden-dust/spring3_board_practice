<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 데이터 베이스 연동이 안 되어 있어, 레포지토리에 저장된 리스트가 불러와지는지만 확인! -->
	<h2>전체 글 목록</h2>
	<hr>
	${postList[0].userId} / ${postList[0].title}<br>
	${postList[1].userId} / ${postList[1].title}
	<br><br>
	<a href="write">글쓰기</a>
</body>
</html>