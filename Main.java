package com.example.DSA150;
//LeetCode 169 Majority Element
// Q.1
/* My Approach
 
 */
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int freq = 1;
        int ans = nums[0];
        
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                freq++ ;
            } else {
                freq=1 ;
                ans = nums[i];
            }
            if (freq > nums.length/2) {
                return ans;
            }
        }
        return -1;
    }
}
//Short code of above code

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        return nums[n/2];
        
    }
}
        
        
// Moore's Voting Algorithm

class Solution {
    public int majorityElement(int[] nums) {
        int freq = 0;
        int ans = 0;
        
        for (int i = 0; i<nums.length; i++) {
              if (freq == 0) {
              ans = nums[i];
            }
            
            if (nums[i] == ans) {
                freq++;
            } else {
                freq--;
            }
            
        }
        return ans;
        
    }
}
// refer hashmap soln from leetcode and more optimal soln
// Hashmaps


class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        int res = 0;
        int majority = 0;
        
        for (int n : nums) {
            hash.put(n , 1+ getOrDefault(n,0));
            if (hash.get(n) > majority) {
                res = n;
                majority = hash.get(n);
            }
        }
        return res;
    }
}

// Refer this brute force method on youtube shardra kapra
