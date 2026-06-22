import java.util.HashSet;

class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Using a HashSet instead of HashMap since we only need to store the sums, not key-value pairs
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            // If the current element is 0 or prefix sum is 0, a 0-sum subarray exists
            if (sum == 0 || arr[i] == 0) {
                return true;
            }
            
            // If the prefix sum has been seen before, we found a 0-sum subarray
            if (set.contains(sum)) {
                return true;
            }
            
            // Otherwise, add the current prefix sum to the set
            set.add(sum);
        }
        
        return false;
    }
}