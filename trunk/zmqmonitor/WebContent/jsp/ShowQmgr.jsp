<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script>
function go(){
	document.forms[0].action="jsp/ListActionMenu.jsp";
	document.forms[0].submit();
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Servers</title>
</head>
<body>
	<form method="Get" action="#">	
		<table>
			<tr>
				<td>Queue Manager Name:</td>
				<td>${qmgr.name}</td>
			</tr>
			<tr>
				<td>Queue Manager Codeset:</td>
				<td>${qmgr.codeset}</td>
			</tr>
			<tr>
				<td>Distributed List Support:</td>
				<td>${qmgr.distribution_list_support}</td>
			</tr>
			<tr>
				<td>Dead Letter Queue:</td>
				<td>${qmgr.dead_letter_queue}</td>
			</tr>
			<tr>
				<td>Default Transmission Queue:</td>
				<td>${qmgr.default_transmittion_queue}</td>
			</tr>
		</table>		
	</form>
</body>
</html>