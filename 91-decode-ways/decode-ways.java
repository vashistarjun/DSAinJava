class Solution {

    Integer dp[];

    public int numDecodings(String s) {

        dp = new Integer[s.length()];
        return solve(0, s);
    }

    int solve(int i, String s) {

        // End reached → 1 valid way
        if (i == s.length()) return 1;

        // Leading zero → invalid
        if (s.charAt(i) == '0') return 0;

        if (dp[i] != null) return dp[i];

        // Take single digit
        int ways = solve(i + 1, s);

        // Take two digits (if valid)
        if (i + 1 < s.length() &&
            Integer.parseInt(s.substring(i, i + 2)) <= 26) {

            ways += solve(i + 2, s);
        }

        return dp[i] = ways;
    }
}
