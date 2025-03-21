
// Time Complexity : O(k*n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
dp
 */
class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = 1; j <= k && (i - j + 1) >= 0; j++) {
                max=Math.max(max,arr[i-j+1]);
                if(i-j<0){
                    dp[i]=Math.max(dp[i],max*j+0);
                }
                else {
                    dp[i]=Math.max(dp[i],max*j+dp[i-j]);
                }
            }
        }
        return dp[arr.length-1];
    }
}




