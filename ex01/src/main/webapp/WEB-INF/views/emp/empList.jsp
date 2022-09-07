<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체조회</title>
</head>
<style>
table, tr, td, th, thead {
	border: 1px solid black;
}

td {
	padding: 3px;
}
</style>
<body>
	<c:set var="vo" value="empVO" />
	<table>
		<button type="button" onclick="location.href='empInfo'">등록</button>
		<tr>
			<th>사원번호</th>
			<th>이름</th>
			<th>성</th>
			<th>이메일</th>
			<th>부서</th>
			<th>연봉</th>
			<th>입사일자</th>
			<th>DELETE</th>
		</tr>
		<tbody>
			<c:forEach items="${empList}" var="emp">
				<tr onclick="location.href='getInfo?employeeId=${emp.employeeId}'">
					<td>${emp.employeeId }</td>
					<td>${emp.lastName }</td>
					<td>${emp.firstName }</td>
					<td>${emp.email }</td>
					<td>${emp.jobId }</td>
					<td>${emp.salary }</td>
					<td>${emp.hireDate }</td>
					<td><button type="button"
							onclick="deleteInfo(${emp.employeeId}, event)">삭제</button></td>
				</tr>
			</c:forEach>

		</tbody>
		<tr>
		</tr>
	</table>
	<script>
		function deleteInfo(id, event){
			event.stopPropagation();
			location.href='deleteInfo/'+id;
		}
	</script>
</body>
</html>