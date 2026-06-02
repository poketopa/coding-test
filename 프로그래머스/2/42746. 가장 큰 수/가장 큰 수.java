import java.util .*;

class Solution {
    public String solution(int[] numbers) {
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strNumbers, (a, b) -> {
            return (b+a).compareTo(a+b);
        });
        String answer = "";
        for (String i : strNumbers) {
            answer += i;
        }
        if(strNumbers[0].equals("0")) return "0";
        return answer;
    }
}
// 올바른 정렬 34 3 30
// 34 30 3