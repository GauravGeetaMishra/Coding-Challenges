import java.util.*;


class FibonacciRecursion{
	public static int fib(int a){
		if(a==0){
			return 0;
		}
		if(a==1){
			return 1;
		}
		
		return fib(a-1)+fib(a-2);
		
	
	}
	public static void main(String[] args){
		int a = 8;
		for(int i=0;i<a;i++){
			System.out.println(fib(i)+" ");
		}
	}
	
}