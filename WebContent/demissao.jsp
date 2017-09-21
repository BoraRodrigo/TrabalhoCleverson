<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demissão</title>
<meta name="viewport" content="width=device-width, initial-scale=1">


 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

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
	<main class="container"> <c:import url="inc/header.jsp" /> <br>
	<h1>Formulario Demitir Empregado</h1>


			
	<form action="/Trabalho/calcularVerbasServlet" method="post">
	<div class="form-group">
		<label for="campo1">Nome Empregado:</label> <input type="text"
			size="50" class="form-control" name="nome" value="${empregado.nome}">
	</div>

	<div class="form-group">
		<label for="campo2">Ultimo Salario:</label> <input type="text"
			size="50" class="form-control" name="ultimoSalario" value="${empregado.salario}">
	</div>


	<div class="form-group">
		<label for="campo3">Data Admissão:</label> <input type="date"
			size="50" class="form-control" name="dataAdmissao" value="${empregado.dataAdmisao}">
	</div>

	<div class="form-group">
		<label for="campo3">Data Demissão:</label> <input type="date"
			id="dataAtual" size="50" class="form-control" name="dataDemissão">
	</div>
	


	<div class="form-group">
		<label for="campo4">Motivo Demissão:</label>
		 <select class="form-control" id="tipodemissao" name="tipodemissao">
		 <option value =""> -----------</option>
		 <option value ="justaCausa"> Justa Causa</option>
		 <option value ="semjustaCausa"> Sem Justa Causa</option>
		 <option value ="pedidoDemisao"> Pedido Demissão</option>

		 </select>
	</div>

	<div class="form-group">
		<label for="campo1">Cpf:</label> <input type="text" size="50"
			class="form-control" name="cpf"  value="${empregado.cpf}">
	</div>
	
	<div class="form-group">
		<label for="campo1">Dias Trabalhados:</label> <input type="text" size="50"
			class="form-control" name="diastrabalhado">
	</div>
	
	<div class="form-group">
		<label for="campo4">Ferias Vencidas:</label>
		 <select class="form-control" id="ferias" name="ferias">
		 <option value ="">         </option>
		 <option value ="sim">SIM</option>
		 <option value ="nao">NÃO</option>

		 </select>
	</div>
	
	
	<div class="form-group">
		 <label for="campo4">Aviso Trabalhado:</label>
		 <select class="form-control" id="aviso" name="aviso">
		 <option value ="">         </option>
		 <option value ="sim">SIM</option>
		 <option value ="nao">NÃO</option>

		 </select>
	</div>
	
	
		
			<input type="submit" class="btn btn-green" value="Calcular Verbas" />
			</form>
			<br>
			<a  class="btn btn-green" href="/Trabalho/calcularVerbasServlet?ultimoSalario"  method="post">Calculo </a>
		
	
	
	<h1>DESCRIÇÃO DE VERBAS</h1>
	<div class="form-group">
		<label for="campo1">Saldo de Salario:</label> <input type="text"
			size="50" class="form-control" name="saldoDeSalario">
	</div>

	<div class="form-group">
		<label for="campo1">Aviso Prévio:</label> <input type="text" size="50"
			class="form-control" name="AvisoPrevio">
	</div>

	<div class="form-group">
		   <label for="campo1">Total:</label> <input type="text" size="50"
			class="form-control" name="total">
	</div>
	
	
	<script>
			document.getElementById('dataAtual').value = new Date().toISOString().substring(0, 10);
</script>

	<input type="submit" class="btn btn-green" value="Comfirmar Demissão" />
	<input type="reset" class="btn btn-red" value="&#10000 Limpar" /> <c:import
		url="inc/footer.jsp" /> </main>
</body>
</html>