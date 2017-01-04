<%-- 
    Document   : ex2
    Created on : 3 janv. 2017, 14:53:14
    Author     : mdeschamps
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercice two</title>
    </head>
    <body>
        <h1 ALIGN=center>Objets implicites</h1>

        <div>
            <%
                out.println("<br>" + "Protocole implanté par le serveur : " + request.getProtocol());
                out.println("<br>" + "Protocole utilisé par le client : " + request.getScheme());
                out.println("<br>" + "Nom du serveur : " + request.getServerName());
                out.println("<br>" + "Port du serveur : " + request.getServerPort());
                out.println("<br>" + "Adresse IP du serveur : " + request.getRemoteHost());
                out.println("<br>" + "Adresse IP du client : " + request.getRemoteAddr());
                out.println("<br>" + "Méthode http : " + request.getMethod());
                out.println("<br>" + "Le nom de ce script : " + request.getRequestURL());
                out.println("<br>" + "Le répertoire java est : " + request.getPathTranslated());
            %>

        </div>
        
            <%@include file="footer.jsp" %> 
    </body>
</html>
