class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int maxFreq=0;
        int maxLen=0;
        int left=0;
        for(int right=0;right<s.length();right++){
          char ch = s.charAt(right);
          freq[ch-'A']++;

          maxFreq=Math.max(maxFreq, freq[ch-'A']);


          int maxWindow=right-left+1;
          if(maxWindow-maxFreq>k){
              freq[s.charAt(left)-'A']--;
              left++;
          }

          maxLen=Math.max(maxLen,right-left+1);

        }
        return maxLen;
        
    }
}
