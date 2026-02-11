import java.util.*;
class BasicSort{
	public static void main(String args[]){
		
		int[] arr = {5, 1, 2, 2, 3, 4, 4, 1};
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
			
			
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}