package btnangcao;

public class s3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int[] arr = {12, 5, 7, 9, 1, 6};

		        for (int i = 0; i < arr.length - 1; i++) {
		            for (int j = 0; j < arr.length - 1 - i; j++) {
		                if (arr[j] > arr[j + 1]) {
		                    int temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		            }
		        }

		        System.out.println("Mảng sau khi sắp xếp: ");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		    }
		}

	
