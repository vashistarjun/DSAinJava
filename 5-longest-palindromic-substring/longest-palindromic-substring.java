class Solution {

    public String longestPalindrome(String s) {

        String s2 = new StringBuilder(s).reverse().toString();
        int n = s.length();

        int[][] dp = new int[n+1][n+1];

        int maxLen = 0;
        int start = 0;

        for (int i = n-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {

                if (s.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = 1 + dp[i+1][j+1];

                    int orig_j = n - 1 - j;

                    // 🔥 palindrome alignment check
                    if (dp[i][j] > maxLen &&
                        i + dp[i][j] - 1 == orig_j) {

                        maxLen = dp[i][j];
                        start = i;
                    }

                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}
