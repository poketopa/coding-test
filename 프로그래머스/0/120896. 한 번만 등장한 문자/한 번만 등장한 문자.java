class Solution {
    public String solution(String s) {
        String answer = "";
        int count =0;
        
            for(char j = 'a';j<='z';j++){
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i) == j){
                        count++;
                    }
                }    
                if(count==1){
                    answer+=j;
                }
                count = 0 ;
            }
            
            
        
        return answer;
    }
}