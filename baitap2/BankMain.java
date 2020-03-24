package baitap2;

import java.util.Scanner;

/**
 * 
 * @author Hoangviet 
 * create class BankMain
 */
public class BankMain {
	public static void main(String[] args) {
		AcountBank acountBank = new AcountBank();
		boolean a = true;
		Scanner sc = new Scanner(System.in);
		while (a) {
			acountBank.printMenu();
			try {
				int choose = sc.nextInt();
				switch (choose) {
				case 1:
					System.out.println("Enter money deposit");
					sc.nextLine();
					acountBank.deposit(sc.nextFloat());
					break;
				case 2:
					System.out.println("Enter money withdraw");
					try {
						sc.nextLine();
						acountBank.withdraw(sc.nextFloat());
					} catch (BankingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("please enter again!!!");
				sc.nextLine();
			}
		}
	}
}
