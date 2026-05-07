import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        int[][] visited = new int[maps.length][maps[0].length];
        int[] y = {1, -1, 0, 0};
        int[] x = {0, 0, 1, -1};
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = 1;
        
        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            if(temp[0] == maps.length-1 && temp[1] == maps[0].length - 1){
                return temp[2];
            }
            
            for(int i=0;i<4;i++){
                int newY = temp[0] + y[i];
                int newX = temp[1] + x[i];
                if(0 <= newY && newY < maps.length &&
                  0 <= newX && newX < maps[0].length &&
                  maps[newY][newX] == 1 && 
                  visited[newY][newX] == 0){
                    queue.add(new int[]{newY, newX, temp[2] + 1});
                    visited[newY][newX] = 1;
                }
            }
        }
        return -1;
    }
}