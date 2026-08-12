import java.util.*;
class Solution {
    static int answer = 0;
    public int solution(int n) {
        int[][] map = new int[n][n];
        int[][] visited = new int[n][n];
        dfs(0, map, 0, visited);
        return answer;
    }
    
    public void dfs(int y, int[][] map, int count, int[][] visited){
        if(count == map.length) {
            answer++;
            return;
        }
        for(int i=0;i<map.length;i++){
            if(visited[y][i] == 0) {
                visited[y][i] = 1;
                check(visited);
                dfs(y + 1, map, count + 1, visited);
                visited[y][i] = 0;
                check(visited);
            }
        }
    }
    
    public void check(int[][] visited){
        for(int i=0;i<visited.length;i++){
            for(int j=0;j<visited.length;j++){
                if(visited[i][j] == 2) visited[i][j] = 0;
            }
        }
        for(int i=0;i<visited.length;i++){
            for(int j=0;j<visited.length;j++){
                int y = i;
                int x = j;
                if(visited[i][j] == 1) {
                    while(0 <= y && 0 <= x && x < visited.length && y < visited.length) {
                        visited[y][x] = 2;
                        y++;
                    }
                    y = i;
                    x = j;
                    while(0 <= y && 0 <= x && x < visited.length && y < visited.length) {
                        visited[y][x] = 2;
                        y--;
                    }
                    y = i;
                    x = j;
                    while(0 <= y && 0 <= x && x < visited.length && y < visited.length) {
                        visited[y][x] = 2;
                        x++;
                    }
                    y = i;
                    x = j;
                    while(0 <= y && 0 <= x && x < visited.length && y < visited.length) {
                        visited[y][x] = 2;
                        x--;
                    }
                    y = i;
                    x = j;
                    while(0 <= y && 0 <= x && x < visited.length && y < visited.length) {
                        visited[y][x] = 2;
                        x++;
                        y++;
                    }
                    y = i;
                    x = j;
                    while(0 <= y && 0 <= x && x < visited.length && y < visited.length) {
                        visited[y][x] = 2;
                        x++;
                        y--;
                    }
                    y = i;
                    x = j;
                    while(0 <= y && 0 <= x && x < visited.length && y < visited.length) {
                        visited[y][x] = 2;
                        x--;
                        y--;
                    }
                    y = i;
                    x = j;
                    while(0 <= y && 0 <= x && x < visited.length && y < visited.length) {
                        visited[y][x] = 2;
                        x--;
                        y++;
                    }
                    visited[i][j] = 1;
                }
            }
        }
    }
}