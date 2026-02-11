class Pangram{
	public static void main(String args[]){
		 String str = "The quick brown fox jumps over the lazy dog".toLowerCase();
		 boolean bools[] = new boolean[26];
		 for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				bools[str.charAt(i)-'a']=true;
			} 
		 }
		 for(int i=0;i<26;i++){
			if(bools[i]==false){
				System.out.println("Not a Pangram");
				return;
			} 
		 }
		 
		 System.out.println("Pangram");
		 
		 
	}
}