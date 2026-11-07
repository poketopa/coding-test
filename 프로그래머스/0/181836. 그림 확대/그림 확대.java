import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for(int i=0;i<picture.length;i++){
            String temp = "";
            for(int l=0;l<picture[0].length();l++){
                for(int j=0;j<k;j++){
                    temp += String.valueOf(picture[i].charAt(l));
                }       
            }
            for(int j=0;j<k;j++){
                answer[k * i + j] = temp;
            }
        }
        return answer;
    }
}