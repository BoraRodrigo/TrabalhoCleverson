<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a href="index.jsp" class="navbar-brand">SEJA BEM VINDO</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">        
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                    Cadastro <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li><a href="cadastrarEmpregado.jsp">Empregado</a></li>
                </ul>
            </li>
			
			<li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                    Minha Conta <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li><a href="#">Entrar</a></li>
					<li><a href="#">Mudar Senha</a></li>
					<li><a href="#">Sair</a></li>
                </ul>
            </li>
            
            		<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false"> <script language="JavaScript"
							type="text/javascript">
						function horas() {
							var now = new Date();
							var hours = now.getHours();
							var minutes = now.getMinutes();
							var seconds = now.getSeconds()
							if (hours <= 9)
								hours = "0" + hours;
							if (minutes <= 9)
								minutes = "0" + minutes;
							if (seconds <= 9)
								seconds = "0" + seconds;
							var cdate = "<b><font color=white face=arial size=2>"
									+ hours
									+ ":"
									+ minutes
									+ ":"
									+ seconds
									+ " " + "</font>"
							clock.innerHTML = cdate;
							setTimeout("horas()", 1000);
						}
					</script> <span id="clock"></span> <script>
						setTimeout("horas()", 1000);
					</script>
				</a></li>
          </ul>
        </div>
		<!--/.navbar-collapse -->
      </div>
    </nav>