class Solution {
    public String solution(String cipher, int code) {
        String[] str = cipher.split("");
        String answer = "";
        for(int i=code-1;i<str.length;i+=code){
            answer+= str[i];
        }
        return answer;
    }
}