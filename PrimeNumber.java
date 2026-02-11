import java.util.*;
class PrimeNumber{
	public static void main(String[] args){
		int a = 3;
		int count=0;
		for(int i=1;i*i<=a;i++){
			if(a%i==0){
				count++;
			}
			if(a%i==0 && a/i!=i){
				count++;
			}
		}
		if(count>2){
			System.out.println("Not a prime");
		}
		else{
			System.out.println("Prime");
		}
	}
}