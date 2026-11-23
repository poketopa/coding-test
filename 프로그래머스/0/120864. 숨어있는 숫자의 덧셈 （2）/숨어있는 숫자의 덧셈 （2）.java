import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(char i = 'A';i<='z';i++){
            my_string = my_string.replace(Character.toString(i)," ");    
        }
        String[] array = my_string.split(" ");
        for(int i=0;i<array.length;i++){
            if(array[i].equals("")){
                continue;
            }
            else{
                answer+= Integer.valueOf(array[i]);
            }
        }
        
        
        return answer;
    }
}