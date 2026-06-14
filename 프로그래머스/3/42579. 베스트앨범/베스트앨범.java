import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, List<int[]>> map = new HashMap<>();
        Map<String, Integer> sumMap = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(int i=0;i<genres.length;i++){
            if(!set.contains(genres[i])) { // 이미 존재하면 리스트에 더함
                map.put(genres[i], new ArrayList<>());
                set.add(genres[i]);
            }
            map.get(genres[i]).add(new int[]{i, plays[i]});
            sumMap.put(genres[i], sumMap.getOrDefault(genres[i], 0) + plays[i]);
        }
        List<String> list = new ArrayList<>();
        for(String i : set){
            list.add(i);
            Collections.sort(map.get(i), (a, b) -> {
                if(a[1] != b[1]){
                    return b[1] - a[1];
                }
                return a[0] - b[0];
            });
        }
        Collections.sort(list, (a, b) -> sumMap.get(b) - sumMap.get(a));
        List<Integer> answerList = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(map.get(list.get(i)).size() == 1){
                answerList.add(map.get(list.get(i)).get(0)[0]);
            } else {
                answerList.add(map.get(list.get(i)).get(0)[0]);
                answerList.add(map.get(list.get(i)).get(1)[0]);
                //Map<String, List<int[]>> map = new HashMap<>();
            }
        }
        int[] answer = new int[answerList.size()];
        for(int i=0;i<answer.length;i++) answer[i] = answerList.get(i);
        return answer;
    }
}