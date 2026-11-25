class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int total = 1;
        int count = 0;
        int index = 0;
        int zeroIndex = 0;
        for(int num : nums){
            if(num == 0){
                count++;
                zeroIndex = index;
            }else{
                total *= num;
            }
            index++;
        }


        int[] products = new int[nums.length];
        if(count >= 2) return products;
        if(count == 1){
            products[zeroIndex] = total;
            return products;
        }
        for(int i = 0; i < nums.length; i++){
            products[i] = total / nums[i];
        }

        return products;
    }
}  

//Brute force approach will be to use a nested loop:
    //Calculate the product of every index except the one we are on
//Optimized approach will be to calculate all the product;
    //Then divide by the index
    //What if I have zero values: this will flatten the total.
    //If there are two zeros I want to return a 0 array
    //If there is only one zero, I want to mark it


// //Brute force 
// int[] products = new int[nums.length];

// for(int i = 0; i < nums.length; i++){
//     int product  = 1;
//     for(int j = 0; j < nums.length; j++){
//         if(i != j){
//             product *= nums[j];
//         }
//     }
//     products[i] = product;
// }

// return products;