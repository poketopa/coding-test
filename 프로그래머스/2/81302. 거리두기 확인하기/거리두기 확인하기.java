import java.util.*;
class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        int[] y = {1, -1, 0, 0};
        int[] x = {0, 0, 1, -1};
        x: for(int l=0;l<5;l++){
            String[][] map = new String[5][5];
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    map[i][j] = String.valueOf(places[l][i].charAt(j));
                }
            }
            int[][] visited = new int[5][5];
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    if(visited[i][j] == 1) continue;
                    if(map[i][j].equals("P")){
                        visited[i][j] = 1;
                        Queue<int[]> queue = new LinkedList<>();
                        queue.add(new int[]{i, j, 0});
                        while(!queue.isEmpty()){
                            int[] temp = queue.poll();
                            if(temp[2] == 2) continue;
                            for(int k=0;k<4;k++){
                                int newY = temp[0] + y[k];
                                int newX = temp[1] + x[k];
                                if(0 <= newY && newY < 5
                                  && 0 <= newX && newX < 5
                                  && !map[newY][newX].equals("X")
                                  && visited[newY][newX] == 0){
                                    if(map[newY][newX].equals("P")){
                                        answer[l] = 0;
                                        continue x;
                                    }
                                    visited[newY][newX] = 1;
                                    queue.add(new int[]{newY, newX, temp[2] + 1});
                                }
                            }
                        }
                    }
                }
            }
            answer[l] = 1;
        }
        return answer;
    }
}