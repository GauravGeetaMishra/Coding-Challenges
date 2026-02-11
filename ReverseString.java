class ReverseString{
	public static void main(String args[]){
		String str = "Gaurav";
		String str1=new StringBuilder(str).reverse().toString();
		
		System.out.println(str1);
	}
}