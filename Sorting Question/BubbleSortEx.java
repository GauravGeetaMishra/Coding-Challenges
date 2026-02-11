class BubbleSortEx{
	public static void sort(int arr[]){
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			boolean swapped=false;
			for(int j=0;j<n-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped){
				break;
			}
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