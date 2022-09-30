package bl.com.addressbooksystem200;

import java.util.Scanner;

public class Address_Book {
	private String firstname;
	private String lastname;
	private int mobilenumber;
	private String email;
	private String city;
	private String state;

	public void addcontact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name");
		firstname = sc.next();
		System.out.println("Enter the Last Name");
		lastname = sc.next();
		System.out.println("Enter the Mobile Number");
		mobilenumber = sc.nextInt();
		System.out.println("Enter the Email Address");
		email = sc.next();
		System.out.println("Enter the City");
		city = sc.next();
		System.out.println("Enter the State");
		state = sc.next();

	}

	

}
