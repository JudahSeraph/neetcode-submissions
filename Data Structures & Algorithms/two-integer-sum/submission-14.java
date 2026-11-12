class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Optimised solution
        //Use a HashMap. 
        int[] indexes = new int[2];
        Map<Integer, Integer> complement = new HashMap<>();
        Map<Integer, Integer> numbers = new HashMap<>();

        int i = 0;
        for(int num : nums){
            int comp = target - num;
            if(!(complement.containsKey(comp))){
                complement.put(comp, i);
            }
            numbers.put(num, i);

            i++;
        }
        
        for(int num : complement.keySet()){
            if(numbers.containsKey(num) && complement.get(num) != numbers.get(num)){
                
                int index1 = complement.get(num);
                int index2 = numbers.get(num);

                if(index1 > index2){
                    indexes[0] = index2;
                    indexes[1] = index1;
                }else{
                    indexes[0] = index1;
                    indexes[1] = index2;
                }
            }
        }

        return indexes;
    }
}


    //Brute force solution
    //Use nested loops
    //Space complexity is O(1)
    //Time complexity is O(n^2)
        // int [] indexes  = new int[2];
        // for(int i  = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if((nums[i] + nums[j]) == target){
        //             indexes[0] = i;
        //             indexes[1] = j;
        //             return indexes;
        //         };
        //     }
        // }

        // return indexes;