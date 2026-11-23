class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequencies = new HashMap<>();

        for(int num : nums){
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];

        for(int i = 0; i < bucket.length; i++){
            bucket[i] = new ArrayList<Integer>();
        }

        for(Integer key : frequencies.keySet()){
            bucket[frequencies.get(key)].add(key);
        }

        int index = 0;
        int[] result = new int[k];
        for(int i  = bucket.length - 1; i > 0 && index < k; i--){
            //I want to itereate thgout the arraylist at this index
            //I want to fill up result if the arraylist is not empty
            //The iterator automatically checks if empty with has next line
            //Therefore I could call the index of the bucket
            //Then say for each, add to result

            for(Integer num : bucket[i]){
                result[index++] = num;
            }
        }

        return result;
    }
}
//Todo:
//1 Count the frequency of every number with a hashmap
//Use a a bucket sort array to keep the frequencies in order
//Iterate through the last and keep k elements