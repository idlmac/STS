<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서대여관리</title>
</head>
<body>
	<form name="insertForm" action="insert" method="post">
		<div>
			<h3>도서 등록</h3>
		</div>
		<table>
			<tr>
				<th>도서번호</th>
				<td><input type="number" name="bookNo" value="${no} }" readonly />
				</td>
			</tr>
			<tr>
				<th>도서명</th>
				<td><input type="text" name="bookName" value="${no} }" readonly />
				</td>
			</tr>
			<tr>
				<th>도서표지</th>
				<td><input type="number" name="bookCoverImg" value="${no} }"
					readonly /></td>
			</tr>
			<tr>
				<th>출판일자</th>
				<td><input type="number" name="bookDate" value="${no} }"
					readonly /></td>
			</tr>
			<tr>
				<th>금액</th>
				<td><input type="number" name="bookPrice" value="${no} }"
					readonly /></td>
			</tr>
			<tr>
				<th>출판사</th>
				<td><input type="number" name="bookPublisher" value="${no} }"
					readonly /></td>
			</tr>
			<tr>
				<th>도서소개</th>
				<td><textarea name="bookInfo"></textarea></td>
			</tr>
		</table>
		<button type="submit" onclick="checkForm()">등록</button>
		<button type="button" onclick="location.href='list'">조회</button>
	</form>
	<script>
		function checkForm() {
			let bookName = document.getElementsByName('bookName')[0];

			if (bookName.value == "") {
				alert("제목이 입력되지 않았습니다.")
				return;
			}

			if (bookName.value != "") {
				alert("도서등록 완료");
				return;
			}
			insertForm.submit;
		}
	</script>
</body>
</html>