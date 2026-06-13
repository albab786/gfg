class Solution {
	public void bubbleSort(int[] arr) {
		// code here
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr.length-1; j++) {
				if (arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	void swap(int []arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
}
