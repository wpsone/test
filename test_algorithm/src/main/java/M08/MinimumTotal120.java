package M08;

import java.util.Arrays;
import java.util.List;

public class MinimumTotal120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[2][n];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 0; i < n; i++) {
            int ind = i % 2;
            int pre_ind = (ind==1?0:1);
            int j=0;
            //第一行 与 斜边特殊处理
            while (j<i) {
                if (j==0) dp[ind][0] = dp[pre_ind][0] + triangle.get(i).get(0);
                else dp[ind][j] = Math.min(dp[pre_ind][j-1],dp[pre_ind][j])+triangle.get(i).get(j);
                j++;
            }
            dp[ind][j]=dp[pre_ind][j-1]+ triangle.get(i).get(j);
        }
        return Arrays.stream(dp[(n-1)%2]).min().getAsInt();
    }
}
