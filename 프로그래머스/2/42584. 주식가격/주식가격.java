import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        Stack<int[]> stack = new Stack<>();
        int[] answer = new int[prices.length];
        for(int i=0;i<prices.length;i++){
            while(!stack.isEmpty() && stack.peek()[0] > prices[i]){
                int[] temp = stack.pop();
                answer[temp[1]] = i - temp[1] ;
            }
            stack.add(new int[]{prices[i], i});
        }
        while(!stack.isEmpty()){
            int[] temp = stack.pop();
            answer[temp[1]] = prices.length - temp[1] - 1;
        }
        return answer;
    }
}