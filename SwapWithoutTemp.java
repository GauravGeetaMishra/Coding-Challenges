class SwapWithoutTemp{
	public static void main(String args[]){
		int a=10;
		int b=30;
		int sum=a*b;
		a=sum/a;
		b=sum/b;
		System.out.println(a);
		System.out.println(b);
		
	}
}