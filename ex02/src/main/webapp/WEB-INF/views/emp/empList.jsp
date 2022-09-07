<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체조회</title>
<style>
th, td {
	border: 1px solid black;
}
</style>
</head>
<body>
		<button type="button" onclick="location.href='/java/emp/getInfo?employeeId='">등록하기</button>
	<table>
		<thead>
			<tr>
				<th>employee_id</th>
				<th>first_name</th>
				<th>last_name</th>
				<th>email</th>
				<th>hire_date</th>
				<th>job_id</th>
				<th>salary</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="emp" items="${empList }">
				<tr
					onclick="location.href = '/java/emp/getInfo?employeeId=${emp.employeeId }'">
					<td>${emp.employeeId}</td>
					<td>${emp.firstName}</td>
					<td>${emp.lastName}</td>
					<td>${emp.email}</td>
					<td>${emp.hireDate}</td>
					<td>${emp.jobId}</td>
					<td>${emp.salary}</td>
					<td><button type="button"
							onclick="location.href = '/java/emp/deleteInfo/${emp.employeeId}'">삭제</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<script>
	function getInfo(event) {
		location.href = '/java/emp/getInfo?employeeId=' + ${emp.employeeId }'
	}
	
	</script>
</body>
</html>