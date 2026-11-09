class Solution {
    public int[] solution(int brown1, int yellow1) {
        for(int i=3;i<Integer.MAX_VALUE;i++){
            for(int j=3;j<=i;j++){
                int yellow = (i-2) * (j-2);
                int brown = (i * j) - yellow;
                if(yellow == yellow1 && brown == brown1) return new int[]{i, j};
            }
        }
        return new int[]{};
    }
}