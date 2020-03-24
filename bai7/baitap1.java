package bai7;

/**
 * 
 * @author Hoangviet 
 * Catch exception divided by 0
 */
public class baitap1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			int c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("exception divided by zero");
		}
	}
}
