<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="update" method="POST">
	<table>
		<tr>
			<th>번호</th>
			<td><input type="number" name="bno" value="${board.bno }" readonly/></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input type="text" name="title" value="${board.title }"></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><input type="text" name="writer" value="${board.writer }" readonly></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="3" cols="2" style="width: 100px" name="content">"${board.content }"</textarea></td>
		</tr>
		<tr>
			<th>첨부파일</th>
			<td><img src="<c:url value="/resources/images/${board.image }"/>" name="image" alt="이미지" /></td>
		</tr>
		<tr>
			<th>작성일자</th>
			<td><fmt:formatDate value="${board.regdate }" pattern="yyyy/MM/dd" /></td>
		</tr>
	</table>
	<button type="submit" >수정완료</button>
	</form>
</body>
</html>