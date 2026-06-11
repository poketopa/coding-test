import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        Set<Integer> set = new HashSet<>();
        for(int i : indices) set.add(i);
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            if(set.contains(i)) continue;
            answer += my_string.charAt(i);
        }
        return answer;
    }
}