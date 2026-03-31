class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[] vis = new boolean[n*n + 1];

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1, 0}); // {cell, steps}
        vis[1] = true;

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int cell = curr[0];
            int steps = curr[1];

            if(cell == n*n) return steps;

            for(int dice = 1; dice <= 6; dice++){
                int next = cell + dice;
                if(next > n*n) break;

                int[] pos = getPos(next, n);
                int r = pos[0], c = pos[1];

                // snake or ladder
                if(board[r][c] != -1){
                    next = board[r][c];
                }

                if(!vis[next]){
                    vis[next] = true;
                    q.add(new int[]{next, steps + 1});
                }
            }
        }
        return -1;
    }

    // 🔑 main logic (yaad kar le bas ye)
    private int[] getPos(int num, int n){
        int row = n - 1 - (num - 1) / n;
        int col = (num - 1) % n;

        // zig-zag reverse
        if(((n - 1 - row) % 2) == 1){
            col = n - 1 - col;
        }

        return new int[]{row, col};
    }
}