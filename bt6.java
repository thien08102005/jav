package bt1;

public class bt6 {

	public static void main(String[] args) {
		   int[] arr = {3, 5, 7, 2, 8, 1, 9, 6};
	        
	        int max = findMax(arr);
	        
	       
	        System.out.println("Số nguyên lớn nhất trong mảng là: " + max);
	    }

	    public static int findMax(int[] arr) {
	       
	        if (arr == null || arr.length == 0) {
	            throw new IllegalArgumentException("Mảng không được trống");
	        }
	        
	     
	        int max = arr[0];
	        
	       
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];  
	            }
	        }
	        
	        return max;
	    }
	}

	


