package DSA150;

public class Solution{
    public int BookAllocationProblem(int[] arr, int k) {
        int str = 0;
        int end = 0, n = arr.length;
        for (int i =0; i<arr.length;i++){
            end += arr[i];
        }
        while(str<=end){
            int mid = s+(e-s)/2;
            if(isValid(arr,mid,k)){
                ans=mid;
                end = mid-1;
            } else{
                str=mid+1;
            }
        }
        return ans;
    }
    
    public static boolean isValid(int[] arr,int maxAllowedPages, int k){
        int student =1, pages =0;
        for(int i=0; i<n; i++){
            if(pages+arr[i] <= maxAllowedPages){
                pages += arr[i];
            }else{
                student++;
                pages = arr[i];
            }
        }
        return student<=k;
    }
}
