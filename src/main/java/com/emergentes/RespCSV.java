package com.emergentes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespCSV", urlPatterns = {"/RespCSV"})
public class RespCSV extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("application/csv");
       response.setHeader("Content-Disposition", "attachment; filename=NicolCarlaCM.csv");
       PrintWriter out = response.getWriter();
       try{
           out.println("id;nombre;apellidos");
           out.println("1;NICOL CARLA;COHI MUÑOZ");
       } finally {
           out.close();
       }
    }
}

