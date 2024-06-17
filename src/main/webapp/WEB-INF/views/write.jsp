<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
</head>
<body>
	<h2>게시판 글쓰기</h2>
	<hr>
	<fieldset style="width: 640px;">
		<form action="submitOk">
			<table border="1" cellspacing="0" cellpadding="0" width="600">
				<tr>
					<td>이름 : </td>
					<td><input type="text" size="60" name="id"></td>
				</tr>
				<tr>
					<td>제목</td>
					<td><input type="text" size="60" name="title"></td>
				</tr>
				<tr>
					<td>내용</td>
					<td><textarea row="10" cols="45" name="content" placeholder="여기에 글을 입력하세요"></textarea></td>
				</tr>
			</table>
			<div>
				<input type="submit" value="글작성">
			</div>
		</form>
	</fieldset>
</body>
</html>