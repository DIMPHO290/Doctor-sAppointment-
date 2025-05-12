package com.appointment.www;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-12T21:10:39")
@StaticMetamodel(Appointment.class)
public class Appointment_ { 

    public static volatile SingularAttribute<Appointment, String> patientName;
    public static volatile SingularAttribute<Appointment, String> reason;
    public static volatile SingularAttribute<Appointment, String> doctorName;
    public static volatile SingularAttribute<Appointment, Date> currentDate;
    public static volatile SingularAttribute<Appointment, Long> id;
    public static volatile SingularAttribute<Appointment, Date> appointmentDate;
    public static volatile SingularAttribute<Appointment, String> paymentType;

}