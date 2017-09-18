<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MEU EMPREGADO</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="css/bootstrap.min.css">
<style>
body {
	padding-top: 50px;
	padding-bottom: 20px;
}
</style>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" type="text/css" href="efeitos.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.2/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="efeitos.css">
</head>
<body>
	<c:import url="inc/CabecalhoINDEX.jsp" />
	<br>
	<main class="container"> <a class="btn btn-green"
		href="cadastrarEmpregado.jsp"><i class="fa fa-plus"></i> Novo
		Empregado</a> <br>
	<br>
	<form action="/Trabalho/listarEmpregadosServelet" method="get">
		<input type="submit" class="btn btn-red" value="LISTAR EMPREGADO">
	</form>
	<br>
	</main>
	<c:import url="inc/footer.jsp" />

</body>
</html>