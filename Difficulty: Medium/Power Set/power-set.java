// User function Template for Java

class Solution {
	
	public void generate(int i, int n, StringBuilder subset, String s, List<String>ans) {
		if (i == n) {
			ans.add(subset.toString());
			return;
		}
		subset.append(s.charAt(i));
		generate(i + 1, n, subset, s, ans);
		subset.deleteCharAt(subset.length() - 1);
		generate(i + 1, n, subset, s, ans);
	}
	public List<String> AllPossibleStrings(String s) {
		// Code here
		List<String> ans = new ArrayList<>();
		StringBuilder subset = new StringBuilder("");
		generate(0, s.length(), subset, s, ans);
		
		Collections.sort(ans);
		return ans;
	}
}
