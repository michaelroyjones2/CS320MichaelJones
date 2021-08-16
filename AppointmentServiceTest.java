package test;

import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.Date;
import org.junit.Test;
import com.Appointment.Appointment;
import com.Appointment.AppointmentService;

public class AppointmentServiceTest {
	Date date = new Date(2021, Calendar.AUGUST, 7);

	
	public void addApptTest() {AppointmentService appointmentService = new AppointmentService ("123456789", date, "Scheduled");
		assertEquals(true,AppointmentService.addAppt("123456789",date, "Scheduled"));
		}
	
	public void addApptTest2() {AppointmentService appointmentService = new AppointmentService ("123456789", date, "Scheduled");
		boolean result = appointmentService.addAppt("123456789", date, "Scheduled");
			assertTrue(result);
	}
	
	public void deleteApptTest() {AppointmentService appointmentService = new AppointmentService ("123456789", date, "Scheduled");
		Appointment a = appointmentService.deleteAppt("123456789");
			assertTrue(a == null);
			}
	
	public void deleteApptTest2() {AppointmentService appointmentService = new AppointmentService ("123456789", date, "Scheduled");
		boolean result = appointmentService.addAppt("123456789", date, "Scheduled");Appointment a = appointmentService.deleteAppt("123456789");
			assertTrue(a != null);
			}
}
