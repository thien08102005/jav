package bt1;
import java.util.Scanner;
public class baitest {    
	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("nhap so N");
     int N =scanner.nextInt();
     int tong=0;
     for(int i=1; i<=N; i++) {
    	 if(i % 2 !=0) {
    		 tong +=i;
    	 }
     }
     System.out.print("tong cua cac so le tu 1-"+ N +"la:"+tong);
    }
}
