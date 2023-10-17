<!DOCTYPE html>
<jsp:useBean id="ErroMSG" type="java.lang.String" scope="request"></jsp:useBean>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Projeto Traveller - Erro</title>
</head>
<body>
	<header>
		<h3>Projeto Traveller</h3>
		<h5>Area de Login</h5>
	</header>
	
	<h3><c:out value="${ErroMSG}"></c:out></h3>
</body>
</html>