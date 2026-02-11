class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        
        
        
        return new ArrayList<>(set);
    }
}
