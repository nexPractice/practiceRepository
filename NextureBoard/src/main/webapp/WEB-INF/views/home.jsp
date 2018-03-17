<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<html>
<head>
	<title>Nexture 게시판 연구를 위한 페이지 입니다.</title>
	<link rel="stylesheet" href="/web/resources/css/home_css.css">
</head>
<body>
	<div id="outside">
		<div id ="main_background">
			<div id="logo">
				<img alt="넥스츄어코리아 로고" src="/web/resources/image/NEXTURE_logo.png" id="login_logo">
			</div>
			<form action="/web" method="post">
				<div id="login_form">
					<div id="id_form">
						ID <input type="text" class="form_input_control" name="id">
					</div>
					<div id="pw_form">
						PW <input type="password" class="form_input_control" password="pwd">
					</div>
					<div id="data_result">
						<input type="submit" value="LOGIN" class="button_control"/>
						<input type="button" onclick="" value="FIND" class="button_control"/>
					</div>
					<div id="login_result"><!-- 여기에 로그인 결과를 javascript로 출력하게 할겁니다. -->
					</div>
				</div>
				
				
			</form>
		</div>
	</div>
</body>
</html>
