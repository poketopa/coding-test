import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(flag[i]){
                for(int j=0;j<2 * arr[i];j++){
                    list.add(arr[i]);
                }
            } else {
                for(int j=0;j<arr[i];j++){
                    list.remove(list.size()-1);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}