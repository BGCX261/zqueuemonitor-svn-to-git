<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script>
function showQmgrs(){
	document.forms[0].action="../ListQmgrServlet";
	document.forms[0].submit();
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Action Menu</title>
<style>

</style>
</head>
<body>
	<form method="GET" action="">
		<fieldset >
			<input width="350" type="button" value="Working with Queue Managers" onclick="showQmgrs()"/>
			<input width="350" type="button" value="Working with Queues" onclick="showQueues()"/>
			<input width="350" type="button" value="Working with Channels" onclick="showChannels()"/>
		</fieldset>
	</form>
</body>
</html>