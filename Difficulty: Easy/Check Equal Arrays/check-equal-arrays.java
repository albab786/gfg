import java.util.HashMap;

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // Step 1: If lengths are different, they cannot be equal
        if (a.length != b.length) return false;
        
        // Use a HashMap to store element frequencies
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Step 2: Count frequencies of elements in array 'a'
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        
        // Step 3: Match frequencies with array 'b'
        for (int i = 0; i < b.length; i++) {
            // If element in 'b' doesn't exist in 'a', arrays aren't equal
            if (!map.containsKey(b[i])) {
                return false;
            }
            
            // Decrease the frequency count by 1
            map.put(b[i], map.get(b[i]) - 1);
            
            // If the count drops below 0, 'b' has more copies of this number than 'a'
            if (map.get(b[i]) < 0) {
                return false;
            }
        }
        
        // If we successfully processed all elements, the arrays are identical
        return true;
    }
}