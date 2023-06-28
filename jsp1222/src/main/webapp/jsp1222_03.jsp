<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
		<head>
			<meta charset="UTF-8">
			<title>jsp-for-if</title>
		</head>
		<body>
			<%
				String id="aaa";
				if(!id.equals("aaa")){
					out.println("<h2>로그인 전</h2>");
					out.println("<ul><li>로그인</li><li>회원가입</li></ul>");
				}
		
				else{
					out.println("<h2>로그인 후</h2>");
					out.println("<ul>");
					out.println("<li>로그아웃</li>");
					out.println("<li>회원정보</li>");
					out.println("</ul>");
				}
			%>
			
		</body>
</html>