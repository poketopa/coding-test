import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book, (a, b) -> a.length() - b.length());
        Set<String> set = new HashSet<>();
        for(int i=0;i<phone_book.length;i++){
            for(int j=1;j<=phone_book[i].length();j++){
                if(set.contains(phone_book[i].substring(0, j))) return false;
            }
            set.add(phone_book[i]);
        }
        return true;
    }
}