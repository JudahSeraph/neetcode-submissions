class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        So I will check if they are of the same length.
        Then I will add both of them to a hashmap
        Then I will find equality of those maps */

        //So this is the brute force way

        //The overall Space Complexity is O(1)
        //The overall Time Complexity is O(n)

        if(s.length() != t.length()) return false;


        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){  //The Space Comp of this code block is O(1); Time Comp = O(n)
            char letter = s.charAt(i);

            if(sMap.containsKey(letter)){
                sMap.put(letter, sMap.get(letter) + 1);
            }else{
                sMap.put(letter, 1);
            }
        }
        for(int i = 0; i < t.length(); i++){ //The Space Comp of this code block is O(n); Time Comp = O(n)
            char letter = t.charAt(i);

            if(tMap.containsKey(letter)){
                tMap.put(letter, tMap.get(letter) + 1);
            }else{
                tMap.put(letter, 1);
            }
        }

        return sMap.equals(tMap);
    }
}

/*
        The Space Complexity of the overall code is O(n)
        The Time Complexity of the overall code is O(n log n)

        char[] sChar = s.toCharArray(); **Time Complexity is O(n) **Space Complexity is O(n)
        char[] tChar = t.toCharArray(); **Time Complexity is O(n) **Space Complexity is O(n)

        Arrays.sort(sChar);  **Time complexity is O(nlogn) **Space Complexity is O(log n)
        Arrays.sort(tChar); **Time complexity is O(nlogn) ** Space Complexity is O(log n)

        return Arrays.equals(sChar, tChar); **Time complexity is O(n) **Space Complexity is O(1)
*/