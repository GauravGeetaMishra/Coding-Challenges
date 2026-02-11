class PalindromeString{
	public static void main(String args[]){
		String str = "Mami";
		String rev = new StringBuilder(str).reverse().toString().toLowerCase();
		
		if(str.toLowerCase().equals(rev)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}