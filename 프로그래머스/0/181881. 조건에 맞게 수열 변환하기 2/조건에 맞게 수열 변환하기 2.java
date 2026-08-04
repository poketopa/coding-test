class Solution {
    public int solution(int[] arr) {
        int count = 0; // 반복 횟수 (x)
        
        while (true) {
            boolean changed = false; // 이번 턴에서 배열에 변화가 있었는지 체크
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    changed = true; // 값이 변했음을 기록
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1; // 주의: 문제 조건대로 1을 더해줌
                    changed = true; // 값이 변했음을 기록
                }
            }
            
            // 배열을 전체 순회했는데 단 하나의 값도 변하지 않았다면?
            // 현재 배열 arr(x)가 다음 배열 arr(x+1)과 같다는 의미이므로 종료
            if (!changed) {
                break;
            }
            
            // 변화가 있었다면 반복 횟수 증가 후 다시 while(true) 반복
            count++;
        }
        
        return count;
    }
}
