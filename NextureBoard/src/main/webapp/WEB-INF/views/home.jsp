<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<html>
<head>
	<title>시산표 입력</title>
	<link rel="stylesheet" href="/web/resources/css/home_css.css">
</head>
<body>
	<div id="outside">
		<div id ="main_background">
			<form action="/web/balance" method="post">
				<div id="input_form">
					<div id="title">
						<h1>balance</h1>
					</div>
					<table id="my-tbody" width="100%" cellpadding="0" cellspacing="0" border="0">
					     <tr text-align="center">
					      <td width="2" align="center">차변</td>
					      <td width="2" align="center">계정과목</td>
					      <td width="2" align="center">대변</td>
					     </tr>
				   	 </table>
					<input type="submit" value="합계시산표" class="button_control"/>
				</div>
			</form>
					<div id="login_result"><!-- 여기에 로그인 결과를 javascript로 출력하게 할겁니다. -->
						<button onclick="add_row()" class="button_control2">행 추가하기</button>
						<button onclick="delete_row()" class="button_control2">행 삭제하기</button>
					</div>
			
			
		</div>
	</div>
	<script>
  function add_row() {
    var my_tbody = document.getElementById('my-tbody');
    // var row = my_tbody.insertRow(0); // 상단에 추가
    var row = my_tbody.insertRow( my_tbody.rows.length ); // 하단에 추가
    var cell1 = row.insertCell(0);
    var cell2 = row.insertCell(1);
    var cell3 = row.insertCell(2);
    cell1.innerHTML = '항목';
  }

  function delete_row() {
    var my_tbody = document.getElementById('my-tbody');
    if (my_tbody.rows.length < 1) return;
    // my_tbody.deleteRow(0); // 상단부터 삭제
    my_tbody.deleteRow( my_tbody.rows.length-1 ); // 하단부터 삭제
  }
</script>
</body>
</html>
