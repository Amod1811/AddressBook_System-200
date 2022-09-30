package bl.com.addressbooksystem200;

public class Contact_Person {
	private String firstname;
	private String lastname;
	private int mobilenumber;
	private String email;
	private String city;
	private String state;
	public Contact_Person(String firstname, String lastname, int mobilenumber, String email, String city,
			String state) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobilenumber = mobilenumber;
		this.email = email;
		this.city = city;
		this.state = state;
		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Contact_Person [firstname=" + firstname + ", lastname=" + lastname + ", mobilenumber=" + mobilenumber
				+ ", email=" + email + ", city=" + city + ", state=" + state + "]";
	}
}
