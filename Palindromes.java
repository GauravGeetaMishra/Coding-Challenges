class Palindrome{
	public static void main(String args[]){
		int num=121;
		int temp=num;
		int reverse = 0;
		while(num>0){
			int last = num%10;
			reverse=reverse*10+last;
			num=num/10;
			
		}
		if(temp==reverse){
			System.out.println("Palindrome Number");
		}
		else{
			System.out.println("Not Palindrome Number");
			
		}
	}
}