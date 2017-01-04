/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import test.dates.JspCalendar;

/**
 *
 * @author Matthieu
 */
@WebServlet(name = "ex3", urlPatterns = {"/ex3"})
public class ex3 extends HttpServlet {

    public ex3() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        JspCalendar calendrier = new JspCalendar();
        request.setAttribute("calendrier", calendrier);
        this.getServletContext().getRequestDispatcher("/WEB-INF/ex3.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
