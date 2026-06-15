import java.util.*;
class Solution {
    public int solution(int[] stones, int k) {
        // 길이 n에서 최대값이 가장 작은 곳
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for(int i=0;i<k;i++){
            pq.add(new int[]{i, stones[i]});
        }
        int min = pq.peek()[1];
        for(int i=k;i<stones.length;i++) {
            pq.add(new int[]{i ,stones[i]});
            while(pq.peek()[0] + k - 1 < i) {
                 pq.poll();
            }
            min = Math.min(min, pq.peek()[1]);
        }
        return min;
    }
}