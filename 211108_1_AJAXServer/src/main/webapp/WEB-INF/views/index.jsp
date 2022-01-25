<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>과일 확인</h1>
	<c:forEach var="f" items="${fruits}">
	${f.f_name } -
	<fmt:formatNumber type="currency" value="${f.f_price }" />
		<br>
	</c:forEach>
	<hr>
	<h1>선물 확인</h1>
	<c:forEach var="g" items="${gifts}">
	${g.g_name } : 
	<fmt:formatNumber type="currency" value="${g.g_price }" /> 
	(${g.g_brand})
		<br>
	</c:forEach>
</body>
</html>