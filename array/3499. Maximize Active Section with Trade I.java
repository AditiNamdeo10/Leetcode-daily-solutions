//Problem: 3499. Maximize Active Section with Trade I

class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;
        int maxGain = 0;
        int prevZeroBlock = -1000000; // No previous zero block yet

        int i = 0;

        while (i < s.length()) {
            int j = i;

            // Find the current block
            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                j++;
            }

            int len = j - i;

            if (s.charAt(i) == '1') {
                ones += len;
            } else {
                maxGain = Math.max(maxGain, prevZeroBlock + len);
                prevZeroBlock = len;
            }

            i = j;
        }

        return ones + maxGain;
    }
}