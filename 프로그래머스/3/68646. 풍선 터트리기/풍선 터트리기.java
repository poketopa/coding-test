import java.util.*;
class Solution {
    public int solution(int[] a) {
        if(a.length == 1) return 1;
        if(a.length == 2) return 2;
        int count = 2;
        // 작은 것 1번 가능
        // 왼쪽 오른쪽에 모두 작은 수가 있다면 터뜨릴 수 없음
        
        // 왼쪽은 min값 갱신하면 됨
        // 오른쪽은 우선순위 큐
        int[] arr = new int[a.length];
        Arrays.fill(arr, Integer.MAX_VALUE);
        int tempMin = arr[a.length-1];
        for(int i=arr.length-1;i>=0;i--){
            if(tempMin > a[i]) tempMin = a[i];
            arr[i] = tempMin;
        }
        int min = a[0];
        for(int i=1;i<a.length-1;i++){
            if(a[i] <= min || a[i] <= arr[i+1]) count++;
            if(min > a[i]) min = a[i];
        }
        return count;
    }
}