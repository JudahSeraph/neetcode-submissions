class Solution {
    public int[] twoSum(int[] nums, int target) {
        // I am thinking of using a HashMap
        // If two indexes have the same value, the value in the hash map would be their sum.
        //the second hashmap will only store the index of one

        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> second = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            first.putIfAbsent(target - nums[i], i);
            second.put(nums[i], i);
        }
        int[] arr = new int[2];
 
        for(Integer key : first.keySet()){
            if(second.containsKey(key)){
                int num1 = first.get(key);
                int num2 = second.get(key);
                if(num1 > num2){
                    arr[0] = num2;
                    arr[1] = num1;
                }else{
                    arr[0] = num1;
                    arr[1] = num2;
                }
            }
        }
        return arr;
    }
}
