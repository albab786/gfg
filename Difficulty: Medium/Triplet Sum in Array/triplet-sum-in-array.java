import java.util.Arrays;

class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // 1. Sort the array to use the two-pointer technique
        Arrays.sort(arr);
        int n = arr.length;
        
        // 2. Fix the first element of the triplet one by one
        // We stop at n-2 because we need at least 3 elements for a triplet
        for (int i = 0; i < n - 2; i++) {
            
            // 3. Initialize two pointers for the remaining elements
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];
                
                // If we found the target sum, return true
                if (currentSum == target) {
                    return true;
                } 
                // If the current sum is less than target, move the left pointer rightward to get a larger sum
                else if (currentSum < target) {
                    left++;
                } 
                // If the current sum is greater than target, move the right pointer leftward to get a smaller sum
                else {
                    right--;
                }
            }
        }
        
        // If no triplet is found after checking all combinations
        return false;
    }
}