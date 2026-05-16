class Solution {
    public int maxWater(int arr[]) {
        // code here
        int prefixmax[]=new int [arr.length];
        int suffixxmax[]=new int [arr.length];
        int ans=0;
        int left,right;
        prefixmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixmax[i]=Math.max(arr[i],prefixmax[i-1]);
        }
        suffixxmax[arr.length-1]=arr[arr.length-1];
         for(int i=arr.length-2;i>=0;i--){
            suffixxmax[i]=Math.max(arr[i],suffixxmax[i+1]);
        }
        for(int i=0;i<arr.length;i++){
            left=prefixmax[i];
            right=suffixxmax[i];
            ans=ans+Math.min(left,right)-arr[i];
        }
        return ans;
        
    }
}
