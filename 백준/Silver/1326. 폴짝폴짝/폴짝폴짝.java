import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];
        for(int i=0;i<num;i++) arr[i] = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st2.nextToken());
        int end = Integer.parseInt(st2.nextToken());

        int[] visited = new int[arr.length];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start-1, 0});
        visited[start-1] = 1;

        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            if(temp[0] == end - 1){
                System.out.print(temp[1]);
                return;
            }
            int index = temp[0];
            while(true) {
                index += arr[temp[0]];
                if(index >= arr.length) break;
                if(visited[index] == 1) continue;
                visited[index] = 1;
                queue.add(new int[]{index, temp[1] + 1});
            }
            while(true) {
                index -= arr[temp[0]];
                if(index < 0) break;
                if(visited[index] == 1) continue;
                visited[index] = 1;
                queue.add(new int[]{index, temp[1] + 1});
            }
        }
        System.out.print("-1");
    }
}
