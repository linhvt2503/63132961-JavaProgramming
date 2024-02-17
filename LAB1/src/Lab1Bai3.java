/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab1Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập cạnh lập phương: ");
		double canh = scanner.nextDouble();
		double S = Math.pow(canh,3);
		System.out.printf("The tich cua khoi lap phương: %.2f", S );
	}

}
