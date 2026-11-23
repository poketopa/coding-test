import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());

        int[][] map = new int[column][row];
        int[][] visited = new int[column][row];
        for(int i=0;i<column;i++){
            String input = br.readLine();
            Arrays.fill(visited[i], Integer.MAX_VALUE);
            for(int j=0;j<row;j++){
                map[i][j] = input.charAt(j) - '0';
            }
        }
        int min = Integer.MAX_VALUE;
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> {
            if(a[2] != b[2]) return Integer.compare(a[2], b[2]);
            else {
                return Integer.compare(b[0] + b[1], a[0] + a[1]);
            }
        });
        queue.add(new int[]{0, 0, 0});
        visited[0][0] = 0;
        int[] y = {1, -1, 0, 0};
        int[] x = {0, 0, 1, -1};
        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            if (temp[0] == column - 1 && temp[1] == row - 1) {
                System.out.print(temp[2]);
                return;
            }
            for (int i = 0; i < 4; i++) {
                int newY = temp[0] + y[i];
                int newX = temp[1] + x[i];
                if (0 <= newY && newY < column
                        && 0 <= newX && newX < row) {
                    if (map[newY][newX] == 0 && visited[newY][newX] > temp[2]) {
                        queue.add(new int[]{newY, newX, temp[2]});
                        visited[newY][newX] = temp[2];
                    } else if(map[newY][newX] == 1 && visited[newY][newX] > temp[2] + 1){
                        queue.add(new int[]{newY, newX, temp[2] + 1});
                        visited[newY][newX] = temp[2] + 1;
                    }
                }
            }
        }
    }
}
