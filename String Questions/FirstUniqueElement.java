class FirstUniqueElement{
	public static void main(String args[]){
		String str = "auraGv".toLowerCase();
		for(int i=0;i<str.length();i++){
			int count=0;
			for(int j=0;j<str.length();j++){
				 if (i != j && str.charAt(i) == str.charAt(j)) {
                    count++;
                }
			}
			if(count==0){
				System.out.println("First Unique Element in String is ->"+str.charAt(i));
				return;
			}
		}
		System.out.println("No unique Element in String");
	}
}