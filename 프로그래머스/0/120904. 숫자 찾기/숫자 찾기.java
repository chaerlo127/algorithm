class Solution {
    public int solution(int num, int k) {
        String[] numSize = String.valueOf(num).split("");
        for (int i = 0; i< numSize.length; i++){
            if(numSize[i].equals(String.valueOf(k))) return i + 1;
        }
        return -1;
    }
}