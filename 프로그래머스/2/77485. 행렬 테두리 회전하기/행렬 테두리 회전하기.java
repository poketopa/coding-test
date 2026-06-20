class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[][] map = new int[rows][columns];
        int count = 1;
        int[] answer = new int[queries.length];
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                map[i][j] = count++;
            }
        }
        for(int i=0;i<queries.length;i++){
            int min = Integer.MAX_VALUE;
            int y1 = queries[i][0]-1;
            int x1 = queries[i][1]-1;
            int y2 = queries[i][2]-1;
            int x2 = queries[i][3]-1;
            int rightUp = map[y1][x2];
            min = Math.min(rightUp, min);
            for(int x=x2;x>x1;x--){
                min = Math.min(min, map[y1][x-1]);
                map[y1][x] = map[y1][x-1];
            }
            for(int y=y1;y<y2;y++){
                min = Math.min(min, map[y+1][x1]);
                map[y][x1] = map[y+1][x1];
            }
            for(int x=x1;x<x2;x++){
                min = Math.min(min, map[y2][x+1]);
                map[y2][x] = map[y2][x+1];
            }
            for(int y=y2;y>y1;y--){
                min = Math.min(min, map[y-1][x2]);
                map[y][x2] = map[y-1][x2];
            }
            map[y1+1][x2] = rightUp;
            answer[i] = min;
        }
        return answer;
    }
}