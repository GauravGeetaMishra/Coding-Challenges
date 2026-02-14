import java.util.*;
class LongestSubStringWithoutRep{
	public static void main(String args[]){
		String str= "Gaurav";
		int left=0;
		int maxLen=0;
		Set<Character> set= new HashSet<>();
		for(int right=0;right<str.length();right++){
			char ch = str.charAt(right);
			while(set.contains(ch)){
				set.remove(str.charAt(left));
				left++;
			}
			set.add(str.charAt(right));
			maxLen=Math.max(maxLen,right-left+1);
		}
		System.out.println(maxLen);
	}
}
