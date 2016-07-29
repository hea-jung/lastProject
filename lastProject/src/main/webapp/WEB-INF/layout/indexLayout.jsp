<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="margin-left: auto;margin-right: auto;">
		<div>
			<tiles:insertAttribute name="top"></tiles:insertAttribute>
		</div>

		<div>
			<tiles:insertAttribute name="content"></tiles:insertAttribute>
		</div>
		<div>
			<tiles:insertAttribute name="content2"></tiles:insertAttribute>
		</div>
	</div>
</body>
</html>