class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        if(s.length()==1){
            return true;
        }
        String rev = "";
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9'){
            str = str + ch;
            }
        }

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9'){
            rev = rev + ch;
            }
        }
        if(rev.equals(str)){
            return true;
        }
        return false;
    }
}
