/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hanzh
 */
public class LoginServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        // get the parameters from the URL
        String ageString = request.getParameter("age");
       

        // set the JSP request variables to the values first name and last name
       
        
        if (ageString == null || ageString.trim().isEmpty()) 
        {
            request.setAttribute("message", "Please enter a valid number");

            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            
            return;
        }
        try
        {
            int ageNumber = Integer.parseInt(ageString);
            request.setAttribute("age", ageString);
            request.setAttribute("message", "Your age next will be "+(ageNumber+1));
        
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        }
        catch (NumberFormatException e)
        {
            request.setAttribute("message", "You must enter an integer.");
            
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").
                forward(request, response);
        }
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
    }
 

}
