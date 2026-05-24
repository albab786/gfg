class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        
        int n = mat.length;
        int m = mat[0].length;

        ArrayList<Integer> ans = new ArrayList<>();

        // Single row
        if (n == 1) {
            for (int i = 0; i < m; i++) {
                ans.add(mat[0][i]);
            }
            return ans;
        }

        // Single column
        if (m == 1) {
            for (int i = 0; i < n; i++) {
                ans.add(mat[i][0]);
            }
            return ans;
        }

        // Top row
        for (int i = 0; i < m; i++) {
            ans.add(mat[0][i]);
        }

        // Right column
        for (int i = 1; i < n; i++) {
            ans.add(mat[i][m - 1]);
        }

        // Bottom row (reverse)
        for (int i = m - 2; i >= 0; i--) {
            ans.add(mat[n - 1][i]);
        }

        // Left column (reverse)
        for (int i = n - 2; i >= 1; i--) {
            ans.add(mat[i][0]);
        }

        return ans;
    }
}