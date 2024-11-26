class Solution {
    public String reverseStr(String s, int k) {
        char[] array = s.toCharArray();  
        
        for (int i = 0; i < array.length; i += 2 * k) {
            
            int left = i;
            int right = Math.min(i + k - 1, array.length - 1); 
            while (left < right) {
                char temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        return new String(array);
    }
}