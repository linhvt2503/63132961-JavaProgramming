/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
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
}
