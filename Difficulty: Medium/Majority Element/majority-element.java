class Solution {
    int majorityElement(int arr[]) {
        // code here
        if(arr.length==0){
            return -1;
        }
        int count=1;
        int maxcount=1;
        int majElement = arr[0];
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            } else {
                count = 1;
            }
            if(count>maxcount){
                majElement=arr[i];
                maxcount=count;
            }
        }
        if(maxcount>arr.length/2){
            return majElement;
        }
        return -1;
    }
}