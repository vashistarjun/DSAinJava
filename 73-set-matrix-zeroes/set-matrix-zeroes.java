class Solution {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();

        // Step 1: Add all zero cells to queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        // Step 2: BFS
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];

            // Zero full row
            for (int col = 0; col < m; col++) {
                if (!visited[r][col]) {
                    matrix[r][col] = 0;
                    visited[r][col] = true;
                }
            }

            // Zero full column
            for (int row = 0; row < n; row++) {
                if (!visited[row][c]) {
                    matrix[row][c] = 0;
                    visited[row][c] = true;
                }
            }
        }
    }
}
