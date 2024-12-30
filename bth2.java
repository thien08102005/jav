package bt1;

import java.util.Scanner;

public class bth2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		float a, b, x ; // float dùng tính giai thừa hoặc  các số chia có , 
		System.out.print("Nhap vao so a :");
	    a=scanner.nextFloat();
		System.out.printf("Nhap vao so b :");
		b=scanner.nextFloat();
		x=-b/a;
		if(a!=0) {
			System.out.printf("Phuong trinh co nghiem la %.2f ", + x);
			
		}else
		{		
		 if(b==0) {
		System.out.printf("Phuong trinh vo so nghiem la ");
	} else {
		System.out.printf("phuong trinh vo nghiem"); 
	}
		
	}
}
}