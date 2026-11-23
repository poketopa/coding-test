import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        int temp = k;
        List<Integer> list = new ArrayList<>();
        while(n >= k){
            list.add(k);
            k += temp;
        }
        int[] answer = new int[list.size()];
        for(int i =0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}