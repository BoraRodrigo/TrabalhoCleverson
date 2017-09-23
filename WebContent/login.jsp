<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Login</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="css/bootstrap.min.css">
<style>
body {
	padding-top: 50px;
	padding-bottom: 20px;
}
</style>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.2/css/font-awesome.min.css">
</head>
<body>
	<c:import url="inc/header.jsp" />
	<main class="container">

	<h1>Login:</h1>
	<form action="#" method="post">
	<div class="form-group">
		<label for="campoNome">EMAIL:</label>
		 <input type="text" width="7" size="5" class="form-control" name="email">
	</div>
	
	<div class="form-group"> 
		<label for="campoSenha">SENHA:</label>
		<input type="password" size="3" class="form-control" name="senha">
	</div>
	<div class="form-group">
			<input type="submit"  class=" btn btn-success" value="Entrar" /> 
			<input type="reset"
				class="btn" value="Limpar" />
	</div>			
	<a href="" class="form-group">Esqueci a senha</a>
	</form>
	</main>
	<c:import url="inc/footer.jsp" />
</body>
</html>