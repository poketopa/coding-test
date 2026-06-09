import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        int[] result = new int[speeds.length];
        for(int i=0;i<result.length;i++){
            result[i] = (100 - progresses[i]) / speeds[i];
            if(progresses[i] + result[i] * speeds[i] < 100) result[i]++;
        }
        for(int i : result) {
            queue.add(i);  
        }
        
        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            int count = 1;
            int temp = queue.poll();
            while(!queue.isEmpty() && queue.peek() <= temp){
                queue.poll();
                count++;
            }
            list.add(count);
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++) answer[i] = list.get(i);
        return answer;
    }
}