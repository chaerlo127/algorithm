class Solution {
    public int solution(String str1, String str2) {
        int size1 = str1.length();
        str1 = str1.replace(str2, "");
        return size1 == str1.length() ? 2 : 1;
    }
}