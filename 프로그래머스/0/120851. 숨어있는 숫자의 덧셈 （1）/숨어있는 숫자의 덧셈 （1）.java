class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-z&A-Z]", "");
        String[] mys = my_string.split("");
        int answer = 0;
        for (String my : mys){
            answer += Integer.parseInt(my);
        }
        return answer;
    }
}