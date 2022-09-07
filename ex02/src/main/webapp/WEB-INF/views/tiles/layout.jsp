<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
</head>
<body>
	<header>
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
	</header>
	<main>
		<tiles:insertAttribute name="main"></tiles:insertAttribute>
	</main>
	<footer>
		<!-- E 스크롤 배너 -->

		<!-- E container -->
		<!-- S footer -->
		<div id="footerBox">
			<div id="footer">
				<h2 class="skip">카피라이트</h2>
				<div id="flogo">
					<img src="https://i.imgur.com/6xNwPlX.jpeg"
						class="valignM" alt="(주)예담직업전문학교" style="width : 330px;, height : 330px;" />
				</div>
				<div id="address">
					<address>
						<span class="bold">(주)예담직업전문학교</span> 대구광역시 중구 중앙대로 403 (남일동
						135-1, 5층) <span class="colorCCC">/</span> <span class="bold">대표자</span>:서강중
						<span class="colorCCC">/</span> <span class="bold">사업자번호</span>:504-86-00471
						<span class="colorCCC">/</span> <span class="bold">Tel</span>:053-421-2460
						<span class="colorCCC">/</span> <span class="bold">Fax</span>:053-356-3939
					</address>

					<p>


						<span class="bold">대표 E-mail</span>:ask@yedam.ac <span
							class="colorCCC">/</span> <span class="bold">개인정보보호책임자</span>:서강중
						(ask@yedam.ac)
					</p>

					<p>
						Copyright &copy; 2009 <span>(주)예담직업전문학교</span> All Rights
						Reserved.
					</p>
				</div>
			</div>
		</div>
		<!-- E footer -->
	</footer>
</body>
</html>

<!-- http://tiles.apache.org/tags-tiles -->