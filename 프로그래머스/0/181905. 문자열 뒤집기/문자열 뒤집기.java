class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        answer += my_string.substring(0, s);
        for(int i=e;i>=s;i--){
            answer += my_string.charAt(i);
        }
        answer += my_string.substring(e + 1);
        return answer;
    }
}