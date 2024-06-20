package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

	public static void main(String args[]) {
		User user = new User(null, null, null);
		PhoneBookImpl phoneBookImpl = new PhoneBookImpl();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {
			System.out.println("Choose an option:");
			System.out.println("1. Add a new User");
			System.out.println("2. Search by Email");
			System.out.println("3. Search by Phone Number");
			System.out.println("4. Search by Name");
			System.out.println("5. Delete by Name");
			System.out.println("6. Edit by Name");
			System.out.println("7. Exit");
			int option = 7;
			try {
				option = scanner.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println("Invalid option. Please rerun the application.");
			}
			switch (option) {
			case 1:
				phoneBookImpl.addNewUser();
				break;
			case 2:
				phoneBookImpl.searchUserByEmail();
				break;
			case 3:
				phoneBookImpl.searchUserByPhoneNumber();
				break;
			case 4:
				phoneBookImpl.searchUserByName();
				break;
			case 5:
				phoneBookImpl.deleteUserByName();
				break;
			case 6:
				phoneBookImpl.editUserByName();
				break;
			case 7:
				exit = true;
				break;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
	}

}
