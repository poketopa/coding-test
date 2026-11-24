    import java.util.*;
    import java.io.*;

    public class Main {
        public static void main(String args[]) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // StringTokenizer st = new StringTokenizer(br.readLine());

            int jump = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int column = Integer.parseInt(st.nextToken());

            int[][] map = new int[column][row];
            int[] y = {1, -1, 0, 0};
            int[] x = {0, 0, 1, -1};
            int[] horseY = {-1, -2, -2, -1, 1, 2, 2, 1};
            int[] horseX = {-2, -1, 1, 2, -2, -1, 1, 2};

            for(int i=0;i<column;i++){
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                for(int j=0;j<row;j++){
                    map[i][j] = Integer.parseInt(st2.nextToken());
                }
            }

            int[][] visited = new int[column][row];
            for(int i=0;i<column;i++) {
                Arrays.fill(visited[i], Integer.MAX_VALUE);
            }
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{0, 0, 0, 0}); // y, x, 점프 횟수, 이동 횟수
            visited[0][0] = 0;

            while(!queue.isEmpty()) {
                int[] temp = queue.poll();
                if(temp[0] == column - 1 && temp[1] == row - 1){
                    System.out.print(temp[3]);
                    return;
                }
                if(temp[2] < jump) {
                    for(int i=0;i<8;i++) {
                        int newY = temp[0] + horseY[i];
                        int newX = temp[1] + horseX[i];
                        if (0 <= newY && newY < column
                                && 0 <= newX && newX < row
                                && map[newY][newX] == 0
                                && visited[newY][newX] > temp[2] + 1) {
                            queue.add(new int[]{newY, newX, temp[2] + 1, temp[3] + 1});
                            visited[newY][newX] = temp[2] + 1;
                        }
                    }
                }
                for(int i=0;i<4;i++) {
                    int newY = temp[0] + y[i];
                    int newX = temp[1] + x[i];
                    if (0 <= newY && newY < column
                            && 0 <= newX && newX < row
                            && map[newY][newX] == 0
                            && visited[newY][newX] > temp[2]) {
                        queue.add(new int[]{newY, newX, temp[2], temp[3] + 1});
                        visited[newY][newX] = temp[2];
                    }
                }
            }
            System.out.print("-1");
        }
    }
