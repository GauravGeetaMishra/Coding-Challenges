class ReverseArray{
	public static void main(String args[]){
		int[] arr = {5,6,4,1,2,9};
		int i=0;
		int j=arr.length - 1;
		while(i<j){
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		for(int k = 0;k<arr.length;k++){
			System.out.println(arr[k]);
		}
		
		
		
	}
}