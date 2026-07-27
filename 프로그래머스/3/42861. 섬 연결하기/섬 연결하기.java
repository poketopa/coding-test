import java.util.*;
class Solution {
    static int[] parent;
    public int solution(int n, int[][] costs) {
        int sum = 0;
        int edgeCount = 0;
        
        parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
        }
        Arrays.sort(costs, (a, b) -> {
            return a[2] - b[2];
        });
        
        for(int i=0;i<costs.length;i++){
            int a = costs[i][0];
            int b = costs[i][1];
            int cost = costs[i][2];
            
            if(find(a) != find(b)){
                sum += cost;
                edgeCount++;
                union(a, b);
            }
            if(edgeCount == n - 1) return sum;
        }
        return 0;
    }
    
    private int find(int x) {
        if(parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }
    
    private void union(int a, int b){
        if(find(a) != find(b)) parent[find(b)] = find(a);
    }
}