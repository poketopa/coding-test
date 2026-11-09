import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        // 기본 시간 / 기본 요금 / 단위 / 단위 요금
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> sumMap = new HashMap<>();
        
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<records.length;i++) {
            if(!set.contains(getNumber(records[i]))){ // 처음 보는 것 (입차)
                set.add(getNumber(records[i]));
                map.put(getNumber(records[i]), getTime(records[i]));
            } else {
                int carNumber = getNumber(records[i]);
                int inTime = map.get(carNumber);
                int outTime = getTime(records[i]);
                set.remove(getNumber(records[i]));
                int parkTime = outTime - inTime;
                sumMap.put(carNumber, sumMap.getOrDefault(carNumber, 0) + parkTime);
            }
        }
        // 안나간차
        for(int i : set) {
            System.out.println("안나간 차 이름: " + i);
            System.out.println(i + "의 주차 시간: " + map.get(i));
            int inTime = map.get(i);
            int outTime = 23 * 60 + 59;
            System.out.println("닫는 시간: " + outTime);
            int parkTime = outTime - inTime;
            sumMap.put(i, sumMap.getOrDefault(i, 0) + parkTime);
        }
        List<Integer> list = new ArrayList<>(sumMap.keySet());
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            int time = sumMap.get(list.get(i));
            System.out.println("차 이름: " + list.get(i));
            System.out.println("총 시간: " + time);
            if(time <= fees[0]) {
                answer[i] = fees[1];
                continue;
            }
            int sum = fees[1];
            time -= fees[0];
            System.out.println("기본요금: " + sum);
            sum += ((time + (fees[2] - 1)) / fees[2]) * fees[3];
            answer[i] = sum;
            
            
            System.out.println("총 가격: " + sum);
        }
        return answer;
    }
    
    public int getTime(String input) {
        String[] temp = input.split(" ")[0].split(":");
        return (Integer.parseInt(temp[0]) * 60) + Integer.parseInt(temp[1]);
    }
    public int getNumber(String input) {
        return Integer.parseInt(input.split(" ")[1]);
    }
}