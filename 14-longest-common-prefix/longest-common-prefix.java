class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        
        String prefix = strs[0]; //flower
        int prefixLen = prefix.length();
        for(int i = 1;i<strs.length;i++){
            String s = strs[i];
            while(prefixLen > s.length() || !prefix.equals(s.substring(0, prefixLen))){
                prefixLen--;
                if(prefixLen == 0){
                    return "";
                }
                prefix = prefix.substring(0, prefixLen);
            }
        }
        return prefix;
        
    }
}