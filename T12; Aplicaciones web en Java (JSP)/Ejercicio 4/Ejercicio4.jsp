<%-- 
  3. Escribe una aplicación que pida tu nombre. A continuación mostrará “Hola” seguido del nombre
  introducido. El nombre se deberá recoger mediante un formulario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 4</title>
  </head>
  <body>
    <form action="mates.jsp" method="get" accept-charset="utf-8">
      <p>Introduce tres valores y te haré la media: </p>
      <br>
      <input type="number" min="0" max="10" name="nota1">
      <input type="number" min="0" max="10" name="nota2">
      <input type="number" min="0" max="10" name="nota3">
      <input type="submit" name="Entrar" value="Enviar datos">      
    </form>
  </body>
</html>
