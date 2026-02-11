import java.util.*;
class LCM{
	public static boolean isPrime(int a){
		int count =0;
		for(int i=1;i*i<=a;i++){
			if(a%i==0){
				count++;
			}
			if(a%i==0 && a/i!=i){
				count++;
			}
		}
		if(count>2){
			return false;
		}
		else{
			return true;
		}
	}
	public static int max(int a, int b){
		if(a>b){
			return a;
		}
		else{
			return b;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();
		int lcm=0;
		if(isPrime(a) && isPrime(b)){
			lcm=a*b;
		}
		int maxi= max(a,b);
		for(int i=maxi;i<=a*b;i++){
			if(i%a==0 && i%b==0){
				lcm=i;
			}
		}
		System.out.println("The LCM of given number is "+lcm);
		
		
		
		
		
	}

}