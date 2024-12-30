package btnangcao;

public class s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int[] arr = {12, 13, 5, 6, 7, 5};  

		        int smallest = arr[0];
		        int secondSmallest = Integer.MAX_VALUE;

		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] < smallest) {
		                secondSmallest = smallest;
		                smallest = arr[i];
		            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
		                secondSmallest = arr[i];
		            }
		        }

		        System.out.println("Số nhỏ thứ hai là: " + secondSmallest);
		    }
		}
 /// -- sài chatgpt 