import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<priorities.length;i++){
            queue.add(new int[]{priorities[i], i});
        }
        Arrays.sort(priorities);
        for(int i=0;i<priorities.length/2;i++){
            int temp = priorities[i];
            priorities[i] = priorities[priorities.length-1-i];
            priorities[priorities.length-1-i] = temp;
        }
        int count = 1;
        for(int i=0;i<priorities.length;i++){
            while(true){
                int[] temp = queue.poll();
                if(temp[0] == priorities[i]){
                    if(temp[1] == location) return count;
                    break;
                } else{
                    queue.add(temp);
                }
            }
            count++;
        }
        return 0;
    }
}