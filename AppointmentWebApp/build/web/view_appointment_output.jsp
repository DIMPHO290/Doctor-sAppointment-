<%-- 
    Document   : view_appointment_output
    Created on : May 11, 2025, 12:06:24 AM
    Author     : dimph
--%>

<%@page import="java.util.List"%>
<%@page import="com.appointment.www.Appointment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Appointment Output</title>
    </head>
    <body>
        <h1>View Appointment Details</h1>
        
        <%
            List<Appointment> appointments = (List<Appointment>)request.getAttribute("appointments");
            
        %>
        
        <table border="1">
            
            <tr>
                <th>ID</th>
                <th>Patient Name</th>
                <th>Reason</th>
                <th>Payment Type</th>
                <th>Date</th>
                <th>Doctor's Name</th>
                <th>Current Date</th>
            </tr>
            <% for(Appointment a :appointments ){
            %>
            <tr>
                <td><%=a.getId()%></td>
                <td> <%=a.getPatientName()%> </td>
                <td> <%=a.getReason()%></td>
                <td>  <%=a.getPaymentType()%></td>
                <td> <%=a.getAppointmentDate()%></td>
                <td><%=a.getDoctorName()%></td>
                 
                <td> <%=a.getCurrentDate()%></td>
               
                
                
            </tr>
            <%
            }%>
        </table>
            
            
    </body>
</html>
