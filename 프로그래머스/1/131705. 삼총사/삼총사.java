class Solution {
    public int solution(int[] number) {
        int count = 0;
        for(int i=0;i<number.length-2;i++){
            int sum1 = number[i];
            for(int j=i+1;j<number.length-1;j++){
                int sum2 = sum1 + number[j];
                for(int k=j+1;k<number.length;k++){
                    int sum3 = sum2 + number[k];
                    if(sum3 == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}