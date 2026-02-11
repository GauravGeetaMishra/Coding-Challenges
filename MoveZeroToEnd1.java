import java.util.*;
class MoveZeroToEnd1{
	public static void main(String args[]){
		int arr[] = {1,2,0,5,0,6,0,7,8,0};
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr[j]=arr[i];
				j++;
			}
			
		}
		while(j<arr.length){
			arr[j]=0;
			j++;
		}
	    System.out.println(Arrays.toString(arr));
	}
}