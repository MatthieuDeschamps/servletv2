
package test.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import test.beans.Auteur;

@WebServlet(name = "Test", urlPatterns = {"/Test"})
public class Test extends HttpServlet {

   
    public Test(){
        super();
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
        --- Premier test avec nom deans URL ---
        String name = request.getParameter("name");
        request.setAttribute("name", name);
        
        --- Deuxieme test avec Tableau ---
        String[] noms = {"Serge","Ludo","Max"};
        request.setAttribute("nomis", noms);
        
        */
        Auteur auteur = new Auteur();
        auteur.setPrenom("Matthieu");
        auteur.setNom("Deschamps");
        auteur.setActif(Boolean.TRUE);
        request.setAttribute("auteur", auteur);
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    

}
