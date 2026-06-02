class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] diff  = new int[nums.length];
        int[] sum = new int[2];
        for(int i = 0; i < nums.length; i++){
            diff[i] = target - nums[i];
        }
        boolean truth  = false;
        for(int i = 0; i < nums.length; i++){
            if(truth == true) break;
            for(int k = 0; k < nums.length; k++){
                if(truth == true) break;
                if((i != k) && (nums[i] == diff[k]) && truth == false){
                    sum[0] = i;
                    sum[1] = k;
                    truth  = true;
                }
            }
        }
        return sum;
    }
}
