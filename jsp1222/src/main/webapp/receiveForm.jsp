<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
		<head>
			<meta charset="UTF-8">
			<title>form</title>
			<style type="text/css">
				table, td{border:1px solid black; border-collapse: collapse;}
				table{width:800px; margin:0 auto;}
				td {width:400px; height:40px; text-align: center;}
			</style>
		</head>
		<body>
			<%
				request.setCharacterEncoding("utf-8");
				String name, id, pw, gender, email1, email2, email3, str_hobby="";
				String[] hobbys=null;
				String[] str_hobbys;
				name = request.getParameter("name");
				id = request.getParameter("id");
				pw = request.getParameter("pw");
				gender = request.getParameter("gender");
				email1 = request.getParameter("email1");
				email2 = request.getParameter("email2");
				email3 = request.getParameter("email3");
				hobbys = request.getParameterValues("hobbys");
			%>
			<table>
				<tr>
					<td>name</td>
					<td><%=name %></td>
				</tr>
				<tr>
					<td>id</td>
					<td><%=id %></td>
				</tr>
				<tr>
					<td>pw</td>
					<td><%=pw %></td>
				</tr>
				<tr>
					<td>gender</td>
					<td><%=gender %></td>
				</tr>
				<tr>
					<td>email1</td>
					<td><%=email1 %></td>
				</tr>
				<tr>
					<td>email2</td>
					<td><%=email2 %></td>
				</tr>
				<tr>
					<td>email3</td>
					<td><%=email3 %></td>
				</tr>
<!-- 				취미가 한개씩 출력되도록 하시오 -->
				<%
// 						str_hobby=Arrays.toString(hobbys);
					for(int i=0; i<hobbys.length; i++){
				%>
						
						<tr>
							<td>hobbys</td>
							<td><%= hobbys[i] %></td>
						</tr>
				<%		
						if(i==0)
							str_hobby += hobbys[i];
						else
							str_hobby += ","+hobbys[i];
					}
				%>
				
				<tr>
					<td>str_hobby</td>
					<td><%= str_hobby %></td>
				</tr>

				<tr>
					<td>str_hobbys[]</td>
					<td><%= Arrays.toString(str_hobby.split(",")) %></td>
				</tr>
	
			</table>
			
		</body>
</html>