import java.util.*;
class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        Map<String, String> map = new HashMap<>();
        Map<String, Integer> moneyMap = new HashMap<>();
        for(int i=0;i<enroll.length;i++){
            if(referral[i].equals("-")) {
                map.put(enroll[i], "center");
            } else {
                map.put(enroll[i], referral[i]);
            }
        }
        
        for(int i=0;i<seller.length;i++){
            int price = amount[i] * 100;
            String name = seller[i];
            while(true) {
                if(price >= 10){
                    moneyMap.put(name, moneyMap.getOrDefault(name, 0) + price - (price / 10));
                } else {
                    moneyMap.put(name, moneyMap.getOrDefault(name, 0) + price);
                    break;
                }
                if(name.equals("center")) {
                        break;
                    }
                    price /= 10;
                    name = map.get(name);
            }
        }
        int[] answer = new int[enroll.length];
        for(int i=0;i<enroll.length;i++){
            answer[i] = moneyMap.getOrDefault(enroll[i], 0);
        }
        return answer;
    }
}