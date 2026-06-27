import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            // Pop elements from the stack that are smaller than or equal to the current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            
            // If stack is empty, no greater element exists to the left
            if (stack.isEmpty()) {
                ans.add(-1);
            } else {
                // The top of the stack is the nearest greater element
                ans.add(stack.peek());
            }
            
            // Push the current element onto the stack for future elements
            stack.push(arr[i]);
        }
        
        return ans;
    }
}