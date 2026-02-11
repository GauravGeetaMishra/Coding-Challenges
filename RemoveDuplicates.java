import java.util.*;
class RemoveDuplicates{
	
	public static void main(String args[]){
		int[] arr = {5,2,4,1,2,9};
		Set<Integer> set = new HashSet<>();
		for(int i = 0;i<arr.length;i++){
			set.add(arr[i]);
		}
		System.out.println(set);
		
	}
}