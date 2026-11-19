class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Use PriorityQueue

        Map<Integer, Integer> frequency = new HashMap<>();

        for(int num : nums){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        Queue<int[]> heap = new PriorityQueue<>((a,b) -> a[1] - b[1]);

        for(Map.Entry<Integer, Integer> e : frequency.entrySet()){
            heap.offer(new int[]{e.getKey(), e.getValue()});
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = heap.poll()[0];
        }

        return result;
    }
}









































//Brute Force Approach #first solution
//Use a hashmap to store each value
//Iterate through every key and get their values
//Once we have retrieved the most frequent and its value, we should set it to zero and keep going 
//Until we reach K

        // Map<Integer, Integer> occurences = new HashMap<>();

        // for(int num : nums){
        //     occurences.put(num, occurences.getOrDefault(num, 0) + 1);
        // }

        // int[] topK = new int[k];
        
        // int maxSoFar = 0;
        // int key = 0;
        // for(int i  = 0; i < k; i++){
        //     for(Integer num : occurences.keySet()){
        //         int frequency = occurences.get(num);
        //         if(frequency > maxSoFar){
        //             maxSoFar = frequency;
        //             key = num;
        //         }
        //     }

        //     topK[i] = key;
        //     occurences.put(key, 0);
        //     maxSoFar = 0;
        // }
        // return topK;