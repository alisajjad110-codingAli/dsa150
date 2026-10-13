package DSA150;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0; i=m; j<nums1.length;j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }
    
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int midx = m-1;
        int nidx = n-1;
        int right = m+n-1;
        
        while (nidx>=0) {
            if (m>=0 && nums1[midx] > nums2[nidx]) {
                nums1[right] = nums1[midx];
                midx--;
            } else {
                nums1[right] = nums2[nidx];
                nidx--;
            }
            right--;
        }
    }
    
}