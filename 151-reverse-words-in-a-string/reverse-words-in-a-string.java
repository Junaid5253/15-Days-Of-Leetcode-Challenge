class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String resStr = "";
        String[] word = s.split("\\s+");
        for(int i = word.length - 1;i>=0;i--){
            resStr += word[i] + " ";
        }
        return resStr.trim();
    }
}
