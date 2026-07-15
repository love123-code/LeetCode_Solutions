class Solution {
    public int longestPalindromeSubseq(String s) {
        String original = s;
        String reversed = new StringBuilder(s).reverse().toString();

        int n = s.length();

        int[] prev = new int[n + 1];
        int[] curr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            Arrays.fill(curr, 0);

            for (int j = 1; j <= n; j++) {
                if (reversed.charAt(i - 1) == original.charAt(j - 1)) {
                    curr[j] = 1 + prev[j - 1];
                } else {
                    curr[j] = Math.max(prev[j], curr[j - 1]);
                }
            }

            int[] temp = prev;
            prev = curr;
            curr = temp;
        }

        return prev[n];
    }
}