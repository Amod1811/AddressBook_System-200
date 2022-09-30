package bl.com.addressbooksystem200;

import java.util.Scanner;

public class Address_Book {
	Contact_Person contact;
	private String firstname;
	private String lastname;
	private String mobilenumber;
	private String email;
	private String city;
	private String state;

	public void addcontact() {
		contact = new Contact_Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name");
		firstname = sc.nextLine();
		System.out.println("Enter the Last Name");
		lastname = sc.nextLine();
		System.out.println("Enter the Mobile Number");
		mobilenumber = sc.next();
		System.out.println("Enter the Email Address");
		email = sc.next();
		System.out.println("Enter the City");
		city = sc.next();
		System.out.println("Enter the State");
		state = sc.next();
		
		contact.setFirstname(firstname);
        contact.setLastname(lastname);
        contact.setCity(city);
        contact.setState(state);
        contact.setMobilenumber(mobilenumber);
        contact.setEmail(email);
        System.out.println(contact);

	}

	public void displayContact() {
		String firstname1 = contact.getFirstname();
		System.out.println("First Name:" + firstname1);
		String lastname1 = contact.getLastname();
		System.out.println("Last Name:" + lastname1);
		String mobile = contact.getMobilenumber();
		System.out.println("Mobile Number:" + mobile);
		String city1 = contact.getCity();
		System.out.println("City Name:" + city1);
		String state1 = contact.getState();
		System.out.println("State Name:" + state1);
		String email1 = contact.getEmail();
		System.out.println("Email Address:" + email1);
		
	}

	public void editContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter original Name to Edit");
		String editName = sc.next();
		if(editName.equalsIgnoreCase(firstname)){
			addcontact();
		}
		else {
			System.out.println("Invalid first name");
			System.out.println("Please Enter Valid First Name");
			System.out.println();
			editContact();
		}
	}

	public void deletecontact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter original Name to Delete");
		String deleteName = sc.next();
		
		if(deleteName.equals(contact.getFirstname())) {
			contact.setFirstname(null);
	        contact.setLastname(null);
	        contact.setCity(null);
	        contact.setState(null);
	        contact.setMobilenumber(null);
	        contact.setEmail(null);
	        System.out.println("Contact deleted Successfully");
	        System.out.println();
		}else {
			System.out.println("Invalid first name");
			System.out.println("Please Enter Valid First Name");
			System.out.println();
			deletecontact();
		}
	}
}
