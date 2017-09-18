<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Empregado</title>
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
	<form action="/Trabalho/cadastrarEmpregadoServlet" method="post">

		<c:import url="inc/header.jsp" />
		<main class="container">
		<h1>CADASTRAR EMPREGADO</h1>
		<hr>


		<div class="form-group">
			<label for="campo1">Nome Completo:</label> <input type="text"
				size="50" class="form-control" name="nome">
		</div>
		
		<div class="form-group">
			<label for="campo1">RG:</label> <input type="text" size="50"
				class="form-control" name="rg">
		</div>


		<div class="form-group">
			<label for="campo1">Orgão Emissor:</label> <input type="text"
				size="50" class="form-control" name="orgao">
		</div>

		<div class="form-group">
			<label for="campo1">CPF:</label> <input type="text" size="50"
				class="form-control" name="cpf">
		</div>

		<div class="form-group">
			<label for="campo1">Rua:</label> <input type="text" size="50"
				class="form-control" name="rua">
		</div>


		<div class="form-group">
			<label for="campo1">Bairro:</label> <input type="text" size="50"
				class="form-control" name="bairro">
		</div>

		<div class="form-group">
			<label for="campo1">Cep:</label> <input type="text" size="50"
				class="form-control" name="cep">
		</div>

		<div class="form-group">
			<label for="campo1">Data Admissão:</label> <input type="date"
				size="50" class="form-control" name="dataAdmisao">
		</div>


		<div class="form-group">
			<label for="campo">Salário:</label> <input type="text" size="50"
				class="form-control" name="salario">
		</div>

		<input type="submit" class="btn btn-green" value="&#9745 Cadastrar" />
		<input type="reset" class="btn btn-red" value="&#10000 Limpar" />
	</form>



	<input type="button" class="btn btn-blue" value="&#8678 Voltar"
		onClick="history.go(-1)">
	</main>
	<c:import url="inc/footer.jsp" />
</body>
</html>