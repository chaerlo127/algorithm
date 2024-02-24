class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] myList = my_string.split("");
        for (int i = 0 ; i < myList.length ; i++){
            if(myList[i].equals("a") || myList[i].equals("e") || myList[i].equals("i") || myList[i].equals("o") || myList[i].equals("u")) continue;
            else answer += myList[i];
        }
        return answer;
    }
}