<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
		<head>
			<meta charset="UTF-8">
			<title>response(응답)</title>
		</head>
		<body>
			
			
			<h2>당신의 나이는?</h2>
			<form action="ageCheck.jsp" method="get">
				<input type="text" name="age" id="age"><br>
				
				<input type="text" name="name" id="name">
				<label>이름</label>
				<input type="submit" value="전송">
			</form>
		</body>
</html>