class HarshadNumber{
	public static void main(String args[]){
		int num = 18;
		int temp=num;
		int sum=0;
		while(num>0){
			int last = num%10;
			sum+=last;
			num=num/10;
			
		}
		
		if(temp%sum==0)
		{
			System.out.println("The given number is Harshad");
		}
		else{
			System.out.println("The given number is not Harshad");
		}
			
	}
}