class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Map<Character, Integer> sFrequency = new HashMap<>();
        Map<Character, Integer> tFrequency = new HashMap<>();

        for(char ss : sArray){
            sFrequency.put(ss, sFrequency.getOrDefault(ss, 0) + 1);
        }
        for(char tt : tArray){
            tFrequency.put(tt, tFrequency.getOrDefault(tt, 0)+1);
        }
        
        return sFrequency.equals(tFrequency);
    }

    //my first implementation will be to use a hashmap
    //check if the entries in 1  is equal to the entries in 2
    //use a frequency array. 
}
