class Solution {
    public int missingNumber(int[] arr) {
        // code here
        Arrays.sort(arr);
        int res=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==res)
            res++;
            else if(arr[i]>res)
            break;
        }
        return res;
    }
}
