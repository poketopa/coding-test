import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        List<String> list = new ArrayList<>();
        for(int i=0;i<answer.length;i++){
            if(answer[i].isEmpty()){
                continue;
            }
            list.add(answer[i]);
        }
        String[] an = new String[list.size()];
        for(int i=0;i<list.size();i++){
            an[i] = list.get(i);
        }
        Arrays.sort(an);
        return an;
    }
}