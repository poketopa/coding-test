import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for(int i=0;i<a.length();i++){
            char temp = a.charAt(i);
            if('A' <= temp && temp <= 'Z'){
                answer += (char)('a' + (temp - 'A'));
            } else {
                answer += (char)('A' + (temp - 'a'));
            }
        }
        System.out.print(answer);
    }
}