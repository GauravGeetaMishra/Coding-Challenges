import java.util.*;
class Armstrong{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp=a;
		int size=0;
		int armstrong=0;
		while(temp>0){
			size+=1;
			temp=temp/10;
		}
		temp=a;
		while(a>0){
			int last = a%10;
			armstrong = armstrong+(int)Math.pow(last,size);
			a=a/10;
			
		}
		if(temp==armstrong){
			System.out.println("Armstrong number");
		}
		else{
			System.out.println("Not a Armstrong Number");
		}
	}

}