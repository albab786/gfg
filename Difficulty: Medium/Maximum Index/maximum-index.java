class Solution {

    int maxIndexDiff(int arr[]) {
        // code here
        int n = arr.length;
        int[] rMax = new int[n];
        int i, j;
        int lMin;
        rMax[n - 1] = arr[n - 1];
        for (i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i + 1], arr[i]);
        }
        i = 0;
        j = 0;
        int ans = 0;
        lMin = arr[0];
        while (i < n && j < n) {
            
            // Compare with answer and increment j.
            if (lMin <= rMax[j]) {
                ans = Math.max(ans, j - i);
                j++;
            }
            
            // Else, increment i.
            else {
                i++;
                if (i + 1 < n) 
                    lMin = Math.min(lMin, arr[i]);
            }
        }
        
        return ans;
    }
}