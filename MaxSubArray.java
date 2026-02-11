class MaxSubArray{
	public static void main(String args[]){
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		int cursum=0;
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			cursum+=arr[i];
			max=Math.max(cursum,max);
			
			if(cursum<0){
				cursum=0;
			}
			
			
		}
		System.out.println(max);
	
		
	}
}