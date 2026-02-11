import java.util.*;
class HashMapUniqueChar{
	public static void main(String args[]){
		String str = "ggaurav".toLowerCase();
		Map<Character, Integer> map= new LinkedHashMap<>();
		
		for(Character ch : str.toCharArray()){
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		for(Character ch : str.toCharArray()){
			if(map.get(ch)==1){
				System.out.println(ch);
				return;
			}
		}
		
	}
}