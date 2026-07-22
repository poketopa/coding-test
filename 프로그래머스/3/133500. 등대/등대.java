import java.util.*;

class Solution {
    static int result = 0;
    
    public int solution(int n, int[][] lighthouse) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=1;i<=n;i++) map.put(i, new ArrayList<>());
        int[] visited = new int[n + 1];
        int[] light = new int[n + 1];
        for(int i=0;i<lighthouse.length;i++){
            int a = lighthouse[i][0];
            int b = lighthouse[i][1];
            map.get(a).add(b);
            map.get(b).add(a);
        }
        
        dfs(map, visited, light, 1);
        
        return result;
    }
    
    public void dfs(Map<Integer, List<Integer>> map, int[] visited, int[] light, int now) {
        visited[now] = 1;
        int count = 0;
        
        for(int i=0;i<map.get(now).size();i++){
            if(visited[map.get(now).get(i)] == 1) continue;
            dfs(map, visited, light, map.get(now).get(i));
            count++;
        }
        if(count == 0){
            visited[now] = 0;
            return;
        }
        for(int i=0;i<map.get(now).size();i++){
            if(visited[map.get(now).get(i)] == 0 && light[map.get(now).get(i)] == 0) {
                light[now] = 1;
                result++;
                visited[now] = 0;
                return;                
            }
        }
        visited[now] = 0;
    }
}