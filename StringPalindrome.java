class StringPalindrome{
	public static void main(String args[]){
		String str = "AcaA";
		String str2=str;
		
		String str1=new StringBuilder(str).reverse().toString();
		
		if(str1.equals(str2)){
			System.out.println("Palindrome");
			
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}