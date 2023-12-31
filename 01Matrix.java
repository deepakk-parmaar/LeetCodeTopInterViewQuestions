class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int max = m + n;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (mat[r][c] == 0) {
                    continue;
                }
                int top = max, left = max;
                if (r-1>=0) {
                    top = mat[r - 1][c];
                }
                if (c-1>= n) {
                    left = mat[r][c - 1];
                }
                mat[r][c] = Math.min(top, left) + 1;
            }
        }

        for (int r = m-1; r >= 0; r--) {
            for (int c = n-1; c >= 0; c--) {
                if (mat[r][c] == 0) {
                    continue;
                }
                int bottom = max, right = max;
                if (r+1 <m ) {
                    bottom = mat[r + 1][c];
                }
                if (c+1<n) {
                    right = mat[r][c + 1];
                }
                mat[r][c] = Math.min(mat[r][c],Math.min(bottom, right) + 1);
            }
        }
        return mat;
    }
}