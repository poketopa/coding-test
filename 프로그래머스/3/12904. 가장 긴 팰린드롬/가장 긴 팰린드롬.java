class Solution
{
    public int solution(String s)
    {
        int max = -1;
        boolean flag = true;
        String[] temp = s.split("");
        for(int i=0;i<temp.length;i++){
            int count = 0;
            while(true){
                if(0 <= i - count
                  && i + count < temp.length
                  && temp[i-count].equals(temp[i+count])){
                    count++;
                } else{
                    if(max < count) {
                        max = count;
                        flag = true;
                    }
                    break;
                }
            }
        }
        for(int i=0;i<temp.length-1;i++){
            int count = 0;
            while(true) {
                if(0 <= i - count
                  && i + 1 + count < temp.length
                  && temp[i-count].equals(temp[i+count+1])){
                    count++;
                } else {
                    if(max <= count) {
                        max = count;
                        flag = false;    
                    }
                    break;
                }
            }
        }
        if(flag) {
            return max * 2 - 1;    
        } else {
            return max * 2;
        }
        
    }
}