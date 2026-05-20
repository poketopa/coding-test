class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            return arr;
        }
        int temp = 2;
        while(arr.length > temp){
            temp *= 2;
        }
        int[] answer = new int[temp];
        for(int i=0;i<arr.length;i++){
            answer[i] = arr[i];
        }
        return answer;
        
    }
}