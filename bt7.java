package bt1;

public class bt7 {

	public static void main(String[] args) {
		 int[] arr = {3, 4, 11, 13, 7, 1, 9, 15, 10};
	        
	        printEvenNumbers(arr);
	    }
	 
	    public static void printEvenNumbers(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            System.out.println("Mảng trống!");
	            return;
	        }
	        
	       	        System.out.println("Các số chẵn trong mảng là:");
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] % 2 == 0) {
	                System.out.println(arr[i]);
	            }
	        }
	    }
	}