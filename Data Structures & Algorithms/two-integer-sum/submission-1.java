
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int k = 0; k < nums.length; k++) {
            int complement = target - nums[k];
            
            if (map.containsKey(complement)) {
                int i = map.get(complement);
                return new int[]{i, k}; 
            }
            
            map.put(nums[k], k);
        }
        return new int[0];
    }
}
