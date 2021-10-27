package Mainpkg;
import Mainpkg.setw;
import java.util.Scanner; 
public class customerMenu {
	
	static int CustomerMenu() {
		String optionm = "";
		printMenu(optionm);  
		return 1;
	}

static void printMenu(String In)
{
Scanner opt = new Scanner(System.in);
	System.out.println("\n Options " + setw.setw(10) + " number " + setw.setw(0) + ": " + "\n");
	System.out.println("---------------------------------------\n");
	System.out.println(" Transfer " + setw.setw(9) + " 1 " + setw.setw(0) + ": " + "\n");
	System.out.println(" balance " + setw.setw(10) + " 2 " + setw.setw(2) + ": " + "\n");
	System.out.println(" Withdraw " + setw.setw(9) + " 3 " + setw.setw(0) + ": " + "\n");

	while (1 == 1) {
		System.out.println("\n Enter choice as a word: " + setw.setw(1) + " " + setw.setw(0));
		System.out.println("\n _______ \r");
		In = opt.nextLine();
		if (In == "Transfer" || In == "transfer" || In == "TRANSFER") {
	//		ifstream myfile3("AcctID.txt");    <- to be implemented in java
			int lineID = 0;
			float transfer;
			String line, AcctID;
			/*	for (int lineno = lineID; getline(myfile3, line) && lineno < 21; lineno++) {
				if (line == AcctID) {
					System.out.println("Enter a transfer ammount");
					transfer = opt.nextFloat();
					break;
				}
				else {
					System.out.println("");
				}
			}
			myfile3.close(); */
		}
		else if(In == "Balance" || In == "balance" || In == "BALANCE") {
			accounts.balance();  // will be made soon
		}
		else if (In == "Withdraw" || In == "withdraw" || In == "WITHDRAW") {
			System.out.println("okay here have some money:\n");
		
		}
		else if (In == "Exit" || In == "exit" || In == "EXIT") {
			break;
		}
		else { System.out.println("Please enter a valid response\n"); }
	}
}

}