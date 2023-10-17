<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gulliver Traveller - Cadastro</title>
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.8/css/line.css">
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="container">
        <header>Cadastre-se</header>

        <form method="post" action="./cadastro">
            <div class="form first">

                <div class="details personal">
                    <span class="title">Criar uma conta</span>

                    <div class="fields">
                        <div class="input-field">
                            <label>Nome</label>
                            <input id="nome" name="nome" type="text" placeholder="Nome" required minlength="2">
                        </div>

                        <div class="input-field">
                            <label>Sobrenome</label>
                            <input id="sobrenome" name="sobrenome" type="text" placeholder="Sobrenome" required minlength="2">
                        </div>

                        <div class="input-field">
                            <label>E-mail</label>
                            <input id="email" name="email" type="email" placeholder="e-mail" required minlength="6">
                        </div>

                        <div class="input-field">
                            <label>Telefone</label>
                            <input id="telefone" name="telefone" type="number" placeholder="Telefone" required maxlength="11"
                                minlength="8">
                        </div>

                        <div class="input-field">
                            <label>Criar Senha</label>
                            <input id="senha" name="senha" type="password" placeholder="Criar Senha" required minlength="8">
                        </div>

                        <div class="input-field">
                            <label>Repetir Senha</label>
                            <input id="repSenha" type="password" placeholder="Repetir Senha" required minlength="8">
                        </div>
                    </div>
                </div>

                <div class="details ID">
                    <span class="title">Dados Cadastrais</span>

                    <div class="fields">


                        <div class="input-field">
                            <label>Tipo de Documento</label>
                            <input id="tipoDoc" name="tipo_documento" type="text" placeholder="RG / CPF / CNPJ" required minlength="2"
                                maxlength="4">
                        </div>

                        <div class="input-field">
                            <label>Número do Documento</label>
                            <input id="numDoc" name="numero_documento" type="number" placeholder="Documento" required min="11" maxlength="14">
                        </div>

                        <div class="input-field">
                            <label>Data de Emissão</label>
                            <input id="dtEmissao" name="data_emissao_documento" type="date" placeholder="Emissão" required>
                        </div>

                        <div class="input-field">
                            <label>Sexo</label>
                            <input id="sexo" name="sexo" type="text" placeholder="Sexo" required maxlength="1" minlength="1">
                        </div>

                        <div class="input-field">
                            <label>Data de Nascimento</label>
                            <input id="dtNasc" name="data_nascimento" type="Date" placeholder="" required>
                        </div>

                        <div class="input-field">
                            <label>Profissão</label>
                            <input id="profissao" name="profissao" type="text" placeholder="Profissão" required minlength="3">
                        </div>
                    </div>

                    <div class="details location">
                        <span class="title">Localização</span>


                        <div class="fields">

                            <div class="input-field">
                                <label>Cidade</label>
                                <input id="cidade" name="cidade" type="text" placeholder="Cidade" required>
                            </div>

                            <div class="input-field">
                                <label>Estado</label>
                                <input id="estado" name="estado" type="text" placeholder="Estado" required maxlength="2">
                            </div>

                            <div class="input-field">
                                <label>CEP</label>
                                <input id="cep" name="cep" type="number" placeholder="CEP" required maxlength="8">
                            </div>

                            <div class="input-field">
                                <label>Rua</label>
                                <input id="rua" name="rua" type="text" placeholder="Rua" required>
                            </div>

                            <div class="input-field">
                                <label>Número</label>
                                <input id="numeroRua" name="numero" type="number" placeholder="Número" required>
                            </div>

                            <div class="input-field">
                                <label>Complemento</label>
                                <input id="complemento" name="complemento" type="text" placeholder="Complemento" required>
                            </div>

                            <div class="input-field">
                                <label>Referência</label>
                                <input id="ref" name="referencia" type="text" placeholder="Referência" required>
                            </div>

                            <div class="input-field">
                                <label>Bairro</label>
                                <input id="bairro" name="bairro" type="text" placeholder="Bairro" required>
                            </div>
                            <div class="cadastroBtn">
                                <button class="confirmBtn" type="submit">
                                    <span id="Salvar" class="btnText">Salvar</span>
                                    <i class="uil uil-navigator"></i>
                                </button>
                            </div>

                        </div>


                    </div>

                </div>
            </div>
        </form>
        </div>
    </div>
</body>

</html>