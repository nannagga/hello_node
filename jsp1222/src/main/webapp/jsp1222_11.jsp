<%@page import="java.util.Arrays"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
		<head>
			<meta charset="UTF-8">
			<title>getParameterNames</title>
			<style type="text/css">
			 table, td{border:1px solid black; border-collapse: collapse;}
			</style>		
		
		</head>
		<body>
			<%
			request.setCharacterEncoding("utf-8");
				Enumeration e = request.getParameterNames();
				while(e.hasMoreElements()){
// 					String varName = (String)e.nextElement();//object를 String으로 형변환을 해줘야 한다.
					String varName = e.nextElement().toString();//object를 String으로 형변환을 해줘야 한다.
					String[] varValue = request.getParameterValues(varName);
// 					String varValue = request.getParameterValues(varName).toString();
			%>
					
			<table>
				<tr>
					<td>변수이름(varName)</td>
					<td><%=varName %></td>
					<td>변수값(varValue)</td>
					<td><%=Arrays.toString(varValue) %></td>
				</tr>
			</table>		
					
					
			<%		
				}
			
			%>
		</body>
</html>