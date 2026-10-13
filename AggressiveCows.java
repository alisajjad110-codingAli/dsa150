package DSA150;

public class Solution{
    public int AggressiveCows(int[] nums) {
        Arrays.sort(nums);
        int ans = -1;
        int str=nums[0],end =(nums.length-1)-arr[0];
        while(str<=end){
            mid = str+ (end-str)/2;
            if(isPossible(mid,nums)){
                ans=mid;
                str = mid+1;
            }else {
                end = mid-1;
            }
        }
        return ans;
    }
    
    public boolean isPossible(int mid, int[] nums) {
        int c =3, cows=1;
        int lastPlaced = nums[0];
        for (int i =1; i<n;i++){
            if(nums[i]-lastPlaced >=mid){
                cows++;
                lastPlaced = nums[i];
            }
            if(cows==c) return true;
        }
        return false;
    }
}
