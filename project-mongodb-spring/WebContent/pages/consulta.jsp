<!doctype html>
<html>

<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.1.0.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%@ page import="entity.*,persistence1.*, java.util.*" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<h2 class="jumbotron">Consultar Alunos</h2>

<script type="text/javascript">
    $(document).ready(function(){
       $("#tabela").dataTable({
    	   "lengthMenu": [[4,8,50],[4,8,50,"todos"]],
    	   "language":{
      "url":"//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Portuguese.json"}
    	   });

       });  
 </script>


 <table class="table table-hover" id="tabela">
 <tr>
   <td>Nome</td>
   <td>Email</td>
   <td>Sexo</td>
 </tr>
 <c:forEach items="${lista}" var="linha" >
  <tr>
     <td>${linha.nome}</td>
     <td>${linha.email}</td>
     <td>${linha.sexo}</td>
  </tr>
 </c:forEach>
</table>

 	  <a href="http://localhost:8080/project-mongodb-spring/" style="font-size:18pt">Voltar</a>
   
</body>
</html>

