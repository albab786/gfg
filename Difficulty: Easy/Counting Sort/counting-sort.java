class Solution {
    public static String countSort(String s) {
        // code here
      
        int c[]=new int [26];
        // 2. Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            int ind = s.charAt(i) - 'a'; // Use charAt() instead of []
            c[ind]++;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            // Append the character 'i + 'a'' exactly c[i] times
            while (c[i] > 0) {
                ans.append((char)(i + 'a'));
                c[i]--;
            }
        }
        
        return ans.toString();
      
    }
}