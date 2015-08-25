<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Queue Managers</title>
</head>
<body>
	<form action="#">
		<table>
			<tr>
				<td></td>
				<td>Name</td>
				<td>Status</td>
				<td></td>
			</tr>
			<c:forEach var="qmgr" items="${qmgrs}">
				<tr>
					<td></td>
					<td>${qmgr.name}</td>
					<td>${qmgr.status}</td>
					<td><a href="<c:url value="ShowQmgrDetailServlet"><c:param name="qmgrname" value="${qmgr.name}"/></c:url>">detail</a></td>
				</tr>
			</c:forEach>
		</table>
		<input type="button" value="Add Queue Manager"/>
		<input type="button" value="Delete Queue Manager"/>
	</form>
</body>
</html>