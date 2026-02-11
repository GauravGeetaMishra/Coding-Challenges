class GreatestOfThree{
	public static void main(String args[]){
		int a, b, c;
		a=10;
		b=4;
		c=15;
		int result=(a>b) ? (a>c ? a:c) : (b>c ? b: c);
		System.out.println("the greatest number is"+ result);
	}

}