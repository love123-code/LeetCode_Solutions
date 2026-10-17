class Solution {
    public int findSubstringInWraproundString(String s) {
        int[] dp = new int[26];

        int currentLength = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i > 0) {
                int diff = s.charAt(i) - s.charAt(i - 1);

                if (diff == 1 || diff == -25) {
                    currentLength++;
                } else {
                    currentLength = 1;
                }
            } else {
                currentLength = 1;
            }

            int index = s.charAt(i) - 'a';

            dp[index] = Math.max(dp[index], currentLength);
        }

        int answer = 0;

        for (int length : dp) {
            answer += length;
        }

        return answer;
    }
}