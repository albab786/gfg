class Solution {
	public String removePair(String s) {
		// code here
		Stack<Character> st = new Stack<>();
		Stack<Character> st2 = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			
			st.push(s.charAt(i));
			
		}
			while (!st.isEmpty()) {
			if(st2.isEmpty()|| st2.peek()!=st.peek()){
			    st2.push(st.pop());
			}else{
			st.pop();
			st2.pop();
			}
		}
		if(st2.isEmpty())
		return "-1";
		StringBuilder sb = new StringBuilder();
		
		while (!st2.isEmpty()) {
			
			sb.append(st2.pop());
		}
		
		return sb.toString();
	}
}
