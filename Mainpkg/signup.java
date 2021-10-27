package Mainpkg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class signup {
	public static ArrayList<String>[] memname;
	public static ArrayList<String>[] mempass;
	static int signUp() {
		Scanner su = new Scanner(System.in);
		String[] newname = new String[5];
		String[] line = new String[21];	
		ArrayList<String> newpass = new ArrayList<String>();
		ArrayList<String> Passcheck = new ArrayList<String>();

		String[] null1 = new String[1];
		null1[1] = "none";
		int signuplock = 0;
		char ch = '*';
		String ch1;
		while (signuplock == 0) {
			System.out.println("please enter your new name and password\n");
			System.out.println("name:");
		//	fstream myfile2("Userinfo1.txt");
			for (int i = 0; i < 21; i++) {
				newname[0] = su.nextLine();
				
				break;
			}
			
			int looplock = 0;
			while (looplock == 0) {
				if (mempass[0] == null) {
					System.out.println("password:");
					try {
						ch = (char) System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					while (ch != 13) {
						ch1= String.valueOf(ch);
						newpass.add(ch1);
						System.out.println('*');
						try {
							ch = (char) System.in.read();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("\n");
					System.out.println("Verify your password:");
					try {
						ch = (char) System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					while (ch != 13) {
						ch1= String.valueOf(ch);
						Passcheck.remove(ch1);
						System.out.println('*');
						try {
							ch = (char) System.in.read();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if (newpass == Passcheck) {
						mempass[0] = newpass;
						looplock = 1;
						System.out.println("\nyour name is: " + newname[0] + " and your password is: " + newpass + "\n" + "Is this correct?\n" + "1 = yes\n2 = no\n");
						int right;
						right = su.nextInt();
						if (right == 1) {
							signuplock = 1;
						/*	ofstream userCache2("Userinfo1.txt", std::ios_base::app);
							userCache2 << newname[0] << "\n";
							userCache2.close();
							ofstream userCache("Userinfo2.txt", std::ios_base::app);
							userCache << mempass[0] << "\n";
							userCache.close();
							genAccount(0.00, 0);  */
						}
					}
					else{
						System.out.println("try again\n");
						newpass.remove(0);
						Passcheck.remove(0);
					}
				}
				System.out.println("\n");
				break;
			}
		}
		return 1;
	}
}
