class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int ans=0;
        int sum=0;
        
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        ans=sum;
        for(int i=k;i<arr.length;i++){
           sum = sum + arr[i] - arr[i - k];

            
            ans = Math.max(ans, sum);
        }
        return ans;
        
        
    }
}