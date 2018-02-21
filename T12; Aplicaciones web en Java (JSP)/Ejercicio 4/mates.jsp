<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
      <%
      double nota1 = Double.parseDouble(request.getParameter("nota1"));
      double nota2 = Double.parseDouble(request.getParameter("nota2"));
      double nota3 = Double.parseDouble(request.getParameter("nota3"));
      double resultado = ((nota1 + nota2 + nota3) / 3);
      %>
      <br>
      <br>
      La media de los números introducidos (<%= nota1%>, <%= nota2%>, <%= nota3%>) es <%= resultado%>
  </body>
</html> 

