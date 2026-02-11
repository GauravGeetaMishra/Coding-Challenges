class MergseSort{
	public static void sort(int arr[], int l, int r){
		if(l<r){
			int mid = l+(r-l)/2;
			sort(arr,l,mid);
			sort(arr,mid+1,r);
			merge(arr, l, mid, r);
		}
	}
	public static void merge(int arr[],int left, int mid, int right){
		int m= mid-left+1;
		int n=right-mid;
		int leftArr[]=new int[m];
		int rightArr[]=new int[m];
		for(int i=0;i<m;i++){
			leftArr[i]=arr[left+i];
		}
		for(int j=0;j<n;j++){
			rightArr[j]=arr[mid+1+j];
		}
		int i=0;
		int j=0;
		int k=left;
		while(i<m && j<n){
			if(leftArr[i]<rightArr[j]){
				arr[k]=leftArr[i];
				i++;
			}
			else{
				arr[k]=rightArr[j];
				j++;
				
			}
			k++;
		}
		while(i<m){
			arr[k]=leftArr[i];
				i++;
				k++;
			
		}
		while(j<n){
			arr[k]=rightArr[j];
				j++;
				k++;
			
		}
	}
	 public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
	public static void main(String args[]){
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original array:");
        printArray(arr);
        
        sort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted array:");
        printArray(arr);
		
	}
}