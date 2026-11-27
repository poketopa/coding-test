    import java.util.*;
    import java.io.*;

    public class Main {
        public static void main(String args[]) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // StringTokenizer st = new StringTokenizer(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());

            List<List<Integer>> list = new ArrayList<>();
            for(int i=0;i<=N;i++) list.add(new ArrayList<>());

            for(int i=0;i<M;i++){
                st = new StringTokenizer(br.readLine());
                int to = Integer.parseInt(st.nextToken());
                int from = Integer.parseInt(st.nextToken());
                list.get(to).add(from);
                list.get(from).add(to);
            }
            for(int i=0;i<list.size();i++){
                Collections.sort(list.get(i), Collections.reverseOrder());
            }
            int[] answer = new int[N + 1];
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{R, 1});
            int[] visited = new int[N + 1];
            visited[R] = 1;
            answer[R] = 1;
            int count = 1;

            while(!queue.isEmpty()){
                int[] temp = queue.poll();
                for(int i=0;i<list.get(temp[0]).size();i++){
                    if(visited[list.get(temp[0]).get(i)] == 1) continue;
                    queue.add(new int[]{list.get(temp[0]).get(i), temp[1] + 1});
                    visited[list.get(temp[0]).get(i)] = 1;
                    answer[list.get(temp[0]).get(i)] = ++count;
                }
            }
            for(int i =1;i<=N;i++) System.out.println(answer[i]);
        }
    }
