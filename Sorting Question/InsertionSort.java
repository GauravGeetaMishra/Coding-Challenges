import java.util.*;
class InsertionSort{
	public static void sort(int arr[]){
		int n = arr.length;
		for(int i=1;i<n;i++){
			int j = i-1;
			int key = arr[i];
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}
			 arr[j + 1] = key;
		}
	}
	 public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Original array:");
        printArray(arr);
		sort(arr);
		System.out.println("Sorted array:");
        printArray(arr);
		
	}

}