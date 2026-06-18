import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        if(n == 1){
            int[] answer = new int[b +1];
            for(int i=0;i<=b;i++){
                answer[i] = num_list[i];
            }
            return answer;
        } else if(n == 2) {
            int[] answer = new int[num_list.length - a];
            for(int i=a;i<num_list.length;i++){
                answer[i-a] = num_list[i];
            }
            return answer;
        } else if(n == 3) {
            int[] answer = new int[b - a + 1];
            for(int i=a;i<=b;i++){
                answer[i-a] = num_list[i];
            }
            return answer;
        } else {
            List<Integer> list = new ArrayList<>();
            for(int i=a;i<=b;i+=c){
                list.add(num_list[i]); 
            }
            int[] answer = new int[list.size()];
            for(int i=0;i<list.size();i++) answer[i] = list.get(i);
            return answer;
        }
    }
}