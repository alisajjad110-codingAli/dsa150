package DSA150;

public class Solution {
    //HashMap
    //Time complexity: O(nlogk)
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int n : nums) {
            counter.put(n, counter.getOrDefault(n,0)+1);
        }
        
        PreorityQueue<Map.Entry<Integer, Integer>> heap = PriorityQueue<>(
        (a,b) -> Integer.compare(b.getValue(), a.getValue()));
        
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            heap.offer(entry);
        }
        
        int[] res = new int[k];
        for (int i = 0; i<k; i++) {
            res[i] = Objects.requireNonNull(head.poll()).getKey();
        }
        return res;
    }
    
    //2nd Approach: time complexity: O(n)
    
    public int[] topkFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int n : nums) {
            counter.put(n, counter.getOrDefault(n,0)+1);
        }
        
        List<Integer>[] freq = new ArrayList<>();
        for (int i =0; i<freq.length; i++) {
            freq[i] = new ArrayList<>();
        }
        
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            int frequency = entry.getValue();
            freq[frequency].add(entry.getKey());
        }
        int[] res = new int[k];
        int idx = 0;
        for (int i = freq.length-1; i>=0, i--) {
            for (int num : freq[i]) {
                res[idx++] = num;
                if (idx == k) {
                    return res;
                }
            }
        }
        return new int[0];
    }
    
}