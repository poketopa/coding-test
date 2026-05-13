class Solution {
    public int solution(int[] date1, int[] date2) {
        // 1. 연도 비교
        if (date1[0] < date2[0]) return 1;
        if (date1[0] > date2[0]) return 0;
        
        // 2. 연도가 같을 경우 월 비교
        if (date1[1] < date2[1]) return 1;
        if (date1[1] > date2[1]) return 0;
        
        // 3. 연도와 월이 같을 경우 일 비교
        if (date1[2] < date2[2]) return 1;
        
        return 0;
    }
}