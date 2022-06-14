package loginMenu;

import java.util.Scanner;

public class loginMenu {

	public static void loginMain(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("============================");
		System.out.println("|          LOG IN          |");
		System.out.println("============================");
		System.out.println("|       Please, enter      |");
		System.out.println("|     your info:           |");
		System.out.println("|--------------------------|");
		System.out.println("|    Username or  E-mail:  |");
		String username = scanner.nextLine();
		System.out.println("|       Password:          |");
		String password = scanner.nextLine();
		System.out.println("============================");
		System.out.println("Welcome, " + username + " !");
	}

}
