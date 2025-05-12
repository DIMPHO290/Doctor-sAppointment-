/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appointment.www.web;

import com.appointment.www.Appointment;
import com.appointment.www.AppointmentFacadeLocal;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.persistence.metamodel.SetAttribute;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dimph
 */
public class GetAllAppointmentServlet extends HttpServlet {
    @EJB AppointmentFacadeLocal apl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Appointment> appointments = apl.findAll();
        
        
        request.setAttribute("appointments", appointments);
        
        RequestDispatcher disp = request.getRequestDispatcher("view_appointment_output.jsp");
        disp.forward(request, response);
   
    }

}
