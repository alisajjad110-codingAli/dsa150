package DSA150;

public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int n = tickets.length;
        
        if (tickets[k] == 1) {
            return k+1;
        }
        
        while (tickets[k] > 0) {
            for (int i = 0; i<n; i++) {
                if (tickets[i] != 0) {
                    tickets[i]--;
                    time++;
                }
                
                if (tickets[k] == 0) {
                    return time;
                }
            }
        }
        
        return time;
    }
    //more optimized approach
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int n = ticjets.length;
        
        for(int i = 0; i<n; i++) {
            if (i<=k) time += Math.min(tickets[i], tickets[k]);
            else time += Math.min(tickets[i], tickets[k]-1);
        }
        return time;
    }
}