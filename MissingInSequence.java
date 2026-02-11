class MissingInSequence{
	static int sum(int n){
		int total=(n+1)*n/2;
		
		return total;
	}
	public static void main(String args[]){
		int [] arr = {5, 6, 7, 8,9,10,12,13,14,15};
		int currSum=0;
		int originSum=MissingInSequence.sum(arr[arr.length-1])-MissingInSequence.sum(arr[0]-1);
		for(int i=0;i<arr.length;i++){
			currSum+=arr[i];
		}
		System.out.println(originSum-currSum);
		
	}
}