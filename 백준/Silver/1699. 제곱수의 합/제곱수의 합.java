    import java.util.*;
    import java.io.*;

    public class Main {
        public static void main(String args[]) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // StringTokenizer st = new StringTokenizer(br.readLine());

            int number = Integer.parseInt(br.readLine());
            int[] dp = new int[100001];
            dp[0] = 0;
            for(int i=1;i<=100000;i++){
                dp[i] = i;
                for(int j=1;j*j <= i;j++) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
                }
            }
            System.out.print(dp[number]);
        }
    }
