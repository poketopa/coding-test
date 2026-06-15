import java.util.*;
class Solution {
    public int solution(int[] stones, int k) {
        int max = -1;
        for(int i : stones) max = Math.max(max, i);
        
        return search(1, max, stones, k);
    }
    
    public int search(int start, int end, int[] stones, int k){
        if(start >= end){
            return start;
        }
        int mid = (start + end) / 2;
        
        int[] after = new int[stones.length];
        for(int i=0;i<stones.length;i++) {
            after[i] = stones[i] - mid;
        }
        int count = count(after, k);
        if(count >= k) {
            return search(start, mid, stones, k);
        } else {
            return search(mid + 1, end, stones, k);
        }
    }
    
    public int count(int[] stones, int k){
        int maxLength = -1;
        int tempCount = 0;
        for(int i=0;i<stones.length;i++){
            if(stones[i] <= 0){
                tempCount++;
            } else {
                tempCount = 0;
            }
            maxLength = Math.max(maxLength, tempCount);
        }
        return maxLength;
    }
}