import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] items = new int[N + 1][2];
        for(int i=0;i<N;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            items[i + 1][0] = Integer.parseInt(st2.nextToken());
            items[i + 1][1] = Integer.parseInt(st2.nextToken());
        }

        int[][] dp =  new int[N + 1][K + 1];
        for(int i=1;i<=N;i++){
            for(int j=0;j<=K;j++){
                if(j < items[i][0]) { // 아직 가방에 넣을 수 없으면 이전 것 가져옴
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-items[i][0]] + items[i][1]);
                }
            }
        }

        System.out.print(dp[dp.length-1][dp[0].length-1]);
    }
}
