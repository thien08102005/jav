package bt1;
import java.util.Scanner;

public class bt5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a ,b ,c , x1 ,x2 , delta;
		System.out.print("Nhap vao so a= ");
		a = scanner.nextFloat();
		System.out.print("Nhap vao so b= ");
	b = scanner.nextFloat();
	System.out.print("Nhap vao so c= ");
	c = scanner.nextFloat();
	delta = b*b -4*a*c ;
	if (delta > 0) {  
		x1=(float)((-b+ Math.sqrt(delta))/(2*a));	
		x2=(float)((-b+ Math.sqrt(delta))/(2*a));
	System.out.printf("phuong trinh co hai nghiem phan biet x1= "+x1+ " x2="+x2);
	
	} else if(delta==0) {
		x1=x2=-b/2*a;
		
	System.out.printf("phuong trinh co nghiem kep "+x1);
	
	}else { 
		System.out.printf("phuong trinh vo nghiem ");
		
	}
	
	}
	

}
