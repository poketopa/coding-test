import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                list.add(arr[i]);
                if(list.size() == k){
                    break;
                }
            }
        }
        int[] answer = new int[k];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        for(int i=list.size();i<answer.length;i++){
            answer[i] = -1;
        }
        return answer;
    }
}