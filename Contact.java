

public class Contact {

	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String Address;
	
	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String Address) {
		
		if (contactId == null || contactId.length()>10) {
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if (phoneNumber == null || phoneNumber.length()>10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if (Address == null || Address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.Address = Address;
		
	}
	
	public String getcontactId() {
		return contactId;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getphoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	
}
