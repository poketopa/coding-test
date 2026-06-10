import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<int[]> queue = new LinkedList<>();
        int sum = truck_weights[0];
        int time = 2;
        int index = 1;
        
        queue.add(new int[]{truck_weights[0], bridge_length + 1});
        while(index != truck_weights.length && !queue.isEmpty()){
            if(queue.peek()[1] == time){
                sum -= queue.poll()[0];
            }
            if(sum + truck_weights[index] <= weight){
                queue.add(new int[]{truck_weights[index], time + bridge_length});
                System.out.println("큐에 넣은 값:" + truck_weights[index] + ", " + (time + bridge_length));
                sum += truck_weights[index];
                index++;
            }
            time++;
        }
        while(queue.size() != 1){
            queue.poll();
        }
        return queue.poll()[1];
    }
}