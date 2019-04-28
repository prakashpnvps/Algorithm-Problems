class Solution {
    //BruteForce: O(n3m3) -> n2m2 for all possible rectangles, nm to check if all are 1's
    //DP Complexity: O(n2m)
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0)
            return 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        
        int maxA = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == '1'){
                    dp[i][j] = (j==0) ? 1 : dp[i][j-1]+1;
                    
                    int k = i, maxW = dp[i][j];
                    while(k >= 0){
                        maxW = Math.min(maxW, dp[k][j]);
                        maxA = Math.max(maxA, maxW*(i-k+1));
                        k--;
                    }
                }
            }
        }
        return maxA;
    }
}