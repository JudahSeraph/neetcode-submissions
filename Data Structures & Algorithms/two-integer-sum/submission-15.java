class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Final Optimised Solution

        Map<Integer, Integer> complement = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            if(complement.containsKey(target - nums[i])){
                return new int[]{complement.get(target - nums[i]), i};
            }

            complement.put(nums[i], i);
        }

        return new int[]{0};
    }
}


        // //First Optimised solution
        // //Use a HashMap. 
        // //Space complexity is O(n)
        // //Time complexit is O(n)
        // int[] indices = new int[2];
        // Map<Integer, Integer> complement = new HashMap<>();
        // Map<Integer, Integer> numbers = new HashMap<>();

        // int i = 0;
        // for(int num : nums){
        //     int comp = target - num;
        //     if(!(complement.containsKey(comp))){
        //         complement.put(comp, i);
        //     }
        //     numbers.put(num, i);

        //     i++;
        // }
        
        // for(int num : complement.keySet()){
        //     if(numbers.containsKey(num) && complement.get(num) != numbers.get(num)){
                
        //         int index1 = complement.get(num);
        //         int index2 = numbers.get(num);

        //         if(index1 > index2){
        //             indices[0] = index2;
        //             indices[1] = index1;
        //         }else{
        //             indices[0] = index1;
        //             indices[1] = index2;
        //         }
        //     }
        // }

        // return indices;

    //Brute force solution
    //Use nested loops
    //Space complexity is O(1)
    //Time complexity is O(n^2)
        // int [] indices  = new int[2];
        // for(int i  = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if((nums[i] + nums[j]) == target){
        //             indices[0] = i;
        //             indices[1] = j;
        //             return indices;
        //         };
        //     }
        // }

        // return indices;