

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
	
	public static List <Appointment> appointmentList;
	
	appointmentList = new ArrayList<Appointment>();
	
	public static boolean
	for (Appointment appointment : appointmentList) {
		if (appointment.getApptId().equals(apptId)) {
			return false;
		}
	}
	appointmentList.add(new Appointment);
	return true;
	}

public Appointment deleteAppt(String apptId) {
	for (int i = 0; i < appointmentList.size(; i++)) {
		if (appointmentList.get(i).getApptId().equals(apptId)) {
			Appointment appointment = appointmentList.get(i);
				appointmentList.remove(i);
			return appointment;
		}
	}
	return null;
	}
}



