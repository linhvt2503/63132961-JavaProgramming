/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Lab2Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Cạnh thứ nhất: ");
		double canhA = scanner.nextDouble();
		System.out.print("Cạnh thứ hai: ");
		double canhB = scanner.nextDouble();
		System.out.printf("Chu vi = %.1f %n", (canhA+canhB)*2);
		System.out.printf("Diện tích = %.1f %n", canhA*canhB);
		System.out.printf("Cạnh nhỏ nhất = %.1f", Math.min(canhA, canhB));
	}

}
