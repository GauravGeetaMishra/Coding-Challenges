import java.util.*;

class ReverseNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int rev=0;
		while(a>0){
			int last=a%10;
			rev=rev*10+last;
			a=a/10;
		}
		
		System.out.println("The number reversed is "+rev);
		
	}
}