import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("b", "a");
        myStr = myStr.replace("c", "a");
        
        String[] temp = myStr.split("a");
        List<String> list = new ArrayList<>();
        for(String i : temp){
            if(i.isBlank()) continue;
            list.add(i);
        }
        String[] answer = new String[list.size()];
        for(int i=0;i<list.size();i++) answer[i] = list.get(i);
        if(answer.length == 0) return new String[]{"EMPTY"};
        return answer;
    }
}