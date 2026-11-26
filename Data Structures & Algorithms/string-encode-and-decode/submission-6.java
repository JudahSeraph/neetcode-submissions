class Solution {

    public String encode(List<String> strs) {
        StringBuilder word = new StringBuilder();

        for(String str : strs){
            word.append(str.length());
            word.append("#");
            word.append(str);
        }

        return word.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();

        int i = 0;
        while(i < str.length()){
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }//when this loop finishes, j should be at # which means that valid numbers are within i and j - 1

            int length  = Integer.parseInt(str.substring(i, j)); //the length should now be from i to j-1 but substring is exclusive
            i = j + 1;//I want to start at the position after #
            j = j + length + 1; //this should takt the length add it to j to indicate where we are ending, but because of exlusivity, I need to add 1. 
            String word = str.substring(i, j);
            i = j; //i should start just before we 

            strs.add(word);
        }

        return strs;
    }
}


//8#thisisme2#