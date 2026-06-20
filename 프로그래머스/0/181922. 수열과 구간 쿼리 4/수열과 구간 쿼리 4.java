class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<arr.length;j++){
                if(queries[i][0] <= j && j <= queries[i][1] && j % queries[i][2] == 0){
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}