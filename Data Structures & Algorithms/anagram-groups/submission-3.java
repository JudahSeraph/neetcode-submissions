class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        //We are going to iterate through the strings in strs
        //Then we are going to use a charAt and an int array to store the keys
        //Then we are going to implement as normal

        for(String str : strs){

            int[] count = new int[26];

            for(int i = 0; i < str.toCharArray().length; i++){
                count[str.charAt(i) - 'a'] ++;
            }

            String key = Arrays.toString(count);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);

        }

        return new ArrayList<>(map.values());
    }

}
