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
	<table style="border: 1px solid black">
		<thead>
			<tr>
				<th>도서번호</th>
				<th>도서명</th>
				<th>표지</th>
				<th>출판일자</th>
				<th>금액</th>
				<th>출판사</th>
				<th>도서소개</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${bookList }">
				<tr onclick="location.href='info?bno=${book.bookNo}'"
					style="cursor: pointer;">
					<td>${book.bookNo }</td>
					<td>${book.bookName }</td>
					<td>${book.bookCoverImg }</td>
					<td><fmt:formatDate value="${book.bookDate }"
							pattern=" yyyy/ MM/ dd/"></fmt:formatDate></td>
					<td>${book.bookPrice }</td>
					<td>${book.bookPublisher }</td>
					<td>${book.bookInfo }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>