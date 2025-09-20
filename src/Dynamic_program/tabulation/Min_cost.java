package Dynamic_program.tabulation;

import Dynamic_program.Min_cost_climb_stairs;

public class Min_cost {
    public static  int mincost(int[] cost) {
        int n=cost.length;
        int[]dp=new int[n];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        Min_cost_climb_stairs m = new Min_cost_climb_stairs();
        System.out.println(Min_cost.mincost(cost)); // Output: 6
    }
}
