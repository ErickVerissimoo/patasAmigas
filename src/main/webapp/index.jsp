

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form method="post" action="/api/login">
            <h1>Login</h1><br>
            <label for="email">Email: </label><br>
            <input  type="email" name="email"><br>
            <label for="senha">Senha: </label><br>
            <input name="senha" type="password"><br>
            <button type="submit">Entrar</button><br>
        </form>
    </body>
</html>
