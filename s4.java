package btnangcao;
import java.util.Scanner;
public class s4 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Nhập một số nguyên: ");
		        int number = scanner.nextInt();

		        int sum = 0;

		        while (number != 0) {
		            sum += number % 10;
		            number /= 10;
		        }

		        System.out.println("Tổng các chữ số là: " + sum);
		    }
		}


		   