class QuickSort{
	public static void sort(int arr[], int start, int end){
		if(start<end){
			int p1 = partition(arr,start,end);
			sort(arr,start,p1-1);
			sort(arr,p1+1,end);
		}
	}
	public static int partition(int arr[], int start, int end){
		int pivot=arr[end];
		int i=start-1;
		for(int j=start;j<=end-1;j++){
			if(arr[j]<pivot){
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr,i+1,end);
		return (i+1);
	}
	static void swap(int arr[], int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	static void display(int arr[]){
		for(int a1 : arr){
			System.out.println(a1);
		}
	}
	public static void main(String args[]){
		int [] arr = {4,5,6,7,4,3,2,1};
		sort(arr, 0, arr.length-1);
		display(arr);
	}
}