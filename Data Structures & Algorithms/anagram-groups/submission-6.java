class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Use a frequency string as a key
        //store a list

        Map<String, List<String>> groups = new HashMap<>();

        for(String str : strs){

            int[] frequency = new int[26];
            for(int i = 0; i < str.length(); i++){
                frequency[str.charAt(i) - 'a']++;
            }
            String frequencyString = Arrays.toString(frequency);

            groups.computeIfAbsent(frequencyString, f -> new ArrayList<>()).add(str);
        }

        List<List<String>> allValues = new ArrayList<>(groups.values());

        return allValues;
    }
}

//Brute force method
//Put each word into a char array and sort it
//Then compare each char array and put into sublists
        
        // //Make the first list of char[]
        // List<char[]> charList = new ArrayList<>(); //make the initial list of chars

        // for(String str : strs){
        //     char[] charArray = str.toCharArray(); //put them in the list
        //     charList.add(charArray);
        // }

        // List<List<String>> listOfLists = new ArrayList<>(); //make the returning list

        // for(int i = 0; i < charList.size(); i++){//iterate through the string list

        //     char[] first = charList.get(i);

        //     if(first != null){
        //         char[] firstCopy = first.clone();
        //         String str1 = new String(first);

        //         List<String> stringList = new ArrayList<>();

        //         stringList.add(str1);

        //         Arrays.sort(firstCopy);

        //         for(int j = i + 1; j < charList.size(); j++){

        //             char[] second = charList.get(j);
        //             if(second != null){
        //                 char[] secondCopy = second.clone();
        //                 Arrays.sort(secondCopy);
        //                 if(Arrays.equals(firstCopy, secondCopy)){
        //                     String str2 = new String(charList.get(j));
        //                     stringList.add(str2);
        //                     charList.set(j, null);
        //                 }
        //             }
        //         }
        //         listOfLists.add(stringList);
        //     }
        // }
        // return listOfLists;
