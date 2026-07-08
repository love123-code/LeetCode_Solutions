class Solution {
    public boolean isCircularSentence(String sentence) {
        int spaceIdx = -1;

        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) {
            return false;
        }

        while ((spaceIdx = sentence.indexOf(' ', spaceIdx + 1)) != -1) {

            if (sentence.charAt(spaceIdx - 1) != sentence.charAt(spaceIdx + 1)) {
                return false;
            }
        }

        return true;
    }
}