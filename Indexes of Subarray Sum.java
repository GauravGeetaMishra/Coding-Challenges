
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            if(sum==target){
                 return new ArrayList<>(Arrays.asList(i+1,i+1));
            }
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                if(sum==target){
                    return new ArrayList<>(Arrays.asList(i+1,j+1));
                }
            }
        }
       return new ArrayList<>(Arrays.asList(-1));
        
    }
}
