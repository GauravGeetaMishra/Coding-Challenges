import java.util.*;
class LinearSearch{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int[] arr = {5, 1, 2, 2, 3, 4, 4, 1};
	int a = sc.nextInt();
	for(int i=0;i<arr.length;i++){
		if(arr[i]==a){
			System.out.println("Element is found at index"+i);
		}
	}
	
	}	
}