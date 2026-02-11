class CountConsecutive{
	public static void main(String args[]){
		int arr[] = {0,0,1,0,1,1,0,1};
		int cons=0;
		int i=0;
		int j=1;
		int zero=0;
		int one=0;
		while(j<arr.length){
			if(arr[i]==0 && arr[j]==0){
				zero++;
				cons++;
			}
			if(arr[i]==1 && arr[j]==1){
				one++;
				cons++;
			}
			i++;
			j++;
		}
		System.out.println("Zero Cons"+zero);
		System.out.println("One Cons"+one);
		System.out.println("Cons"+cons);
		
	}
}