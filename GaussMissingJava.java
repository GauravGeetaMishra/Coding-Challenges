class MissingNumberQuestion{
	public static void main(String args[]){
		int arr[]={1,3,4,5,6,7};
		long n = arr.length;
		long curSum=0;
		long realSum=(n+1)*(n+1+1)/2;
		for(int i=0;i<n;i++){
			curSum+=arr[i];
		}
		int result = (int)(realSum-curSum);
		System.out.println("Missing Number is"+result);
	}
}
