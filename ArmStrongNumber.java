class ArmStrongNumber{
	public static void main(String args[]){
		int num = 153;
		int temp=num;
		int sum=0;
		int length= String.valueOf(num).length();
		while(num>0){
			int last = num %10;
			sum+=Math.pow(last, length);
			num=num/10;
			
		}
		
		if(sum==temp){
			System.out.println("ArmStrong Number");
			
		}
		else{
			System.out.println("Not ArmStrong Number");
		}
	}
}