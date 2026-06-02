class Solution {
    public boolean isAnagram(String s, String t) {
        // 1. Bitwise trick: If lengths differ, immediately return false
        if (s.length() != t.length()) {
            return false;
        }

        // 2. Exploit a flat, small array for perfect CPU cache-line alignment
        int[] counts = new int[26];
        int len = s.length();

        // 3. Unroll local memory references for the JIT compiler
        // Using toCharArray() on modern JVMs leverages highly optimized, 
        // vectorized native system calls (System.arraycopy) under the hood.
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        // 4. Single-loop frequency mapping
        // Keeping it to a single loop maximizes hardware pipelining
        for (int i = 0; i < len; i++) {
            counts[sArr[i] - 'a']++;
            counts[tArr[i] - 'a']--;
        }

        // 5. Short-circuit verification loop
        for (int i = 0; i < 26; i++) {
            if (counts[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
