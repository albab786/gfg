import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        
        // 1. Fixed condition to prevent ArrayIndexOutOfBoundsException
        while (i < a.length && j < b.length) {
            
            if (a[i] < b[j]) {
                // 2. Added check to avoid duplicate elements
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++; // Only increment 'i' when processing 'a'
                
            } else if (b[j] < a[i]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);
                }
                j++; // Only increment 'j' when processing 'b'
                
            } else {
                // 3. Handled the case when elements are equal
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
            // Removed the global i++ that was causing skipping
        }
        
        // 4. Replaced the faulty length checks with precise leftover loops
        // If there are remaining elements in array 'a'
        while (i < a.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }
        
        // If there are remaining elements in array 'b'
        while (j < b.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }
        
        return ans;
    }
}