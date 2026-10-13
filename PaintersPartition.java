package DSA150;

public class Solution{
    public int PaintersPartition(int[] nums, int m) {
        int n = nums.length;
        Arrays.sort(nums);
        int str = nums[0], end = nums.length-1;
        int ans = -1;
        while(str<=end){
            int mid = str+(end-str)/2;
            if(isPossible(nums,m,mid)){
                ans=mid;
                end=mid-1;
            }else{
                str=mid+1;
            }
        }
        return ans;
    }
    
    public static boolean isPossible(int[] nums, int m,int maxAllowedTime){
        int painters = 1, time=0;
        for(int i = 0;i<n;i++){
            if(time+nums[i]<=maxAllowedTime){
                time += nums[i];
            }else {
                painters++ ;
                time = nums[i];
            }
        }
        return painters<=m;
    }
}
