class EvenAndOdd{
	public static void main(String args[]){
		int[] arr = {5,6,4,1,2,9};
		int odd = 0;
		int even = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				even++;
				
			}
			else{
				odd++;
			}
		}
		System.out.println("Number of Even Elements are "+even+" , Number of Odd elements are ->"+odd);
	}
}