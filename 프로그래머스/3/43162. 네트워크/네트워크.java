class Solution {
    public int solution(int n, int[][] computers) {
        int[] visited = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(visited[i] == 1) continue;
            count++;
            visited[i] = 1;
            dfs(i, computers, visited);   
        }
        return count;
    }
    
    public void dfs(int now, int[][] computers, int[] visited){
        for(int i=0;i<computers.length;i++){
            if(visited[i] == 1 || now == i || computers[now][i] == 0) {
                continue;
            }
            visited[i] = 1;
            System.out.println("dfs 탐색: " + i);
            dfs(i, computers, visited);
            
        }
    }
}