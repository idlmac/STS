<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Worlds</title>
</head>
<body>
	<c:if test="${empty empInfo }">
		<form action="insertEmp" method="post">
	</c:if>
	<c:if test="${!empty empInfo }">
		<form action="updateInfo" method="post">
	</c:if>
	<div>

		<label>ID : <c:if test="${!empty empInfo }">
				<input type="text" name="employeeId" value="${empInfo.employeeId }"
					readonly> </c:if> 
					<c:if test="${empty empInfo }">
				<input type="text" name="employeeId" value="${empInfo.employeeId }"> </c:if>
		</label>
	</div>
	<div>
		<label>LastName : <input type="text" name="firstName"
			value="${empInfo.firstName }">
		</label>
	</div>
	<div>
		<label>firstName : <input type="text" name="lastName"
			value="${empInfo.lastName }">
		</label>
	</div>
	<div>
		<label>email : <input type="text" name="email"
			value="${empInfo.email }">
		</label>
	</div>
	<div>
		<label>phoneNumber : <input type="text" name="phoneNumber"
			value="${empInfo.phoneNumber }">
		</label>
	</div>
	<div>
		<label>hireDate : <input type="text" name="hireDate"
			value="${empInfo.hireDate }">
		</label>
	</div>
	<div>
		<label>jobId : <input type="text" name="jobId"
			value="${empInfo.jobId }">
		</label>
	</div>
	<div>
		<label>salary : <input type="text" name="salary"
			value="${empInfo.salary }">
		</label>
	</div>
	<div>
		<label>commissionPct : <input type="text" name="commissionPct"
			value="${empInfo.commissionPct }">
		</label>
	</div>
	<div>
		<label>managerId : <input type="text" name="managerId"
			value="${empInfo.managerId }">
		</label>
	</div>
	<div>
		<label>departmentId : <input type="text" name="departmentId"
			value="${empInfo.departmentId }">
		</label>
	</div>
	<div>
		<c:if test="${empty empInfo }">
			<button type="submit">등록</button>
		</c:if>
		<c:if test="${!empty empInfo }">
			<button type="submit">수정</button>
		</c:if>
		<button type="button" onclick="location.href='allList'">목록</button>
	</div>
	</form>
</body>
</html>