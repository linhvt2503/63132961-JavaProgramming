/**
 * 
 */

import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		System.out.printf("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		if(a == 0) {
			if(b == 0) {
				System.out.printf("Vô số nghiệm");
			}
			else {
				System.out.printf("Vô nghiệm");
			}
		}
		else {
			double x = -b/a;
			System.out.printf("Nghiệm của phương trình: %.2f", x);
		}
	}

}
