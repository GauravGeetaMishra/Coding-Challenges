class CountWords{
	public static void main(String args[]){
		String str = "My name Gaurav Mishra";
		if(str.isEmpty()){
			System.out.println("String is empty");
			
		}
		else{
			int count =1;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==' '){
					count++;
				}
			}
			System.out.println("Number of words"+count);
		}
		
		
	}
}