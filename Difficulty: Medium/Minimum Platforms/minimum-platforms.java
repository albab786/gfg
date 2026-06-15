class Solution {
	public int minPlatform(int arr[], int dep[]) {
		//  code here
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int count = 0;
		int i = 0;
		int j = 0;
		int ans = 0;
		while (i<arr.length) {
			if (arr[i] <= dep[j]) {
				count++;
				i++;
			} else {
				count--;
				j++;
			}
			ans = Math.max(ans, count);
		}
		return ans;
	}
}
