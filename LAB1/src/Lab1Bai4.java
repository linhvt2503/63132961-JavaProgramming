/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab1Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập a: ");
		double a = scanner.nextDouble();
		System.out.printf("Nhập b: ");
		double b = scanner.nextDouble();
		System.out.printf("Nhập c: ");
		double c = scanner.nextDouble();
		double Delta = Math.pow(b,2) - 4 * a * c;
		System.out.printf("Can bậc hai của Delta: %.2f", Math.sqrt(Delta));
	}

}
