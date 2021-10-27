package Mainpkg;

import java.util.Scanner; 
public class login {
	static int login() {
		String name, pass, line;
		char ch;
		int loginname = 0, Loginsuccess = 0, linenum = 0;
		int Id = 0, Ba = 0;
		Scanner n = new Scanner(System.in);
		System.out.println("please enter your name and password\n");
		while (loginname == 0) {
			System.out.println("\nname:");
			 name = n.nextLine();
//should be implemented in java with a databse
		/*	ifstream myfile2("Userinfo1.txt");
			for (int lineno = 0; getline(myfile2, line) && lineno < 21; lineno++) {

				if (line == name)
				{
					loginname = 1;
					Ba = lineno;
					break;
				}
			}
			myfile2.close(); */
			Ba = Ba + 1;
			System.out.println("password:");
			boolean found = false;

			//ifstream input("Userinfo2.txt", ios::app);
			
//obfuscation needs to be turned into java
			
			/*
			int line_no = 0;
			ch = _getch();
			while (ch != 13) {
				pass.push_back(ch);
				cout << '*';
				ch = _getch();
			}
			while (line_no != 21 && getline(input, line)) {
				++line_no;
				if (line_no == Ba) {
					break;
					cout << "oog\n";
				}
				else {
					cout << "\nTry again: \n";
				}
			}
 */
		} 
		return 1;

	}
}
