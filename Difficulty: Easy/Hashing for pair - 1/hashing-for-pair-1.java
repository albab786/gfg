import java.util.HashSet;

class Geeks {
    // Function to check if there is a pair with the given sum in the array.
    public static int sumExists(int arr[], int sum) {
        // Create a HashSet to store the numbers we have seen so far
        HashSet<Integer> seen = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            int complement = sum - arr[i];
            
            // If the complement exists in the set, we found a pair!
            if (seen.contains(complement)) {
                return 1; // Pair exists
            }
            
            // Otherwise, add the current number to the set
            seen.add(arr[i]);
        }
        
        // If we loop through the entire array without finding a pair
        return 0; // Pair does not exist
    }
}