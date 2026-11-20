class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complement = new HashMap<>();

        int i = 0;
        for(int num : nums){
            int diff = target - num;
            if(complement.containsKey(diff)){
                return new int[]{complement.get(diff), i};
            }else{
                complement.put(num, i);
            }
            i++;
        }

        return new int[]{};
    }
}
