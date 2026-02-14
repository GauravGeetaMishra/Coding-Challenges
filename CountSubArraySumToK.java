class SubArraySumToK{
	public static void main(String args[]){
		int arr[] = {3,4,7,2,3,1,4,2};
		int k =7;
		int left = 0;
		int sum=0;
		int count=0;
		for(int right=0;right<arr.length;right++){
			sum+=arr[right];
			while(sum>k){
				sum-=arr[left];
				left++;
			}
			
			if(sum==k){
				count++;
				
				sum -= arr[left];
                left++;
			}
		}
		System.out.println(count);
	}
}
