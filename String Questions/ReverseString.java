class ReverseString{
	public static void main(String main[]){
		String str = "Hello";
		String rev = new StringBuilder(str).reverse().toString();
		System.out.println(rev);
	}
}