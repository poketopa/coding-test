    import java.util.*;
    import java.io.*;

    public class Main {
        public static void main(String args[]) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // StringTokenizer st = new StringTokenizer(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int column = Integer.parseInt(st.nextToken());
            int row = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            int[][] dp = new int[column + 1][row + 1];
            int count = 0;
            int targetY = column;
            int targetX = row;
            if(number != 0){
                x:for(int i=1;i<=column;i++){
                    for(int j=1;j<=row;j++){
                        count++;
                        if(count == number){
                            targetY = i;
                            targetX = j;
                            break x;
                        }
                    }
                }
            }



            dp[0][1] = 1;
            for(int i=1;i<=targetY;i++){
                for(int j=1;j<=targetX;j++){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
            if(number == 0) {
                System.out.print(dp[column][row]);
                return;
            }
            int temp = dp[targetY][targetX];
            dp[targetY][targetX] = 0;
            dp[targetY][targetX - 1] = 1;
            dp[targetY-1][targetX] = 0;
            for(int i=targetY;i<=column;i++){
                for(int j=targetX;j<=row;j++){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
            System.out.print(temp * dp[column][row]);
        }
    }
