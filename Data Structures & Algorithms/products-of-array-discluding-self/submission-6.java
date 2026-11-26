class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result  = new int[nums.length];

        int prefix = 1;
        for(int i = 0; i < nums.length; i++){
            //There is a slight trick, during the first round, when I am calculating the product of the rest; it should just be dividing by the nest index, but avoid using the multiplication, I can go the other way. start from the left, but I keep going left and calculate the prefix and put it at that position. i.e. if the array is [1, 2, 3, 4], I start from the left which is 1, what is the product of all elements to the left of 1? there is none, so we put a default value of 1. 
            //Now we go onto the second index which harbors 2, what is the product of the left index, we just grab what is meant to be the prefix which is 1 and then we multiply it by what is at first index and we get 1, we put 1 in the second index and move onto the third index
            //Little side note, before we jump to the next index we should be multiplying the prefix by what is at the current index in nums so we do not need to jump back.
            //Now we move onto the third index which harbors 3, what is the product of the left index, we have already calculated the suffix which we will just slot in, then multiply it by what is in the third index of nums
            //Now we move onto the fourth index which has 4, but we have already calculated the product before we moved onto the fourth index so now we keep it, the loop will still calculate the prefix for 4 but will have no where to put it so we just lose it. //TBH I do not know how this works, but I will still give it a go.
    //Now to write the first for loop
    //[1, 1, 2, 6]
            if(i == 0){
                result[i] = 1;
                prefix *= nums[i];
            }else{
            
            result[i] = prefix;
            prefix  = result[i] * nums[i];
            }
        }
            int suffix = 1;
        for(int i = nums.length - 1; i >= 0; i--){
                result[i] *= suffix;
                suffix *= nums[i];

        }
        return result;
    }
}  

//I will try to implement the prefix and suffix approach but I do not understand it very well
//From what I understand
    //It can be done with only the resulting array
    //At everyindex in the first pass starting from the left: I want to calculate what is the product of the of every element to the right;
    //Then on the second pass starting from the right: I want to I want to multiply the index of that resulting array with what is the product of the left. 
    //The edge arrays will be a problem but there is something about putting a 1 there. 
    //Now let's code.
