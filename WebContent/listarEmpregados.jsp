<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Empregados</title>

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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.2/css/font-awesome.min.css">
</head>
<body>
	<c:import url="inc/header.jsp"/>
	<main class="container">
	<h1>Lista Empregados</h1>
	<tr>
		<form action="">
			<td><input type="button" class="btn btn-default.active" align="left"
				value="Voltar" onClick="history.go(-1)" /></td> 
				<a class="btn btn-primary" href="cadastrarEmpregado.jsp"><i
				class="fa fa-plus"></i> Novo Empregado</a>
			<hr />
		</form>
		<br>
	</tr>

	<c:choose>
		<c:when test="${not empty listaEmpregado}">
			<div class="table-responsive">
			<table   class="table table-condensed " border="2" bordercolor="black">
				<tr bgcolor="black" style="color: white;">
					<td >Id</td>
					<td>Nome</td>
					<td>Cpf</td>
					<td>Data de admissão</td>
					<td>Salário</td>
					<td align="center">Demitir</td>


				</tr>
				<c:forEach var="empregado" items="${listaEmpregado}">
					<tr>
						<td>${empregado.id}</td>
						<td>${empregado.nome}</td>
						<td>${empregado.cpf}</td>
						<td>${empregado.dataAdmisao}</td>
						<td>${empregado.salario}</td>
							
						<td align="center" ><a  class="btn btn-primary" href="/Trabalho/ObterDados?id=${empregado.id}"  method="get">Demitir Empregado </a></td>	
				
					</tr>
				</c:forEach>
			</table>
			</div>
		</c:when>
		<c:otherwise>
			<br>
			<div class="alert alert-info">Lista Vazia</div>
		</c:otherwise>
	</c:choose>

	<form action="/Trabalho/demitirempregadoServlet" method="get">
		<input type="submit" class="btn btn-red" value="DEMITIR EMPREGADO">
	</form>

	</main>
	<c:import url="inc/footer.jsp"/>



</body>
</html>