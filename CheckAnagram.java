import java.util.*;
class CheckAnagram{
	public static void main(String args[]){
		String s1 = "liten".toLowerCase();
        String s2 = "silent".toLowerCase();
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		for(char ch : s1.toCharArray()){
			map1.put(ch, map1.getOrDefault(ch,0)+1);
		}
		for(char ch : s2.toCharArray()){
			map2.put(ch, map2.getOrDefault(ch,0)+1);
		}
		
		if(map1.equals(map2)){
			System.out.println("Anagram");
		}
		
	}
}