import java.util.*;
class StringReverseStack{
	public static void main(String args[]){
		String str="Gaurav";
		Stack<Character> stak=new Stack<>();
		for(int i=0;i<str.length();i++){
			stak.push(str.charAt(i));
		}
		String rev = "";
		while(!stak.isEmpty()){
			rev = rev + stak.pop();
		}
		System.out.println(rev);

	}
}