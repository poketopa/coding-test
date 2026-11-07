import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        x: for(int i=0;i<queries.length;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=queries[i][0];j<queries[i][1] + 1;j++){
                list.add(arr[j]);
            }
            Collections.sort(list);
            for(int j=0;j<list.size();j++){
                if(list.get(j) > queries[i][2]) {
                    answer[i] = list.get(j);
                    continue x;
                }
            }
            answer[i] = -1;
        }
        return answer;
    }
}