import java.util.*;
class Palindrome{
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp=a;
		int rev=0;
		while(a>0){
			int last=a%10;
			rev=rev*10+last;
			a=a/10;
		}
		if(temp==rev){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palndrome");
		}
		
		
		
	}
}