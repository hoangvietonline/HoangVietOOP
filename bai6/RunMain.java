package bai6;

import java.util.Scanner;
/**
 * 
 * @author HoangViet
 * Create class runmain
 */
public class RunMain {
	public static void main(String[] args) {
		boolean a = true;
		ManagerFunction managerFunction = new ManagerFunction();
		Scanner sc = new Scanner(System.in);
		while (a) {
			managerFunction.printMenu();
			try {
				int choose = sc.nextInt();
				switch (choose) {
				case 1:
					try {
						System.out.println("Enter 1 - input Employee | 2 - input teacher");
						int select = sc.nextInt();
						switch (select) {
						case 1:
							managerFunction.inputEmployee(sc);
							break;
						case 2:
							managerFunction.inputTeacher(sc);
							break;
						default:
							break;
						}
					} catch (Exception e) {
						System.out.println("Please enter again!");
						sc.nextLine();
					}
					break;
				case 2:
					managerFunction.showPayrollList();
					break;
				case 3:
					managerFunction.showPersonHighestSalary();
					break;
				case 4:
					managerFunction.showTotalSalary();
					break;
				case 5:
					a = false;
					break;
				}
			} catch (Exception e) {
				System.out.println("Please choose from 1 to 5");
				sc.nextLine();
			}
		}
	}
}
