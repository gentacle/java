<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	try{
		int value = (int)application.getAttribute("value");
		value += 3;
		application.setAttribute("value", value);
%>
	<h1><%=value %></h1>
<%
	}catch(NullPointerException e){
%>
	<h1>value값이 설정되지 않음.</h1>
<%	
	}
%>
</body>
</html>