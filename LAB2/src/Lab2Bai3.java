/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện đã sử dụng của tháng: ");
		double soDien = scanner.nextDouble();
		if(soDien < 50) {
			double tien = soDien * 1000;
			System.out.printf("Tiền: %.2f",tien);
		}else {
			double tien = 50 * 1000 + (soDien - 50)*1200;
			System.out.printf("Tiền: %.2f",tien);
		}
	}

}
