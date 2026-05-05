class Solution {
    public int solution(int n) {
        int sum = 0;
        if(n%2== 0){
            while(n>0){
                if(n%2 == 0)  sum += n*n;
                n--;
            }
        } else{
            while(n>0){
                if(n%2 == 1)  sum += n;
                n--;
            }
        }
        return sum;
    }
}