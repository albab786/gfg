class Solution {
    static int subArraySum(int arr[], int tar) {
        //  code here
        	// Map to store (prefix_sum -> frequency)
		HashMap<Integer, Integer> map = new HashMap<>();
		
		// Base case: A prefix sum of 0 has occurred 1 time (before elements start)
		map.put(0, 1);
		
		int currentSum = 0;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];
			
			// Check if (currentSum - tar) exists in the map
			if (map.containsKey(currentSum - tar)) {
				count += map.get(currentSum - tar);
			}
			
			// Add or update the frequency of the current prefix sum in the map
			map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
		}
		
		return count;
    }
}