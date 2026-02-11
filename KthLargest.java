import java.util.*;
class KthLargest{
	public static void main(String [] args){
		int [] numbers = {7,5,6,7,4,2,9};
		Arrays.sort(numbers);
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int kthLargest = numbers[numbers.length-k];
		System.out.println(k+"th Largest Element in the Array is "+kthLargest);	
	}
}	