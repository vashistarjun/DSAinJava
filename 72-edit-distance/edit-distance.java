class Solution {
    Integer dp[][];

    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        dp = new Integer[n][m];

        int lcs = f(0, 0, word1, word2);
      return lcs;
    }

    int f(int i, int j, String word1, String word2) {
        if (i == word1.length())
            return word2.length() - j; // insert remaining

        if (j == word2.length())
            return word1.length() - i;

        if (dp[i][j] != null) return dp[i][j];

        if (word1.charAt(i) == word2.charAt(j)) {
            return dp[i][j] = f(i + 1, j + 1, word1, word2);
        } else {
             // different characters → try all 3 ops
        int insert  = f(i, j + 1, word1, word2);
        int delete  = f(i + 1, j, word1, word2);
        int replace = f(i + 1, j + 1, word1, word2);

        return dp[i][j]=1 + Math.min(insert, Math.min(delete, replace));
        }
    }
}
