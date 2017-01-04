<%-- 
    Document   : ex1
    Created on : 3 janv. 2017, 13:46:14
    Author     : mdeschamps
--%>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercice one</title>
    </head>
    <body>
        <h1 ALIGN=center >Jsp - Exercice - JSP Simple</h1>
        <%
            Date date = new Date();
            out.print("<h1><p ALIGN=center  > Il est précisement : ");
            out.print(date.toString() + "</P>");
            for (int i = 1; i < 7; i++) {
                out.println("<h" + i + " ALIGN=center>" + "Cool cette JSP est en affichage h " + i);
            }
        %>
        <h4 ALIGN=center>
            <a href="/Servlets/">Retour</a>
        </h4>
    </body>
</html>
