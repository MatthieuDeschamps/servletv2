<%-- 
    Document   : ex3
    Created on : 4 janv. 2017, 13:13:52
    Author     : Matthieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="test.dates.*"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <h1  align="center"> Calendrier </h1>
    <body>
        <ul>
            <li> Le jour du mois est : ${ calendrier.getDayOfMonth() }</li>
            <li> L'année est : ${ calendrier.getYear() }</li>
            <li> Le mois de l'année en cours est : ${ calendrier.getMonth() }</li>
            <li> L'heure est : ${ calendrier.getTime() }</li>
            <li> Aujourd'hui c'est : ${ calendrier.getDay() }</li>
            <li> Nous sommes à la semaine : ${ calendrier.getWeekOfYear() }</li>
        </ul>
        
        <%@include file="footer.jsp" %> 
    </body>
</html>
