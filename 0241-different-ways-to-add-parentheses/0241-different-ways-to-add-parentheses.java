class Solution {
    public List<Integer> diffWaysToCompute(String expression) {

        List<Integer> ans = new ArrayList<>();
        int n = expression.length();

        for (int i = 0; i < n; i++) {

            char ch = expression.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*') {

                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);

                List<Integer> leftResult = diffWaysToCompute(left);
                List<Integer> rightResult = diffWaysToCompute(right);

                for (int l : leftResult) {
                    for (int r : rightResult) {

                        if (ch == '+') ans.add(l + r);
                        if (ch == '-') ans.add(l - r);
                        if (ch == '*') ans.add(l * r);
                    }
                }
            }
        }

       
        if (ans.size() == 0) {
            ans.add(Integer.parseInt(expression));
        }

        return ans;
    }
}