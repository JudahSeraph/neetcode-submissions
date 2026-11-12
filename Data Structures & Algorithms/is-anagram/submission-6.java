class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] frequency = new int[26];

        for(int i = 0; i < s.length(); i++){
            frequency[s.charAt(i) - 'a']++;
            frequency[(t.charAt(i) - 'a')]--;
        }
        for(int i : frequency){
            if(i != 0) return false;
        }
        return true;
    }
}


        /*Naive implementation
        Space complexity  = O(n);
        Time complexity = O(n);
        */
        // if(s.length() != t.length()) return false;

        // char[] sArray = s.toCharArray();
        // char[] tArray = t.toCharArray();

        // Map<Character, Integer> sFrequency = new HashMap<>();
        // Map<Character, Integer> tFrequency = new HashMap<>();

        // for(char ss : sArray){
        //     sFrequency.put(ss, sFrequency.getOrDefault(ss, 0) + 1);
        // }
        // for(char tt : tArray){
        //     tFrequency.put(tt, tFrequency.getOrDefault(tt, 0)+1);
        // }
        
        // return sFrequency.equals(tFrequency);