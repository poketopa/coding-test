import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while(true) {
            if(list.isEmpty()) {
                list.add(arr[i]);
                i++;
            }
            else if(list.get(list.size()-1) < arr[i]){
                list.add(arr[i]);
                i++;
            }
            else if(list.get(list.size()-1) >= arr[i]){
                list.remove(list.size()-1);
            }
            if(i == arr.length) break;
        }
        int[] answer = new int[list.size()];
        for(int j=0;j<answer.length;j++) answer[j] = list.get(j);
        return answer;
    }
}