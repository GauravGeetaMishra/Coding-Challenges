import java.util.*;

class TwoSumMap {
    public static void main(String args[]) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            // Check if complement already exists
            if (map.containsKey(complement)) {

                int index1 = map.get(complement);
                int index2 = i;

                System.out.println("Indexes: " + index1 + ", " + index2);
                return; // stop after finding answer
            }

            // Store current number with index
            map.put(arr[i], i);
        }

        System.out.println("No pair found");
    }
}
