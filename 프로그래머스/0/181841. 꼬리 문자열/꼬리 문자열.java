import java.util.*;
class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i=0;i<str_list.length;i++){
            if(str_list[i].length() != str_list[i].replace(ex, "").length()) continue;
            answer += str_list[i];
        }
        return answer;
    }
}