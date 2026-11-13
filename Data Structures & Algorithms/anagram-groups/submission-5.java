class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //Make the first list of char[]
        List<char[]> charList = new ArrayList<>(); //make the initial list of chars

        for(String str : strs){
            char[] charArray = str.toCharArray(); //put them in the list
            charList.add(charArray);
        }

        List<List<String>> listOfLists = new ArrayList<>(); //make the returning list

        for(int i = 0; i < charList.size(); i++){//iterate through the string list

            char[] first = charList.get(i);

            if(first != null){
                char[] firstCopy = first.clone();
                String str1 = new String(first);

                List<String> stringList = new ArrayList<>();

                stringList.add(str1);

                Arrays.sort(firstCopy);

                for(int j = i + 1; j < charList.size(); j++){

                    char[] second = charList.get(j);
                    if(second != null){
                        char[] secondCopy = second.clone();
                        Arrays.sort(secondCopy);
                        if(Arrays.equals(firstCopy, secondCopy)){
                            String str2 = new String(charList.get(j));
                            stringList.add(str2);
                            charList.set(j, null);
                        }
                    }
                }
                listOfLists.add(stringList);
            }
        }
        return listOfLists;
    }
}

//Brute force method
//Put each word into a char array and sort it
//Then compare each char array and put into sublists
