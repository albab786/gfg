import java.util.HashMap;
import java.util.Map;

class Solution {
    // Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n) {
        // Step 1: Count the votes for each candidate
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        // Variables to keep track of the winner and their vote count
        String maxCandidate = "";
        int maxVotes = -1;
        
        // Step 2: Iterate through the map to find the winner
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String candidate = entry.getKey();
            int votes = entry.getValue();
            
            // Case 1: Current candidate has strictly MORE votes
            if (votes > maxVotes) {
                maxVotes = votes;
                maxCandidate = candidate;
            } 
            // Case 2: There is a TIE in votes
            else if (votes == maxVotes) {
                // Pick the lexicographically smaller name
                if (candidate.compareTo(maxCandidate) < 0) {
                    maxCandidate = candidate;
                }
            }
        }
        
        // Step 3: Return the result as a String array containing [Name, Votes]
        // Converting maxVotes integer to a String
        return new String[] { maxCandidate, String.valueOf(maxVotes) };
    }
}