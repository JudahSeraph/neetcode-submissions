class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //First I have to compare their lengths
        //Find the anagrams
            //Sorting the list will take long, so I need to find another way
            //I am thinking of using a map and comparing the map
        HashMap<HashMap<String, Integer>, ArrayList<String>> values = new HashMap<>();
        for(String str : strs){
            HashMap<String, Integer> map = new HashMap<>();
            char[] characters = str.toCharArray(); //separate the string into a char array
            for(char c : characters){
                if(map.containsKey(String.valueOf(c))){
                    int m = map.get(String.valueOf(c));
                    m++;
                    map.put(String.valueOf(c),m);
                }else{
                    map.put(String.valueOf(c), 1);
                }
            }
            if(values.containsKey(map)){
                ArrayList<String> word =  values.get(map);
                word.add(str);
                values.put(map, word);
            }else{
                ArrayList<String> string  = new ArrayList<>();
                string.add(str);
                values.put(map, string);
            }   
        }
        List<List<String>> result = new ArrayList<>();
        for(HashMap<String, Integer> v : values.keySet()){//so in this line, I am trying to pass through the keys
        //of the HashMap values, and add their values. 
            result.add(values.get(v));
        }
        return result;
    } 
}
