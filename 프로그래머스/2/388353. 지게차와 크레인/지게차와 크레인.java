import java.util.*;
class Solution {
    public int solution(String[] storage, String[] requests) {
        int[] y = {1, -1, 0, 0};
        int[] x = {0, 0, 1, -1};
        char[][] map = new char[storage.length + 2][storage[0].length() + 2];
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++) map[i][j] = '0';
        }
        for(int i=1;i<map.length - 1;i++){
            for(int j=1;j<map[0].length - 1;j++){
                map[i][j] = storage[i-1].charAt(j-1);
            }
        }
        
        for(int i=0;i<requests.length;i++){
            if(requests[i].length() == 1){ // 1개면 BFS
                int[][] visited = new int[map.length][map[0].length];
                List<int[]> list = new ArrayList<>();
                Queue<int[]> queue = new LinkedList<>();
                queue.add(new int[]{0, 0});
                visited[0][0] = 1;
                
                while(!queue.isEmpty()) {
                    int[] temp = queue.poll();
                    for(int j=0;j<4;j++){
                        int newY = temp[0] + y[j];
                        int newX = temp[1] + x[j];
                        if(0 <= newY && newY < map.length
                          && 0 <= newX && newX < map[0].length
                          && visited[newY][newX] == 0) {
                            if(map[newY][newX] == '0'){
                                queue.add(new int[]{newY, newX});
                                visited[newY][newX] = 1;
                            }
                            if(map[newY][newX] == requests[i].charAt(0)) {
                                list.add(new int[]{newY, newX});
                            }
                        }
                    }
                }
                for(int j=0;j<list.size();j++){
                    map[list.get(j)[0]][list.get(j)[1]] = '0';
                }
            }
            else {
                for(int j=0;j<map.length;j++){
                    for(int k=0;k<map[0].length;k++){
                        if(map[j][k] == requests[i].charAt(0)) {
                            map[j][k] = '0';
                        }
                    }
                }
            }
        }
        int answer = 0;
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                if(map[i][j] != '0') answer++;
            }
        }
        return answer;
    }
}