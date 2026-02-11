class ReverseWords{
	public static void main(String args[]){
		String str = "I love Java";
		String finals = "";
		String temp = "";
		
		int n = str.length();
		for(int i=0;i<n;i++){
			if(str.charAt(i)!=' '){
				temp =str.charAt(i)+temp; 
				
			}
			else{
				finals = finals + temp + " ";
				temp= "";
			}
		}
		finals = finals +temp;
		
		System.out.println(finals);
	}
}