package bt1;

import java.util.Scanner;


public class bth1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
System.out.print("Nhap so dau tien :");
int a = scanner.nextInt();
System.out.print("Nhap so thu hai :");
int b = scanner.nextInt();
int Max ;
if(a>b) {
	Max = a;
} else {
	Max = b;
}
System.out.println("So lon nhat la : " + Max);
scanner.close();

	}

}
