package gitProject;

import java.util.Scanner;

import contactAndHelpMenu.contactAndHelpMenu;
import loginMenu.loginMenu;
import signUpMenu.signUpMenu;

public class mainMenu {

	public static void main(String[] args) {

		// Display menu
		System.out.println("============================");
		System.out.println("|         PINKPLANNR       |");
		System.out.println("============================");
		System.out.println("|           MENU           |");
		System.out.println("============================");
		System.out.println("| Options:                 |");
		System.out.println("|      1. Sign up          |");
		System.out.println("|      2. Log in           |");
		System.out.println("|      3. Contact & Help   |");
		System.out.println("|      0. Exit             |");
		System.out.println("============================");
		menuChoice();
	}

	public static void menuChoice() {
		loginMenu loginmenu = new loginMenu();
		signUpMenu signupmenu = new signUpMenu();
		contactAndHelpMenu contactAndHelp = new contactAndHelpMenu();

		System.out.println(" Select option: ");
		Scanner scanner = new Scanner(System.in);
		int initialValue = scanner.nextInt();

		// Switch construct
		switch (initialValue) {
		case 1:
			signUpMenu.SignUpMain(null);

			break;
		case 2:
			loginMenu.loginMain(null);
			break;
		case 3:
			contactAndHelp.contactMain(null);
			break;
		case 0:
			System.out.println("Goodbye!");
			break;
		default:

			System.out.println("Invalid selection");
			break;
		}
	}
}
