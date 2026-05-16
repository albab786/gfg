class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
             Arrays.sort(arr);
       
        int r=0;
        int l=arr.length-1;
        while(r<l){
            if(arr[r]+arr[l]==target)
            return true;
            if(arr[r]+arr[l]>target){
            l--;
            }else{
                r++;
            }
        }
        return false;
    }
}