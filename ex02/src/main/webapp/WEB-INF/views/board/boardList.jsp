<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
tr, td, th {
	border: 1px solid black;
}
</style>
</head>

<body>
	<table style="border : 1px solid black">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="${boardList }">
				<tr onclick="location.href='info?bno=${board.bno}'"
					style="cursor: pointer;">
					<td>${board.bno }</td>
					<td>${board.title }</td>
					<td>${board.writer }</td>
					<td><fmt:formatDate value="${board.regdate }"
							pattern=" yyyy년 MM월 dd일"></fmt:formatDate></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<button onclick="location.href='insert'">등록</button>
</body>
</html>