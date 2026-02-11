class SumOfIntegers{
	
	static int sum(int n){
		int total=(n+1)*n/2;
		
		return total;
	}
	public static void main(String args[]){
		int start=10;
	int end=20;
	
	System.out.print(SumOfIntegers.sum(end)-SumOfIntegers.sum(start-1));
	}
}