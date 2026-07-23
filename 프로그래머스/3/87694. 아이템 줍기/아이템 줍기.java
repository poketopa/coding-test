import java.util.*;
class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[] y = new int[]{1, -1, 0, 0};
        int[] x = new int[]{0, 0, 1, -1};
        int[][] map = new int[110][110]; // 두 배 처리하니까 최대한 크게
        for(int i=0;i<rectangle.length;i++){
            int x1 = rectangle[i][0] * 2;
            int y1 = rectangle[i][1] * 2;
            int x2 = rectangle[i][2] * 2;
            int y2 = rectangle[i][3] * 2; // 스케일 2배 확대
            for(int j=x1;j<=x2;j++){
                for(int k=y1;k<=y2;k++){
                    map[j][k] = 1;   // 사각형 구역이 1로 채워짐
                }
            }
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        map[0][0] = -1;
        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            for(int i=0;i<4;i++){
                int newX = temp[0] + x[i];
                int newY = temp[1] + y[i];
                if(0 <= newY && newY < 110
                   && 0 <= newX && newX < 110
                   && map[newX][newY] == 0) {
                    map[newX][newY] = -1;
                    queue.add(new int[]{newX, newY}); // 외곽 부분이 -1로 채워짐 
                }
            }
        } // 자 여기서~~~~~~~~ CRACK 들어갑니다
        // 테두리를 2로 바꿔버린다면? 계산하기 쉽겠죠?
        // 근데 테두리는? 주변에 -1이 존재하는 곳~~ 이므로
        // 이중포문 바로 때려버리면
        for(int i=1;i<109;i++) {
            for(int j=1;j<109;j++){
                // check
                if(map[i][j] != 1) continue;
                for(int k=-1;k<=1;k++){
                    for(int l=-1;l<=1;l++){
                        if(map[i + k][j + l] == -1){
                            map[i][j] = 2;
                            continue;
                        }
                    }
                }
            }
        }
        characterX *= 2;
        characterY *= 2;
        itemX *= 2;
        itemY *= 2;
        int[][] visited = new int[110][110];
        queue.add(new int[]{characterX, characterY, 0});
        visited[characterX][characterY] = 1;
        
        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            if(temp[0] == itemX && temp[1] == itemY) {
                return temp[2] / 2;
            }
            
            for(int i=0;i<4;i++){
                int newX = temp[0] + x[i];
                int newY = temp[1] + y[i];
                
                if(map[newX][newY] == 2 && visited[newX][newY] == 0){
                    queue.add(new int[]{newX, newY, temp[2] + 1});
                    visited[newX][newY] = 1;
                }
            }
        }
        return 0;
    }
}