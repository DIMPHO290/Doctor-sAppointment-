<%-- 
    Document   : update_details
    Created on : May 11, 2025, 12:40:40 AM
    Author     : dimph
--%>

<%@page import="java.util.Date"%>
<%@page import="com.appointment.www.Appointment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Details</title>
    </head>
    <body>
        <h1>Edit the appointment details below</h1>
                  <%
         Appointment appointment = (Appointment)request.getAttribute("appointment");
         
         if(appointment !=null){
         %>
         <p>
             <b><%=appointment.getPatientName()%></b> 's application was successfully update
         </p>
         <%
             
         }else{

            %>
            <h3>Appointment ID is not found!</h3>
            <%
         }
        %>
    
        <ul>
            <li><a href="menu.html">Menu Page</a></li>
        </ul>
    </body>
</html>
