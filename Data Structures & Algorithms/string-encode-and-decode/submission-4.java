class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0) return ""; //edge case if the string is empty
        int length = strs.size();

        StringBuilder block = new StringBuilder();

        for(String str : strs){
            block.append(str.length());
            block.append("#");
            block.append(str);
        }

        return block.toString();
    }

    public List<String> decode(String str) {


        List<String> strs = new ArrayList<>();

        int i = 0;
        while(i < str.length()){
            int j = i ;

            while(str.charAt(j) != '#') j++;

            int strLen = Integer.parseInt(str.substring(i, j));

            i = j + 1;

            strs.add(str.substring(i, i + strLen));

            i += strLen;


        }
        return strs;
    }
}

//Modus Operandi
//I need to keep a list of how long each string is
//I need to keep a string of the length of the string
//Now I need to concatenate it. 
//The number leading the string will be the length of the array.
//The numbers there after will be the length of the string
//Solve edge cases e.g. when the str is empty.
