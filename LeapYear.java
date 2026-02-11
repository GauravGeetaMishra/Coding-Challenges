class LeapYear{
	public static void main(String args[]){
		int year = 1993;
		String result = ((year%400==0) || ((year%4==0) && (year%100!=0))) ? "Leap Year" : "Not Leap Year";
		System.out.println(result);
	}
}