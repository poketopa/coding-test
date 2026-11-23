import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        int repeat = Integer.parseInt(br.readLine());
        List<Collection<Integer>> setList = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        int[] answer = new int[repeat];
        int[] time = new int[repeat];
        for(int i=0;i<repeat;i++){
            setList.add(new HashSet<>());
            countMap.put(i, 0);
        }
        for(int i=0;i<repeat;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            int edge = Integer.parseInt(st.nextToken());
            for(int j=0;j<edge;j++){
                int next = Integer.parseInt(st.nextToken()) - 1;
                setList.get(i).add(next);
                countMap.put(next, countMap.get(next) + 1);
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<repeat;i++){
            if(countMap.get(i) == 0){
                queue.add(i);
                answer[i] = time[i];
            }
        }

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(int i : setList.get(temp)){
                countMap.put(i, countMap.get(i) - 1);
                answer[i] = Math.max(answer[temp] + time[i], answer[i]);
                if(countMap.get(i) == 0){
                    queue.add(i);
                }
            }
        }

        int max = -1;
        for(int i : answer){
            max = Math.max(max, i);
        }
        System.out.print(max);
    }
}
