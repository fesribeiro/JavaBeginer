<%
String nome = (String)request.getAttribute("name");
String cep = (String)request.getAttribute("cep");
String address = (String)request.getAttribute("address");
String delivery = (String)request.getAttribute("delivery");
String description = (String)request.getAttribute("description");
String date = (String)request.getAttribute("date");

%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dados Cadastrados</title>
    
    <style>
    
    #message {
    	color: Green;
    	font-size: 25px;
    	font-weight: bold;
    	font-family: Times;    	
    }
    
    fieldset {
    	width: 30%;
    }
    
    #card-data {
    	margin-left: 470px;
    	margin-top:130px;
    	color: black;
    	font-family: monospace;
    }    
    
    #comprovante{
    	color: Green;
    	font-family: Helvetica;
 
    }
    
    </style>   
</head>
<body>
	<form>
		<h1 align="center" id="comprovante">Comprovante de entrega</h1>
	<hr>
		  <fieldset id="card-data">
		    <legend id="message" align="center">Dados da entrega</legend>		    	
				<p>Nome: <%= nome %></p>
				<p>CEP: <%= cep %></p>
				<p>Endereço: <%= address %></p>
				<p>Descrição: <%= description %></p>
				<p>Tipo de entrega: <%= delivery %></p>
				<p>Data: <%= date %></p>
		  </fieldset>
	</form>
</body>
</html>