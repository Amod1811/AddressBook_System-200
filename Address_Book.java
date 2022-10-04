package bl.com.addressbooksystem200;

import java.util.ArrayList;
import java.util.Scanner;

public class Address_Book {
	Contact_Person contact;
	private String firstname;
	private String lastname;
	private String mobilenumber;
	private String email;
	private String city;
	private String state;
	Contact_Person contactp = new Contact_Person();
	ArrayList<Contact_Person> person = new ArrayList<Contact_Person>();

	public void addcontact() {

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
		person.add(new Contact_Person(firstname, lastname, mobilenumber, email, city, state));
		System.out.println(person);

	}

	public void displayContact() {
		System.out.println("Contact of Address Book" + person.size());
		if (person.isEmpty()) {
			System.out.println("Contact not Available");
		} else {
			for (int i = 0; i < person.size(); i++) {
				System.out.println(person.get(i));
				System.out.println();
			}
		}
	}

	public void editContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter original Name to Edit");
		String editName = sc.next();
		if (person.isEmpty()) {
			System.out.println("Contact list is Empty");
		} else {
			for (int i = 0; i < person.size(); i++) {
				String firstname = person.get(i).getFirstname();
				
				if (firstname.equalsIgnoreCase(editName)) {
					
					System.out.println("Enter the First name");
					firstname = sc.next();
					System.out.println("Enter the Last Name");
					lastname = sc.next();
					System.out.println("Enter the Mobile Number");
					mobilenumber = sc.next();
					System.out.println("Enter the Email Address");
					email = sc.next();
					System.out.println("Enter the City");
					city = sc.next();
					System.out.println("Enter the State");
					state = sc.next();

					person.get(i).setFirstname(firstname);
					person.get(i).setLastname(lastname);;
					person.get(i).setMobilenumber(mobilenumber);
					person.get(i).setEmail(email);
					person.get(i).setCity(city);
					person.get(i).setState(state);
					System.out.println();
					System.out.println(person.get(i));
					System.out.println();
				} else {
					System.out.println("Invalid first name");
					System.out.println("Enter valid Name");
					System.out.println();
				}
			}
		}
	}

	public void deletecontact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter original Name to Delete");
		String deleteName = sc.next();
		
		if(person.isEmpty()) {
			System.out.println("Contact list is Empty");
		}else {
			for(int i =0; i < person.size(); i++) {
				firstname = person.get(i).getFirstname();
				if(deleteName.equalsIgnoreCase(firstname)) {
					person.remove(i);
					System.out.println();
					System.out.println("Contact deleted Succesfully");
				}else {
					System.out.println("Enter valid Name");
				}
			}
		}
	}
}
