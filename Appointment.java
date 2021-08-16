

import java.util.Date;

public class Appointment {

	
		private String apptId;
		private Date date;
		private String description;
		
		public void Appointment (String apptId, Date date, String description) {
			this.apptId = apptId;
			this.date = date;
			this.description = description;
			
			
		}
		
		public String getApptId() {
			return apptId;
		}
		public void setApptId(String apptId) {
			if ((apptId.length()> 10 || apptId == null)) {
				throw new IllegalArgumentException("Invalid Appointment ID");
			}
			this.apptId = apptId;
			
		}
		
		public Date getDate() {
			return date;
		}
		
		public void setDate (Date date) {
			Date currentDate = new Date();
				if((!currentDate.before(date))) {
					throw new IllegalArgumentException("Invalid Date");
				}
				this.date = date;
		}
		public String getDescription() {
			return description;
		}
		
		public void setDescription (String description) {
			if((description.length() > 50 || description == null)) {
				throw new IllegalArgumentException("Invalid Description (Too Many Characters");
			}
			this.description = description;
		}

	}


}
