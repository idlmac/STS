<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
</head>
<body>
	<form name="insertForm" action="insert" method="post">
		<div>
			<h3>게시글 등록</h3>
		</div>
		<table>
			<tr>
				<th>번호</th>
				<td><input type="number" name="bno" value="${no }" readonly/></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="content"></textarea></td>
			</tr>
			<tr>
				<th>첨부이미지</th>
				<td><input type="text" name="image"></td>
			</tr>
		</table>
		<button type="submit" onclick="formOption()">등록</button>
		<button type="button" onclick="location.href='list'">목록</button>
	</form>
	<script>
		function formOption() {
			let title = document.getElementsByName('title')[0];
			let writer = document.getElementsByName('writer')[0];
			let content = document.getElementsByName('content')[0];
			
			if(title.value == "") {
				alert("제목이 입력되지 않았습니다.");
				return;
			}
			
			if(writer.value == "") {
				alert("작성자가 입력되지 않았습니다.");
				return;
			}
			
			if(content.value == "") {
				alert("내용 입력되지 않았습니다.");
				return;
			}
			
			insertForm.submit;
		}
	</script>
</body>
</html>