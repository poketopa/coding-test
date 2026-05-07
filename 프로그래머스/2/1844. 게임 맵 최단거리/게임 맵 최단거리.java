import java.util.*;
class Solution {
    public int solution(int[][] map) {
        int[] target = new int[]{map.length-1, map[0].length-1};
        int[][] visited = new int[map.length][map[0].length];
        int[] y = {1, -1, 0, 0};
        int[] x = {0, 0, 1, -1};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = 1;
            
        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            if(target[0] == temp[0] && target[1] == temp[1]){
                return temp[2];
            }
            for(int i=0;i<4;i++){
                int newY = temp[0] + y[i];
                int newX = temp[1] + x[i];
                if(0 <= newY && newY < map.length &&
                  0 <= newX && newX < map[0].length &&
                  map[newY][newX] == 1 &&
                  visited[newY][newX] == 0){
                    queue.add(new int[]{newY, newX, temp[2] + 1});
                    visited[newY][newX] = 1;
                }
            }
        }
        return -1;
    }
}