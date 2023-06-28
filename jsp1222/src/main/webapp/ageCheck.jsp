<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
		<head>
			<meta charset="UTF-8">
			<title>response(응답)</title>
		</head>
		<body>
			<%
				request.setCharacterEncoding("utf-8");
			// parameter로 한글을 받으면 encoding을 꼭 해줘야 한글이 깨지지 않고 표현됨
				String name =URLEncoder.encode(request.getParameter("name"),"utf-8");
				int age = Integer.parseInt(request.getParameter("age"));
				
				if(age >= 18){
			%>
				<script type="text/javascript">
					alert("당신은 성인입니다. 주류판매가 가능합니다.");
// 					location.href("pass.jsp");//스크립트에서 해야 alert이 뜨고 다음 페이지로 넘어간다.
				</script>
			<%
				response.sendRedirect("pass.jsp?age="+age+"&name="+name);// get방식 parameter방식으로 보냄(헤더에붙여서) 	servlet에서도 사용 가능. 여러개 보낼때 "&"+변수		
				}else{
			%>
				<script type="text/javascript">
					alert("당신은 미성년자입니다. 주류판매가 불가능 합니다.");
				
				</script>
			<%
				response.sendRedirect("ng.jsp");	
				}
			
			%>
		</body>
</html>