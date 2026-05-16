class Solution {
    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        if (n == 0) return -1;
        
        int prefixSum[] = new int[n];
        int suffixSum[] = new int[n];
        
       
        prefixSum[0] = 0;
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }
        
       
        suffixSum[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i + 1];
        }
        
    
        for (int i = 0; i < n; i++) {
            if (prefixSum[i] == suffixSum[i]) {
                return i; 
            }
        }
        
        return -1;
    }
}