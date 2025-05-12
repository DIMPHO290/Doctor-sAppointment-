/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appointment.www.web;

import com.appointment.www.Appointment;
import com.appointment.www.AppointmentFacadeLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dimph
 */
public class FindAppointmentServlet extends HttpServlet {
    @EJB AppointmentFacadeLocal afl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Long id = Long.parseLong(request.getParameter("id"));
        String docName = request.getParameter("docName");
        
        Appointment appointment = afl.find(id);
        
         if(appointment != null)
        {
          appointment.setDoctorName(docName);
          afl.edit(appointment);
        }
        request.setAttribute("appointment", appointment);
        
        RequestDispatcher disp = request.getRequestDispatcher("update_details.jsp");
        disp.forward(request, response);
        
    }

}
