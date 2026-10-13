package DSA150;

public class Solution{
    public int SingleSortedArray(int[] arr) {
        //Brute-Force Approach
        for(int i=0;i<arr.length;i+=2){
            if(arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
    
    public int SingleSortedArrayByBit(int[] arr){
        //By Bit-Manupulation
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans ^= arr[i];
        }
        return ans;
    }
    // By BS
    public int SingleSortedByBS(int[] arr){
        int left = 0;
        int right = arr.length-1;
        
        while(left<right){
            int mid = left + (right-left)/2;
            if(mid%2==1){
                mid--;
            }
            if(arr[mid] == arr[mid+1]){
                left = mid+2;
            }else{
                right=mid;
            }
        }
        return arr[left];
    }
}
