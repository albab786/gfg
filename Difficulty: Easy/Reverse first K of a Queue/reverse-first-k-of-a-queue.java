class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
         if (q == null || k <= 0 || k > q.size()) {
            return q; 
        }
       Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++){
            st.push(q.remove());
           
        }
        while(!st.isEmpty()){
            int val=st.peek();
            st.pop();
            q.add(val);
        }
        int size=q.size()-k;

        while (size > 0) {
            q.add(q.remove());
            size--;
        }
        return q;

        
    }
}