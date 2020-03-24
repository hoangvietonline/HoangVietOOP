package bai7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author HoangViet
 * Catch the case when the user enters an incorrect value with the data type declaration.
 */
public class baitap3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter number integer");
			int number = sc.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}
}
