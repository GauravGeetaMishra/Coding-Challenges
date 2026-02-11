class SumAndAverage{
	public static void main(String args[]){
		int[] arr = {5,6,4,1,2,9};
		int sum=0;
		for(int k = 0;k<arr.length;k++){
			sum+=arr[k];
		}
		int average= sum/(arr.length);
		System.out.println("Sum of the array is "+sum+" , Average of the Array is ->"+average);
	}
}