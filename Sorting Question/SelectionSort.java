class SelectionSort{
	public static void sort(int arr[]){
		int n=arr.length;
		for(int i=0;i<n;i++){
			int minidx=i;
			for(int j=i+1;j<n;j++){
				if(arr[minidx]>arr[j]){
					minidx=j;
				}
			}
		   int temp = arr[i];
           arr[i] = arr[minidx];
           arr[minidx] = temp;
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
        
        sort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);
	}
}