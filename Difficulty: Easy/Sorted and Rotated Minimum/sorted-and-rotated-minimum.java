class Solution {
    public int findMin(int[] arr) {
        // code here
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
                high=high;
            }
            else{
                low=low;
                high=mid;
            }
        }
        return arr[low];
    }
}
