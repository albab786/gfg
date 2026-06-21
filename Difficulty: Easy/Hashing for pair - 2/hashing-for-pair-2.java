class Geeks {
    // Complete this function
    // Function to check if two numbers in array have sum equal to the given
    // sum.
    public static int sumExists(int arr[], int sum) {

        // Your code here
        HashSet<Integer> seen=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int complement=sum-arr[i];
            if(seen.contains(complement)){
                return 1;
            }
            seen.add(arr[i]);
        }
        return 0;
    }
}