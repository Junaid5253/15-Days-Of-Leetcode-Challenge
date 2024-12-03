class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for(int i = 0;i<s.length() - 1;i++){
            if(i<s.length() && getValue(s.charAt(i)) < getValue(s.charAt(i+1)) ){
                result = result - getValue(s.charAt(i));
            }else{
                int value = getValue(s.charAt(i));
                result += value;
            }
            
        }
        return result + getValue(s.charAt(s.length() - 1));    
    }
    public int getValue(char button){
        switch(button){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}