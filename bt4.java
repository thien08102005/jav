package bt1;
import java.util.Scanner;
public class bt4 {

	public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);
System.out.print("nhap so nguyen duong ");
int N = scanner.nextInt();
if(N<=0) {
	System.out.print("gia thua khong ton tai voi so am");
}
long giaithua=1;
for(int i=1; i<=N; i++) {
	giaithua *=i;
	
}
System.out.print("ket qua gia thua la: " +giaithua );
scanner.close();
	}
	
}
