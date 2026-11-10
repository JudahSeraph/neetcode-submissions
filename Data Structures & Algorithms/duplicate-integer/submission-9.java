class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Optimization: Add to HashSet and compare size
        Set<Integer> uniqueNums = new HashSet<>();
        for(int num : nums){
            if(!uniqueNums.add(num)) return true;
        }
        return nums.length > uniqueNums.size();
    }
}

//Brute force approach
// for(int i = 0; i < nums.length; i++){
//     for(int j = i + 1; j < nums.length; j++){
//         if(nums[i] == nums[j]){
//             return true;
//         }
//     }
// }
// return false;

//The solution above is O(n^2) time complexity because of the nested loop
//and O(1) space complexity because no auxiliary space was used