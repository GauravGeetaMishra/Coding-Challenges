class VowelsConstants{
	public static void main(String args[]){
		String str = "Gaurav";
		int vowels=0;
		int con=0;
		String str1=str.toLowerCase();
		for(char c : str1.toCharArray()){
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
				vowels++;
			}
			else{
				con++;
			}
		}
		  System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + con);
		
	}
}