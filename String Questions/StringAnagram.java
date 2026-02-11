import java.util.*;
class StringAnagram{
	public static void main(String args[]){
		String str = "Silent".toLowerCase();
		String str2 = "Listen".toLowerCase();
		HashMap<Character, Integer> map1=new HashMap<>();
		HashMap<Character, Integer> map2=new HashMap<>();
		for(Character ch : str.toCharArray()){
			map1.put(ch, map1.getOrDefault(ch,0)+1);
		}
		for(Character ch : str2.toCharArray()){
			map2.put(ch, map2.getOrDefault(ch,0)+1);
		}
		if(map1.equals(map2)){
			System.out.println("Anagram");
		}
		else{
			System.out.println("Not Anagram");
		}
		
	}
}