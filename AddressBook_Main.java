package bl.com.addressbooksystem200;

import java.util.Scanner;

public class AddressBook_Main {
	Address_Book addressbook = new Address_Book();
	Scanner sc = new Scanner(System.in);

	public void getmenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu of Address Book");
		boolean check = false;
		do {
			System.out.println("Enter Your Choice" + "\n1. Add Contact" + "\n2. Display Contact" + "\n3. Edit Contact"
					+ "\n4. Delete Contact");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				addressbook.addcontact();
				break;
			case 2:
				addressbook.displayContact();
				break;
			case 3:
				addressbook.editContact();
				break;
			case 4:
				addressbook.deletecontact();
				break;
			default:
				System.out.println("Enter the valid choice");
			}
		} while (!check);
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Address Book System");
		AddressBook_Main addressBook = new AddressBook_Main();
		addressBook.getmenu();
	}
}
