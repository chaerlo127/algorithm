import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] aList = a.split("");
        
        for (String as : aList){
            System.out.println(as);
        }
    }
}