class PerfectNumber{
	public static void main(String args[]){
		int num=6;
		int sum=1;
		for(int i=2;i*i<=num;i++){
			if(num%i==0){
				sum+=i;
			}
			if(num%i==0 && num/i!=i){
				sum+=num/i;
			}
		}
		if(num==sum){
			System.out.println("Perfect Number");
		}
		else{
			System.out.println("Not Perfect Number");
		}
	}
}