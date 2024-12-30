package bt1;
import java.util.Scanner;
public class baitest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so nguyen N");
		int N = sc.nextInt();
		long tong=0;
		long giaithua=1;
		for(int i=1; i<=N; i++) {
			
			for(int j=1; j<=i; j++) {
				giaithua*=i;
			}
		tong+=giaithua;}
		System.out.print("ket qua từ 1!-"+N+"! là:"+tong);
     sc.close();
	}

}
