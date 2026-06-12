class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        
        return search(1, 100000, diffs, times, limit);
    }
    
    public int search(int start, int end, int[] diffs, int[] times, long limit){
        int mid = (start + end) / 2;
        if(start >= end){
            return start;
        }
        
        long timeSum = 0;
        for(int i=0;i<diffs.length;i++){
            if(diffs[i] > mid){
                timeSum += (times[i] + times[i-1]) * (diffs[i] - mid) + times[i];
            } else {
                timeSum += times[i];
            }
        }
        if(timeSum <= limit){ // 세이프 -> 레벨이 높음!
            return search(start, mid, diffs, times, limit);
        } else {
            return search(mid + 1, end, diffs, times, limit);
        }
        
    }
}