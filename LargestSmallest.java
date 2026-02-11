class LargestSmallest{
	public static void main(String args[]){
		int[] arr = {5,6,4,1,2,9};
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Max and min element in array is ->"+max+" , "+min);
		
	}
	
}