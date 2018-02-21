<%-- 
  3. Escribe una aplicación que pida tu nombre. A continuación mostrará “Hola” seguido del nombre
  introducido. El nombre se deberá recoger mediante un formulario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 3</title>
  </head>
  <body>
    <form action="saludos.jsp" method="get" accept-charset="utf-8">
      <br>
			<p>Introduce tu nombre:</p>
      <input type="text" name="nombre" value="">
      <input type="submit" name="Entrar" value="Enviar datos" url="saludo.jsp">      
    </form>
  </body>
</html>
