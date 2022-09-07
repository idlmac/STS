<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>번호</th>
			<td>${board.bno }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${board.title }</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${board.writer }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="3" cols="2" style="width:100px" readonly>"${board.content }"</textarea></td>
		</tr>
		<tr>
			<th>첨부파일</th>
			<td><img src="<c:url value="/resources/images/${board.image }"/>" alt="이미지"/></td>
		</tr>
		<tr>
			<th>작성일자</th>
			<td><fmt:formatDate value="${board.regdate }" pattern="yyyy/MM/dd"/></td>
		</tr>
	</table>
	<button onclick="location.href='update?bno=${board.bno}'">수정</button>
	<button onclick="location.href='list'">목록</button>
</body>
</html>