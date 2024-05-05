
package com.mycompany.evidencia.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SvIndex")
public class SvIndex extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Puedes realizar cualquier operación adicional aquí si es necesario
        
        // Redirigir al archivo JSP correspondiente
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Puedes realizar cualquier operación adicional aquí si es necesario
        
        // Redirigir al archivo JSP correspondiente
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
