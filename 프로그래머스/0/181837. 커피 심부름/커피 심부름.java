class Solution {
    public int solution(String[] order) {
        int sum = 0;
        for(String i : order){
            if(i.equals("iceamericano")
              || i.equals("americanoice")
              || i.equals("hotamericano")
              || i.equals("americanohot")
              || i.equals("americano")
               || i.equals("anything")) sum += 4500;
            else sum += 5000;
        }
        return sum;
    }
}