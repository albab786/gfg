// User function Template for Java

class Solution {
    List<Integer> querySum(int n, int arr[], int q, int queries[]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int l=-1;
        int r=-1;
        int sum=0;
        int prefSum[]=new int[arr.length];
        prefSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefSum[i]=arr[i]+prefSum[i-1];
        }
        for(int i=0;i<2*q;i+=2){
            l=queries[i];
            r=queries[i+1];
            l--;
            r--;
            sum=prefSum[r];
            if(l>0){
                sum=sum-prefSum[l-1];
            }
            ans.add(sum);
        }
        return ans;
    }
}