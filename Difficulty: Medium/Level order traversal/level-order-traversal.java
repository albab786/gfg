/* A binary tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<Node> q=new LinkedList<>();
        if(root!=null)q.add(root);
        while(q.size()>0){
            Node temp=q.peek();
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
            ans.add(temp.data);
            q.remove();
        }
        return ans;
    }
}