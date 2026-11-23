class Solution {
    public int solution(int n) {
        int max = 1111111;
        for (int i =n-1;i>0;i--){
            if (n % i == 1){
                max = i;
            }
        }
        return max;
    }
}