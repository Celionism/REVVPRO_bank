package Mainpkg;
import Mainpkg.login;
import Mainpkg.customerMenu;
import java.util.Scanner; 
public class MainPage {
	public static void main(String arg[]) {
			int entry = 0;
			int menu1 = 0;
			int menustop = 0;
Scanner s = new Scanner(System.in);
			System.out.println("Hello and welcome\n");
			while (menustop == 0) {
				System.out.println("Would you like to\n");
				
				System.out.println("1: login\n");
				
				System.out.println("or \n");
				
				System.out.println("2: signup\n");
				
				System.out.println("selection:");
				menu1 = s.nextInt();
				System.out.println("");
				if (menu1 == 1) {
					if (login.login() == 1) {
						System.out.println("\nSuccessful Login!\n");
						customerMenu.CustomerMenu();
					}
					menustop = 1;
				}
				else if (menu1 == 2) {
					/*if (signUp() == 1) {
						System.out.println("\nSuccessful Signup!\n");
						customerMenu.CustomerMenu();
					} */
					menustop = 1;
				} 
				else if (menu1 == 1029384756) {
					
					int ConsoleLock = 0;
					String Dcommand;
					String consolename = "Terminal";
					System.out.println(15 + '\n');
					System.out.println( setw.setw(15) + "Dev terminal accessed\n\n");
					while (ConsoleLock==0) {
						System.out.println(consolename + ":: ");
					 Dcommand = s.nextLine();
						//Ucommand(Dcommand);
						if (entry == 3) {
							ConsoleLock =1;
							
						}
						else if (entry == 4) {
							ConsoleLock =2;
							
						}
						else if (entry == 2) {
							System.out.println("enter a new console name: ");
							consolename = s.nextLine();
						}
					}
					while (ConsoleLock == 1) {
						System.out.println(consolename + "> ");
						Dcommand = s.nextLine();
					//	DCommand(Dcommand);
						if (entry == 5) {
							ConsoleLock = 2;
							
						}
					}
				}
				else if (menu1 != 1 && menu1 != 2) {System.out.println("enter a valid answer\n"); }
			}

			
		
	}

}
