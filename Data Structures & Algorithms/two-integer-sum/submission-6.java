class Solution {
    public int[] twoSum(int[] nums, int target) {

        //fast first time methods have not worked, so I will use nested loops
        //first loop will contain the number we are looking for its complement
        //second loop will look for the number at i+1
        int[] arr = new int[2];

        Outer:
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] == complement){
                    arr[0] = i;
                    arr[1] = j;
                    break Outer;
                }
            }
        }

        return arr;

    }
}
