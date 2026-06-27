import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        // Loop backwards: From right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            
            // Pop elements that are greater than or equal to the current element
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            
            // If stack is empty, no smaller element exists to the right
            if (stack.isEmpty()) {
                ans.add(-1);
            } else {
                // The top of the stack is the nearest smaller element on the right
                ans.add(stack.peek());
            }
            
            // Push current element for the elements to its left
            stack.push(arr[i]);
        }
        
        // Since we processed backwards, our answer list is reversed. 
        // We reverse it back to match the original array order.
        Collections.reverse(ans);
        return ans;
    }
}