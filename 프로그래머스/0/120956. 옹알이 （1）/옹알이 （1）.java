class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0;i<babbling.length;i++){
            babbling[i] = babbling[i].replace("aya"," ");
            babbling[i]=babbling[i].replace("ye"," ");
            babbling[i]= babbling[i].replace("woo"," ");
            babbling[i] = babbling[i].replace("ma"," ");
            
            babbling[i] = babbling[i].replaceAll(" ","");
            if(babbling[i].length()== 0){
                answer++;
            }
        }
        return answer;
    }
}