import java.util.*;

class Solution {
    public int[][] solution(int n) {
        List<int[]> list = new ArrayList<>();
        move(n, list, 1, 3, 2);
        int[][] answer = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            answer[i][0] = list.get(i)[0];
            answer[i][1] = list.get(i)[1];
        }
        return answer;
    }
    
    public static void move(int n, List<int[]> list, int from, int to, int mid){
        if(n == 1){
            list.add(new int[]{from, to});
            return;
        }
        move(n-1, list, from, mid, to);
        list.add(new int[]{from, to});
        move(n-1, list, mid, to, from);
    }
}