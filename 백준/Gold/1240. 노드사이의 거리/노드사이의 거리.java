    import java.util.*;
    import java.io.*;

    public class Main {
        public static void main(String args[]) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // StringTokenizer st = new StringTokenizer(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            List<List<int[]>> list = new ArrayList<>();
            for(int i=0;i<=N;i++) list.add(new ArrayList<>());

            for(int i=0;i<N-1;i++){
                st = new StringTokenizer(br.readLine());
                int to = Integer.parseInt(st.nextToken());
                int from = Integer.parseInt(st.nextToken());
                int distance = Integer.parseInt(st.nextToken());
                list.get(to).add(new int[]{from, distance});
                list.get(from).add(new int[]{to, distance});
            }

            x: for(int i=0;i<M;i++){
                st = new StringTokenizer(br.readLine());
                int to = Integer.parseInt(st.nextToken());
                int from = Integer.parseInt(st.nextToken());
                int[] visited = new int[N + 1];
                Queue<int[]> queue = new LinkedList<>();
                queue.add(new int[]{to, 0});
                visited[to] = 1;
                while(!queue.isEmpty()) {
                    int[] temp = queue.poll();
                    if(temp[0] == from) {
                        System.out.println(temp[1]);
                        continue x;
                    }
                    for(int j=0;j<list.get(temp[0]).size();j++) {
                        if(visited[list.get(temp[0]).get(j)[0]] == 0) {
                            queue.add(new int[]{list.get(temp[0]).get(j)[0], temp[1] + list.get(temp[0]).get(j)[1]});
                            visited[list.get(temp[0]).get(j)[0]] = 1;
                        }
                    }
                }
            }
        }
    }
