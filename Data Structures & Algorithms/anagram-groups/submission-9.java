class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> store = new HashMap<>();

        for(String str : strs){
            char[] frequency = new char[26];

            for(int i = 0; i < str.length(); i++){
                frequency[str.charAt(i) - 'a']++;
            }
            String key = new String(frequency);
            if(store.containsKey(key)){
                store.get(key).add(str);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(str);
                store.put(key, temp);
            }
        }
        return new ArrayList<>(store.values());
    }
}
