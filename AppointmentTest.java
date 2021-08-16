package test;

import static org.junit.Assert.assertEquals;
import java.util.Calendar;
import java.util.Date;
import com.AppointmentService.Appointment;


public class AppointmentTest {
	Date date = new Date(2021, Calendar.AUGUST,7);
	appointment.Appointment appointment = new Appointment("123456789", date, "Scheduled Appt");
	
	/* test to check apptId */
	public void testApptId() {
		String validApptId = "123456789";
		appointment.setApptId(validApptId);
		assertEquals(validApptId, appointment.getApptId());
		
	}
	
	public void testApptId2() {
		
		try {
			String validApptId = "123456789111";
			appointment.setApptId(validApptId);
			
		} catch (IllegalArgumentException message) {
			assertEquals("Invalid", message.getMessage());
		}
	}
	
	// same tests can be run for date and description//

	
}
