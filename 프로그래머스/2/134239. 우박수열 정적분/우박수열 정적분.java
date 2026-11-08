import java.util.*;
class Solution {
    public double[] solution(int k, int[][] ranges) {
        List<Integer> result = new ArrayList<>();
        while(true) {
            result.add(k);
            if(k == 1) break;
            if(k % 2 == 0) k /= 2;
            else if(k % 2 == 1) k = (k * 3) + 1;
        }
        List<Double> list = new ArrayList<>();
        for(int i=0;i<result.size()-1;i++){
            list.add(((double)result.get(i) + (double)result.get(i + 1)) / (double)2);
        }
        double[] answer = new double[ranges.length];
        for(int i=0;i<ranges.length;i++) ranges[i][1] = list.size() + ranges[i][1];
        for(int i=0;i<ranges.length;i++){
            if(ranges[i][1] < ranges[i][0]) {
                answer[i] = -1;
                continue;
            }
            if(ranges[i][1] == ranges[i][0] ) {
                answer[i] = 0;
                continue;
            }
            double sum = 0;
            for(int j=ranges[i][0];j<ranges[i][1];j++){
                sum += list.get(j);
            }
            answer[i] = sum;
        }
        return answer;
    }
}