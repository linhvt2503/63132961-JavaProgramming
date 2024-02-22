/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		menu();
	}
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("+----------------------------------------------+");
			System.out.println("1. Giải phương trinhg bậc nhất");
			System.out.println("2. Giải phương trinhg bậc 2");
			System.out.println("3. Tính tiền điện");
			System.out.println("4. Kết thúc");
			System.out.println("+----------------------------------------------+");
			System.out.printf("Chọn chức năng: ");
			int chon = scanner.nextInt();
		}
	}
	public static void PTB1() {
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
	public static void PTB2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập hệ số c: ");
		double c = scanner.nextDouble();
		if(a == 0) {
			double x = -b/a;
			System.out.printf("Nghiệm phương trình: %.2f", x);
		}
		else{
			double denta = b*b - 4*a*c;
			if(denta < 0)
				System.out.printf("Vô nghiệm");
			else if(denta == 0)
				System.out.printf("Nghiệm kép: %.2f",-b/2*a);
			else if(denta > 0) {
				System.out.printf("Nghiệm kép: \n");
				double x1 = (-b + Math.sqrt(denta))/(2*a);
				double x2 = (-b - Math.sqrt(denta))/(2*a);
				System.out.printf("X1 = %.2f \n",x1);
				System.out.printf("X2 = %.2f",x2);
			}
		}
	}
	public static void tinhTienDien() {
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
