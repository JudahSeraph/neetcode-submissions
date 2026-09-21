class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*Will use a hashset
        I will use the boolean method in the add operation on the hashset
        If it is not added, it should set the boolean flag to true*/
        Set<Integer> numbers = new HashSet<>();
        for(int num : nums){
            if(!numbers.add(num)) return true;
        }
        return false;
    }
}