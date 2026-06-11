class Solution {
    public int[] solution(String myString) {
        String[] temp = myString.split("x");
        if(myString.charAt(myString.length() - 1) == 'x'){
            int[] answer = new int[temp.length + 1];
            for(int i=0;i<temp.length;i++){
                answer[i] = temp[i].length();
            }
            answer[temp.length] = 0;
            return answer;
        }
        int[] answer = new int[temp.length];
        for(int i=0;i<answer.length;i++){
            answer[i] = temp[i].length();
        }
        return answer;
    }
}