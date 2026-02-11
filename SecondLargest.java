class SecondLargest{
	public static void main(String args[]){
		int[] arr = {5,6,4,1,2,9};
		int max= arr[0];
		int seclarge= arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				seclarge=max;
				max=arr[i];
			}
			if(arr[i]<max && arr[i]>seclarge){
				seclarge=arr[i];
			}
		}
		
		System.out.println("Sec Largest element in array is ->" +seclarge);
		
		
	}
}