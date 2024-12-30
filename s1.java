package btnangcao;

public class s1 {

	public static void main(String[] args) {
				 int[] arr = {1, 2, 3, 4, 5, 6, 7, 1, 3, 5, 6};      
	        System.out.print("Các phần tử trùng lặp: ");
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.print(arr[i] + "  ");
	                    break;
	                }
	            }
	        }
	    }	
    }
