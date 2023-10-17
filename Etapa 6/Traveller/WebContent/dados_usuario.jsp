<!DOCTYPE html>
<jsp:useBean id="Usuario" type="br.com.gulliver_traveller.beans.Usuario" scope="session"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Gulliver Traveller</title>
    <link rel="stylesheet" href="css/dados.css" />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
      integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />
  </head>
  <body>
    <main>
      <div class="infoBasic">
        <h2>Informações Básicas</h2>
        <div class="info">
          <h4>Nome: <c:out value="${Usuario.nome}"></c:out> </h4>
          <p id="nome"></p>
        </div>
        <div class="info">
          <h4>Data de Nascimento: <c:out value="${Usuario.data_nascimento}"></c:out></h4>
          <p id="nascimento"></p>
        </div>
        <div class="info">
          <h4>Gênero: <c:out value="${Usuario.sexo}"></c:out></h4>
          <p id="genero"></p>
        </div>
      </div>
      <div class="infoContact">
        <h2>Informações de contato</h2>
        <div class="info">
          <h4>E-mail: <c:out value="${Usuario.email}"></c:out></h4>
          <p id="email"></p>
        </div>
        <div class="info">
          <h4>Telefone: <c:out value="${Usuario.telefone}"></c:out></h4>
          <p id="tel"></p>
        </div>
        <div class="endereco">
          <h4>Endereço: </h4>
          <div>
	          <h4>Cidade: <c:out value="${Usuario.endereco.cidade}"></c:out></h4>
	          <h4>Estado: <c:out value="${Usuario.endereco.estado}"></c:out></h4>
	          <h4>CEP: <c:out value="${Usuario.endereco.cep}"></c:out></h4>
	          <h4>Rua: <c:out value="${Usuario.endereco.rua}"></c:out></h4>
	          <h4>Numero: <c:out value="${Usuario.endereco.numero}"></c:out></h4>
	          <h4>Complemento: <c:out value="${Usuario.endereco.complemento}"></c:out></h4>
	          <h4>Referencia: <c:out value="${Usuario.endereco.referencia}"></c:out></h4>
	          <h4>Bairro: <c:out value="${Usuario.endereco.bairro}"></c:out></h4>
          </div>
          <p id="logradouro"></p>
        </div>
      </div>
      <a href="login.jsp">
        <button>Sair</button>
      </a>
    </main>
    <script></script>
  </body>
</html>
