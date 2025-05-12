package com.appointment.www.web;

import com.appointment.www.Appointment;
import com.appointment.www.AppointmentFacadeLocal;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddAppointmentServlet extends HttpServlet {

    @EJB
    AppointmentFacadeLocal afl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String option = request.getParameter("op");
        
        
        if(option.equals("add")){
          
        try {
            Long id = Long.parseLong(request.getParameter("id"));
            String patientName = request.getParameter("patientName");
            String reason = request.getParameter("reason");
            String paymentType = request.getParameter("payment");
            String date = request.getParameter("date");
            String docName = request.getParameter("docName");

            SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
            Date date1 = sd.parse(date);
            
            Appointment appointment = createAppointment(id ,patientName,reason,paymentType,docName,date1);
            
            afl.create(appointment);
            
            RequestDispatcher disp = request.getRequestDispatcher("appointment_output.jsp");
            disp.forward(request, response);
            
        } catch (ParseException ex) {
            Logger.getLogger(AddAppointmentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }

    private Appointment createAppointment(Long id ,String patientName, String reason, String paymentType, String docName, Date date1) {
        Appointment appointment = new Appointment();
        
        appointment.setId(id);
        appointment.setPatientName(patientName);
        appointment.setReason(reason);
        appointment.setPaymentType(paymentType);
        appointment.setDoctorName(docName);
        appointment.setAppointmentDate(new Date());
        appointment.setCurrentDate(new Date());
        
        return appointment;
    }

}
