<!doctype html>
<html>

<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.1.0.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.css"/>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.js"  ></script>
</head>
<body>
<h3 class="Jumbotron">Cadastro spring mvc</h3>

<div class="container">    
    <div class="col-md-6">
    	<div class="panel panel-primary">
    		<div class="panel-heading">
    			<div class="panel-title">
    				Formulario de Cadastro
    			</div>
    		</div>
    		
    		<div class="panel-body">
    		 <form method="post" action="cadastrar.html" role="form">
    			
    			<input type="text" name="nome" class="form-control" 
    			required="required" placeholder="Digite o Nome">
    			
    			<input type="email" name="email" class="form-control"
    			required="required" placeholder="Digite o email">
    			
    			<select name="sexo" class="form-control" required="required">
    				<option value="">Escolha o sexo</option>
    				<option value="m">Masculino</option>
    				<option value="f">Feminino</option>
    			</select>
    			
    			<button type="submit" class="btn btn-primary">
    				Gravar	</button>
    			
    		  </form>
    		</div>
    		
    	</div>
    	  <a href="http://localhost:8080/project-mongodb-spring/listar.html"
   style="font-size:18pt">Consultar Espaço</a>
    	
    </div>
    
    
    
    
    
    
    
    
    
    
 </div>

 






</body>

</html>