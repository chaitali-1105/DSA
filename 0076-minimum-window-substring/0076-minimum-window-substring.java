class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int[] hash = new int[256];

        // Store frequency of characters in t
        for (char ch : t.toCharArray()) {
            hash[ch]++;
        }

        int left = 0;
        int right = 0;
        int count = 0;

        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;

        while (right < s.length()) {

            // If current character is needed
            if (hash[s.charAt(right)] > 0) {
                count++;
            }

            // Include current character in window
            hash[s.charAt(right)]--;

            // When all characters are found
            while (count == t.length()) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }

                // Remove left character from window
                hash[s.charAt(left)]++;

                // If removed character was required
                if (hash[s.charAt(left)] > 0) {
                    count--;
                }

                left++;
            }

            right++;
        }

        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLen);
    }
}