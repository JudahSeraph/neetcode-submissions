class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Told I need to improve the HashMap implementation
        //What I am going to do is:
        //I will use a HashMap and a for loop
        //If the the complement is the key and the index is the value
        //At the start of the loop, I will check if the HashMap already contains the integer I am looking at as a key, if it does, I will retun an int array with the index in the HashMap and the current index. 

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            Integer complement = nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }else{
                map.put(target - nums[i], i);
            }
        }
        return new int[] {};
    }
}
