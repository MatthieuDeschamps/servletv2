<%-- 
    Document   : bonjour
    Created on : 2 janv. 2017, 13:44:51
    Author     : mdeschamps
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bonjour</title>
    </head>
    <body>
        <h1 ALIGN='center'>Hello World!</h1>

        


        <%--Expression Language (EL) rempace toute les ligne de code java!!!
        dans ce cas on fais un test si "name" est empty(vide) on renvoie rien 
        avec une condition ternaire
        <p>
            Bonjour Monsieur ${ empty name ? '' : name }  
        </p>
        --%>
        
        
        <%-- Ancienne méthode pour affichage sans EL    
        <p> String name = (String) request.getAttribute("name");
        out.println(name);
        </p>
        --%>


        <%-- Expression Language avec affichage Tableau
        <p> ${ nomis[1] }</p>
        --%>
        
        <p ALIGN='center'>
            Bonjour ${ auteur.prenom } ${ auteur.nom }
        </p>
        <p ALIGN='center'> ${ auteur.actif ? 'Bravo tu écris encore' : 'Au placart'}</p>
       
        <h4 ALIGN=center>
            <a href="/Servlets/">Retour</a>
        </h4>
    </body>
</html>
