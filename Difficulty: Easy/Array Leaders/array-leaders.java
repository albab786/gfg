class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans=new  ArrayList<Integer>();
        int ma=arr[arr.length-1];
       
        for(int i=arr.length-1;i>=0;i--){
            ma=Math.max(ma,arr[i]);
            if(ma==arr[i])
            ans.add(arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }
}
