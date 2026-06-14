class Solution {
    void selectionSort(int[] arr) {
        int n = arr.length;
        
        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update to the correct index
                }
            }
            
            // Swap the found minimum element with the first element of unsorted part
            swap(arr, minIndex, i);
        }
    }
    
    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}