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
	<div id="login" >
	<form method="Get" action="#">	
		ServerURL:<select id="urls">
			<c:forEach var="url" items="${serverURLs}">					
				<option value="${url}" >${url}</option>
            </c:forEach>
		</select>
		<br/>
		Username:<input id="usrname" type="text"/>
		<br/>
		Password:<input id="passwd" type="text"/>
		<br/>
		<input type="button" value="GO" onclick="go()"/>	
	</form>
	</div>
</body>
</html>