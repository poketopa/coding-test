import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        int input = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<input;i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
        }
        long[] dp = new long[1000001];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i=4;i<=1000000;i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            dp[i] %= 1000000009;
        }
        for(int i : list){
            System.out.println(dp[i]);
        }

    }
}
