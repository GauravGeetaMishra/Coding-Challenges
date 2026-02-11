import java.util.*;
class KLargest{
	public static void main(String args[]){
		int [] numbers = {1,2,3,4,5,6,7};
		Scanner sc = new Scanner(System.in);
		int max = numbers[0];
		int secmax = numbers[0];
		int thirdmax = numbers[0];
		int count=0;
		int k = 3;
		
		for(int i=0;i<numbers.length;i++){
			if(max<numbers[i]){
				thirdmax=secmax;
				secmax=max;
				max=numbers[i];
				count++;
			}
			if(numbers[i]<max && numbers[i]>secmax){
				thirdmax=secmax;
				secmax=numbers[i];
			}
			if(numbers[i]<secmax && numbers[i]>thirdmax){
				thirdmax=numbers[i];
			}
			
			
		}
		System.out.println("Third Largest Number is" + thirdmax);
		
	}
}