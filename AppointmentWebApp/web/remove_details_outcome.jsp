<%-- 
    Document   : remove_details_outcome
    Created on : May 11, 2025, 1:22:54 AM
    Author     : dimph
--%>

<%@page import="com.appointment.www.Appointment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>Delete Details Outcome Page</title>
    </head>
    <body>
                <%
         Appointment appointment = (Appointment)request.getAttribute("appointment");
         
         if(appointment !=null){
         %>
         <p>
             <b><%=appointment.getPatientName()%></b> 's application was successfully removed
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
