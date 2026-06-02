class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();
        Arrays.sort(tA);
        Arrays.sort(sA);
        return Arrays.equals(sA, tA);
    }
}
