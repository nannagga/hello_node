<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
		<head>
			<meta charset="UTF-8">
			<title>jsp태그-지시자,주석,선언,표현식,스크립트릿,액션태그</title>
		</head>
		<body>
			<%
				for(int i = 2; i<=9; i++){
					out.println("["+i+" 단]");
					for(int j=1; j<=9; j++){
						out.println("<h4>"+i+"*"+j+"="+(i*j)+"</h4>");
					}
				}
			%>
		</body>
</html>