class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int i=0;i<queries.length;i++){
            String temp = "";
            temp += my_string.substring(0, queries[i][0]);
            for(int j=queries[i][1];j>=queries[i][0];j--){
                temp += my_string.charAt(j);
            }
            temp += my_string.substring(queries[i][1] + 1);
            my_string = temp;
        }
        return my_string;
    }
}