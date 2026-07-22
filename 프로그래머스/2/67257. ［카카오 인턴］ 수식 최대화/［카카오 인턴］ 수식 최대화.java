import java.util.*;
class Solution {
    static Long max = Long.MIN_VALUE;
    public long solution(String expression) {
        max = Long.MIN_VALUE;
        List<Long> numberList = new ArrayList<>();
        List<Character> mathList = new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*') {
                mathList.add(expression.charAt(i));
            }
        }
        expression = expression.replace("+", ".");
        expression = expression.replace("-", ".");
        expression = expression.replace("*", ".");
        String[] split = expression.split("\\.");
        for(String i : split) numberList.add(Long.parseLong(i));
        
        max = Math.max(max, test(new ArrayList<>(numberList), new ArrayList<>(mathList), new char[]{'+', '-', '*'}));
        max = Math.max(max, test(new ArrayList<>(numberList), new ArrayList<>(mathList), new char[]{'+', '*', '-'}));
        max = Math.max(max, test(new ArrayList<>(numberList), new ArrayList<>(mathList), new char[]{'-', '+', '*'}));
        max = Math.max(max, test(new ArrayList<>(numberList), new ArrayList<>(mathList), new char[]{'-', '*', '+'}));
        max = Math.max(max, test(new ArrayList<>(numberList), new ArrayList<>(mathList), new char[]{'*', '-', '+'}));
        max = Math.max(max, test(new ArrayList<>(numberList), new ArrayList<>(mathList), new char[]{'*', '+', '-'}));
        return max;
    }
    
    public Long test(List<Long> numberList, List<Character> mathList, char[] priority) {
        for(char k : priority) {
            for(int i=0;i<mathList.size();i++){
                if(mathList.get(i) == k){
                    mathList.remove(i);
                    if(k == '+'){
                        numberList.set(i, numberList.get(i) + numberList.get(i + 1));
                        numberList.remove(i + 1);
                    }
                    if(k == '-'){
                        numberList.set(i, numberList.get(i) - numberList.get(i + 1));
                        numberList.remove(i + 1);
                    }
                    if(k == '*'){
                        numberList.set(i, numberList.get(i) * numberList.get(i + 1));
                        numberList.remove(i + 1);
                    }
                    i--;
                }
            }
        }
        return Math.abs(numberList.get(0));
    }
}