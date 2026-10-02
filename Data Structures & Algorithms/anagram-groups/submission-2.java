class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //What to do?
        //Use a HashMap:
        //The sorted letters would be the key, and if it is an anagram of the key, put it into the map, else create a new key, put it into the map
        //Solution
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] str_array = str.toCharArray();
            Arrays.sort(str_array);
            String sortedString = new String(str_array);
            if(map.containsKey(sortedString)){
                List<String> list = map.get(sortedString);
                list.add(str);
                map.put(sortedString, list);
            }else{
                map.put(sortedString, new ArrayList<String>(List.of(str)));
            }
        }
        List<List<String>> lists = new ArrayList<>();

        for(String str : map.keySet()){
            lists.add(map.get(str));
        }
        return lists;
    }

}
