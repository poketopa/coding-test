class Solution {
    public long solution(int[] sequence) {
        int temp = 1;
        long[] arr1 = new long[sequence.length];
        long[] arr2 = new long[sequence.length];
        for(int i=0;i<sequence.length;i++){
            arr1[i] = sequence[i] * temp;
            arr2[i] = sequence[i] * -temp;
            temp *= -1;
        }
        long[] dp1 = new long[arr1.length];
        long[] dp2 = new long[arr1.length];
        
        dp1[0] = arr1[0];
        dp2[0] = arr2[0];
        long max1 = dp1[0];
        long max2 = dp2[0];
        for(int i=1;i<sequence.length;i++){
            if(dp1[i-1] + arr1[i] < arr1[i]){
                dp1[i] = arr1[i];
            } else {
                dp1[i] = dp1[i-1] + arr1[i];
            }
            
            if(dp2[i-1] + arr2[i] < arr2[i]){
                dp2[i] = arr2[i];
            } else {
                dp2[i] = dp2[i-1] + arr2[i];
            }
            max1 = Math.max(max1, dp1[i]);
            max2 = Math.max(max2, dp2[i]);
        }
        return Math.max(max1, max2);
    }
}