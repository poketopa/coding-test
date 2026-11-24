import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        String input1 = br.readLine();
        String input2 = br.readLine();

        int[][] dp = new int[input1.length() + 1][input2.length() + 1];

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(input1.charAt(i-1) == input2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(Math.max(dp[i-1][j-1], dp[i-1][j]), dp[i][j-1]);
                }
            }
        }
        int max = -1;
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                max = Math.max(max, dp[i][j]);
            }
        }
        System.out.print(max);
    }
}
