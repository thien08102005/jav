package bt1;
import java.util.Scanner;
public class bt8 {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);        

	        int sum = 0;        
	        while (true) {
	            System.out.print("Nhập một số nguyên: ");
	            int num = scanner.nextInt();                       
	            sum += num;
	            
	            if (num % 4 == 0) {
	                break;
	            }
	        }
	            
	        System.out.println("Tổng các số nhập vào là: " + sum);     
	        scanner.close();
	    }
	}