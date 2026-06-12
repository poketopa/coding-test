import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<intStrs.length;i++){
            int temp = Integer.parseInt(intStrs[i].substring(s, s + l));
            if(temp > k) {
                list.add(temp);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}