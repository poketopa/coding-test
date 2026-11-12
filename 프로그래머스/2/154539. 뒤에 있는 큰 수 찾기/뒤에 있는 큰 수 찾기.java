import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Deque<int[]> deque = new ArrayDeque<>();
        for(int i=0;i<numbers.length;i++){
            if(deque.isEmpty()){
                deque.addFirst(new int[]{numbers[i], i});
                continue;
            }
            while(!deque.isEmpty() && deque.peekFirst()[0] < numbers[i]){
                if(deque.isEmpty()){
                   deque.addFirst(new int[]{numbers[i], i}); 
                }
                int[] temp = deque.pollFirst();
                answer[temp[1]] = numbers[i];
            }
            deque.addFirst(new int[]{numbers[i], i});
        }
        for(int i=0;i<answer.length;i++){
            if(answer[i] == 0) answer[i] = -1;
        }
        return answer;
    }
}