<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    request.setAttribute("scope", 83);
    %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${scope >= 90 }">
		A학점입니다.
		</c:when>
		<c:when test="${scope >= 80 }">
		B학점입니다.
		</c:when>
		<c:when test="${scope >= 70 }">
		c학점입니다.
		</c:when>
		<c:when test="${scope >= 60 }">
		D학점입니다.
		</c:when>
		<c:when test="${scope >= 50 }">
		F학점입니다.
		</c:when>
		<c:when test="${scope >= 40 }">
		A학점입니다.
		</c:when>
	</c:choose>
</body>
</html>