import java.util.*;

class Solution {
    public String solution(String new_id) {
        // 1 단계
        new_id = new_id.toLowerCase();
        // 2 단계
        new_id = new_id.replaceAll("[^0-9a-z-._]", "");
        // 3 단계
        new_id = new_id.replaceAll("\\.+", ".");
        // 4 단계
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        // 5 단계
        new_id = new_id.length() == 0 ? new_id + "a" : new_id;
        // 6 단계
        new_id = new_id.length() > 15 ? new_id.substring(0, 15) : new_id;
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        // 7 단계
        while (new_id.length() < 3){
            new_id += (char) (new_id.charAt(new_id.length()-1));
        }
        return new_id;
    }
}