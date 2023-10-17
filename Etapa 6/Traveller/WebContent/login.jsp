<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
        integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />


    <title>Gulliver Traveller - Login</title>
</head>

<body>
    <main id="containerLogin">
        <form id="login_form" method="post" action="./login">
            <div id="form_header">
                <h1>Login</h1>
                <i id="mode_icon" class="fa-solid fa-moon"></i>
            </div>

            <div id="social_media">
                <a href="">
                    <img src="images/facebook.png" alt="Facebook Logo">
                </a>
                <a href="">
                    <img src="images/google.png" alt="Google Logo">
                </a>
                <a href="">
                    <img src="images/github.png" alt="Github Logo">
                </a>
            </div>

            <div id="inputs">
                <div class="input-box">
                    <label for="email">
                        E-mail
                        <div class="input-fieldLogin">
                            <i class="fa fa-envelope"></i>
                            <input type="email" id="email" name="email">
                        </div>
                    </label>
                </div>

                <div class="input-box">
                    <label for="password">
                        Senha
                        <div class="input-fieldLogin">
                            <i class="fa fa-key"></i>
                            <input type="password" id="senha" name="senha">
                        </div>
                    </label>

                    <div id="forgot_password">
                        <a href="#">
                            Esqueçeu sua senha?
                        </a>
                    </div>
                </div>
            </div>


            <button type="submit" id="login_button">
                Login
            </button>
            
        <a href="cadastro.jsp">
            <button type="button" id="cadastro_button">
                Cadastre-se
            </button>
        </a>
        </form>
    </main>




    <script src="js/darkmode.js"></script>
</body>

</html>